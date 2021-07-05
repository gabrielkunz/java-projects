package assignment04;

public class JobRole {
    private String role_name;
    private Department department;
    private Boolean CNH_required;

    public JobRole(String role_name, Department department, Boolean CNH_required){
        setRoleName(role_name);
        setDepartment(department);
        setCNHRequired(CNH_required);
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

    public void setCNHRequired(Boolean CNH_required) {
        this.CNH_required = CNH_required;
    }

    public Boolean getCNHRequired() {
        return CNH_required;
    }
}