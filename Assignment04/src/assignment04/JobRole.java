package assignment04;

public class JobRole {
    private String role_name;
    private Department department;

    public JobRole(String role_name, Department department){
        setRoleName(role_name);
        setDepartment(department);
    }

    public void setRoleName(String role_name) {
        this.role_name = role_name;
    }

    public String getRoleName() {
        return role_name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }
}