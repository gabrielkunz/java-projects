package assignment04;

public class Employee extends Person{
    private String employee_id;
    private Float base_salary;
    private JobRole job_role;
    private Integer num_children;

    public Employee(String name, String mothers_name, String fathers_name, String cpf, String cnh, String employee_id, Float base_salary, JobRole job_role, Integer num_children) {
        super(name, mothers_name, fathers_name, cpf, cnh);
        setEmployeeID(employee_id);
        setBaseSalary(base_salary);
        setJobRole(job_role);
        setNumberOfChildren(num_children);
    }

    public void setEmployeeID(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployeeID() {
        return employee_id;
    }

    public void setBaseSalary(Float base_salary) {
        this.base_salary = base_salary;
    }

    public Float getBaseSalary() {
        return base_salary;
    }

    public void setJobRole(JobRole job_role) {
        this.job_role = job_role;
    }

    public JobRole getJobRole() {
        return job_role;
    }

    public void setNumberOfChildren(Integer num_children) {
        this.num_children = num_children;
    }

    public Integer getNumberOfchildren() {
        return num_children;
    }

    public String getInfo() {
        String employee_information = "Employee Information:";
        employee_information = employee_information + "\n\tName: " + this.getName();
        employee_information = employee_information + "\n\tMother's name: " + this.getMothersName();
        employee_information = employee_information + "\n\tFathers's name: " + this.getFathersName();
        employee_information = employee_information + "\n\tCPF: " + this.getCPF();
        employee_information = employee_information + "\n\tCNH: " + this.getCNH();
        employee_information = employee_information + "\n\tNumber of children under 18: " + this.getNumberOfchildren();
        employee_information = employee_information + "\n\tID: " + this.getEmployeeID();
        employee_information = employee_information + "\n\tBase salary: " + this.getBaseSalary();
        employee_information = employee_information + "\n\tJob Role: " + this.getJobRole().getRoleName();
        employee_information = employee_information + "\n\tDepartment: " + this.getJobRole().getDepartment().getDpName();
        employee_information = employee_information + "\n\tSector: " + this.getJobRole().getDepartment().getSector().getSectorName();
        employee_information = employee_information + "\n\tBranch: " + this.getJobRole().getDepartment().getSector().getBranch().getBranchName();

        return employee_information;
    }
}
