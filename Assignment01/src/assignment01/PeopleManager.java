package assignment01;

public class PeopleManager extends Employee {
    private Integer direct_reports;
    
    public void setDirectReports(Integer direct_reports) {
        this.direct_reports = direct_reports;
    }
    
    public Integer getDirectReports() {
        return this.direct_reports;
    }
}
