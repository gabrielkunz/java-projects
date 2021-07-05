package assignment04;

import java.util.*;

public class Assignment04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer option = -1;
        
        List<Branch> all_branches = new ArrayList<>();
        List<Sector> all_sectors = new ArrayList<>();
        List<Department> all_departments = new ArrayList<>();
        List<JobRole> all_job_roles = new ArrayList<>();
        List<Employee> all_employees = new ArrayList<>();
        
        // Manual entries for testing
        Branch RS = new Branch("RS", "Porto Alegre, Rio Grande do Sul");
        all_branches.add(RS);
        Branch SP = new Branch("SP", "Sao Paulo, Sao Paulo");
        all_branches.add(SP);
        
        Sector LO = new Sector("Logistics", RS);
        all_sectors.add(LO);
        Sector HR = new Sector("Human Resources", SP);
        all_sectors.add(HR);
        
        Department distribution = new Department("Distribution Center", LO, "Distribution of goods outside the storage.");
        all_departments.add(distribution);
        
        JobRole director_dstr = new JobRole("Director of Distribution", distribution);
        all_job_roles.add(director_dstr);
        JobRole driver_dstr = new Driver("Distribution Driver", distribution, "123");
        all_job_roles.add(driver_dstr);
        
        all_employees.add(new Employee("Jane", "Alice", "", "123", "0111", (float) 1500, director_dstr, 2)) ;
        all_employees.add(new Employee("Michael", "Sabrina", "John", "432", "0112", (float) 900, driver_dstr, 1));
        
        // Terminal menu
        while (option != 4) {
            System.out.println("Select an option:");
            System.out.println("1 - Log new employee");
            System.out.println("2 - Display all employees");
            System.out.println("4 - Exit");
            
            option = sc.nextInt();
            // Clear terminal
            System.out.print("\033[H\033[2J");
            
            switch (option) {
                case 1:
                    try {
                        newEmployee(all_branches, all_sectors, all_departments, 
                            all_job_roles, all_employees);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    displayEmployees(all_employees);
                    break;
                default:
                    break;
                    
            }
        }
        
        sc.close();
    }
    
    public static void newEmployee(List<Branch> all_branches, List<Sector> all_sectors,
            List<Department> all_departments, List<JobRole> all_job_roles, 
            List<Employee> all_employees) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        String name;
        String mothers_name;
        String fathers_name;
        String cpf;
        String employee_id;
        Float base_salary;
        Integer job_role;
        Integer num_children;
        Integer index_branch;
        Integer index_sector;
        
        // Personal information
        System.out.println("Enter employee name:");
        name = sc.nextLine();
        if (name.equals("")) {
            throw new Exception(">> Error: Name cannot be empty.");
        }

        System.out.println("Enter employee mother's name:");
        mothers_name = sc.nextLine();
        if (mothers_name.equals("")) {
            throw new Exception(">> Error: Mother's name cannot be empty.");
        }

        System.out.println("Enter employee fathers's name (optional):");
        fathers_name = sc.nextLine();

        System.out.println("Enter employee CPF:");
        cpf = sc.nextLine();
        if (!checkCPF(cpf)) {
            throw new Exception(">> Error: Invalid CPF.");
        }

        System.out.println("Enter employee ID:");
        employee_id = sc.nextLine();
        if (employee_id.equals("")) {
            throw new Exception(">> Error: ID name cannot be empty.");
        }

        System.out.println("Enter employee base salary (BRL)");
        base_salary = sc.nextFloat();
        if (base_salary < 1000) {
            throw new Exception(">> Error: Base salary cannot be less than 1.000 BRL");
        }


        System.out.println("Enter employee number of children under 18:");
        num_children = sc.nextInt();
        if (num_children < 0) {
            num_children = 0;
        }
        
        // Job information
        System.out.println("Select a branch:");
        all_branches.forEach(br -> {
            System.out.println("\t" + all_branches.indexOf(br) + " - " + br.getBranchName());
        });
        index_branch = sc.nextInt();
        if (index_branch > all_branches.size()) {
            throw new Exception(">> Error: Invalid branch.");
        }

        System.out.println("Select a sector:");
        all_sectors.forEach(sctr -> {
            if (sctr.getBranch() == all_branches.get(index_branch)) {
                System.out.println("\t" + all_sectors.indexOf(sctr) + " - " + sctr.getSectorName());
            }
        });
        index_sector = sc.nextInt();
        if (index_branch > all_branches.size()) {
            throw new Exception(">> Error: Invalid sector.");
        }
    }
    
    public static void displayEmployees(List<Employee> all_employees) {
        all_employees.forEach(employee -> {
            System.out.println(employee.getInfo());
        });
    }
    
    public static boolean checkCPF(String cpf) {
        boolean is_cpf_valid = true;
        char dig10, dig11;
        int sum, i, remainder, num, weight;

        if (cpf.equals("00000000000") ||
            cpf.equals("11111111111") ||
            cpf.equals("22222222222") || cpf.equals("33333333333") ||
            cpf.equals("44444444444") || cpf.equals("55555555555") ||
            cpf.equals("66666666666") || cpf.equals("77777777777") ||
            cpf.equals("88888888888") || cpf.equals("99999999999") ||
            (cpf.length() != 11)) {
            is_cpf_valid = false;
        }

        try {
            // 1st digit
            sum = 0;
            weight = 10;
            for (i=0; i<9; i++) {
                num = (int)(cpf.charAt(i) - 48);
                sum = sum + (num * weight);
                weight = weight - 1;
            }

            remainder = 11 - (sum % 11);
            if ((remainder == 10) || (remainder == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char)(remainder + 48);
            }

            // 2nd digit
            sum = 0;
            weight = 11;
            for (i=0; i<10; i++) {
                num = (int)(cpf.charAt(i) - 48);
                sum = sum + (num * weight);
                weight = weight - 1;
            }

            remainder = 11 - (sum % 11);
            if ((remainder == 10) || (remainder == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char)(remainder + 48);
            }

        // Verify digits
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))){
                is_cpf_valid = true; 
            } else {
                is_cpf_valid = false; 
            }
        } catch (InputMismatchException exception) {
                return(false);
        }
        
        return is_cpf_valid;
    }
    
}
