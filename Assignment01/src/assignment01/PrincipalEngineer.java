package assignment01;

public class PrincipalEngineer extends Employee {
    private Integer active_cases;
    private Integer parallel_roles;
    
    public void setActiveCases(Integer active_cases) {
        this.active_cases = active_cases;
    }
    
    public Integer getActiveCases() {
        return this.active_cases;
    }

    public void setParallelRoles(Integer parallel_roles) {
        this.parallel_roles = parallel_roles;
    }
    
    public Integer getParallelRoles() {
        return this.parallel_roles;
    }
}