package assignment04;

public class Employee extends Person{
    private String employee_id;
    private Float base_salary;
    private JobRole job_role;
    private Integer num_children;

    public Employee(String name, String mothers_name, String fathers_name, String cpf) {
        super(name, mothers_name, fathers_name, cpf);
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
}
