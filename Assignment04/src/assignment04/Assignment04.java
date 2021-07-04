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
        
        Branch RS = new Branch("RS", "Porto Alegre, Rio Grande do Sul");
        all_branches.add(RS);
        
        Sector LO = new Sector("Logistics", RS);
        all_sectors.add(LO);
        
        Department distribution = new Department("Distribution Center", LO, "Distribution of goods outside the storage.");
        all_departments.add(distribution);
        
        JobRole director_dstr = new JobRole("Director of Distribution", distribution);
        all_job_roles.add(director_dstr);
        JobRole driver_dstr = new Driver("Distribution Driver", distribution, "123");
        all_job_roles.add(driver_dstr);
        
        all_employees.add(new Employee("Jane", "Alice", "", "123", "0111", (float) 1500, director_dstr, 2)) ;
        all_employees.add(new Employee("Michael", "Sabrina", "John", "432", "0112", (float) 900, driver_dstr, 1));
        
        
        while (option != 4) {
            System.out.println("Select an option:");
            System.out.println("1 - Log new employee");
            System.out.println("2 - Display all employees");
            System.out.println("4 - Exit");
            
            option = sc.nextInt();
            
            switch (option) {
                case 1:
                    newEmployee(all_branches, all_sectors, all_departments, 
                            all_job_roles, all_employees);
                    break;
                case 2:
                    displayEmployees(all_employees);
                    break;
                default:
                    break;
                    
            }
            
        }
        
    }
    
    public static void newEmployee(List<Branch> all_branches, List<Sector> all_sectors,
            List<Department> all_departments, List<JobRole> all_job_roles, 
            List<Employee> all_employees) {
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
        
        // Personal information
        System.out.println("Enter employee name:");
        name = sc.nextLine();
        System.out.println("Enter employee mother's name:");
        mothers_name = sc.nextLine();
        System.out.println("Enter employee fathers's name (optional):");
        fathers_name = sc.nextLine();
        System.out.println("Enter employee CPF:");
        cpf = sc.nextLine();
        System.out.println("Enter employee ID:");
        employee_id = sc.nextLine();
        System.out.println("Enter employee base salary");
        base_salary = sc.nextFloat();
        System.out.println("Enter employee number of children under 18:");
        num_children = sc.nextInt();
        
        // Job information
        System.out.println("Select a branch:");
        all_branches.forEach(branch -> {
            int i = 1;
            System.out.println("\t" + i + " - " + branch.getBranchName());
            i++;
        });
        index_branch = sc.nextInt();
        
    }
    
    public static void displayEmployees(List<Employee> all_employees) {
        all_employees.forEach(employee -> {
            System.out.println(employee.getInfo());
        });
    }
    
    public static void checkCPF(String cpf) throws Exception {
        
    }
    
}
