package assignment01;

public class ProjectManager extends Employee {
    private Integer active_projects;
    private Integer direct_reports;
    
    public void setActiveProjects(Integer active_projects) {
        this.active_projects = active_projects;
    }
    
    public Integer getActiveProjects() {
        return this.active_projects;
    }
    
    public void setDirectReports(Integer direct_reports) {
        this.direct_reports = direct_reports;
    }
    
    public Integer getDirectReports() {
        return this.direct_reports;
    }
}
