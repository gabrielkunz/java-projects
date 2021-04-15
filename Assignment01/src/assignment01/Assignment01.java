package assignment01;

public class Assignment01 {
    public static void main(String[] args) {
        int index;
        index = 1;
        Integer[] managers_ids;
        managers_ids = new Integer[3];
        managers_ids[0] = 100101;
        
        PeopleManager people_manager01 = new PeopleManager();
        PeopleManager people_manager02 = new PeopleManager();
        PrincipalEngineer principal_engineer01 = new PrincipalEngineer();
        ProjectManager project_manager01 = new ProjectManager();
        
        // People Manager
        people_manager01.setEmployeeName("Gabriel");
        people_manager01.setEmployeeID(100102);
        try {
            people_manager01.setManagerID(100101, managers_ids, index);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        people_manager01.setDirectReports(1);
        managers_ids[index] = people_manager01.getEmployeeID();
        index++;
        
        // People Manager
        people_manager02.setEmployeeName("John");
        people_manager02.setEmployeeID(100103);
        try {
            people_manager02.setManagerID(100102, managers_ids, index);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        people_manager02.setDirectReports(2);
        managers_ids[2] = people_manager02.getEmployeeID();
        index++;
        
        // Principal Engineer
        principal_engineer01.setEmployeeName("Cirilla");
        principal_engineer01.setEmployeeID(100104);
        try {
            principal_engineer01.setManagerID(100103, managers_ids, index);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        principal_engineer01.setActiveCases(5);
        principal_engineer01.setParallelRoles(2);
        
        // Project Manager
        project_manager01.setEmployeeName("Charles");
        project_manager01.setEmployeeID(100105);
        try {
            project_manager01.setManagerID(100107, managers_ids, index);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        project_manager01.setActiveProjects(2);
        project_manager01.setDirectReports(8);
        
        // Print results
        System.out.println("Employee: " + people_manager01.getEmployeeName() 
                + ", ID: " + people_manager01.getEmployeeID() + ", Position: "
                + people_manager01.getClass().getSimpleName()+ ", Manager ID: " 
                + people_manager01.getManagerID()
                + ", Direct Reports: " + people_manager01.getDirectReports());
        System.out.println("Employee: " + people_manager02.getEmployeeName() 
                + ", ID: " + people_manager02.getEmployeeID() + ", Position: "
                + people_manager02.getClass().getSimpleName()+ ", Manager ID: " 
                + people_manager02.getManagerID()
                + ", Direct Reports: " + people_manager02.getDirectReports());
        System.out.println("Employee: " + principal_engineer01.getEmployeeName() 
                + ", ID: " + principal_engineer01.getEmployeeID() + ", Position: "
                + principal_engineer01.getClass().getSimpleName()+ ", Manager ID: "
                + principal_engineer01.getManagerID()
                + ", Active Cases: " + principal_engineer01.getActiveCases()
                + ", Parallel Roles: " + principal_engineer01.getParallelRoles());
        System.out.println("Employee: " + project_manager01.getEmployeeName() 
                + ", ID: " + project_manager01.getEmployeeID() + ", Position: "
                + project_manager01.getClass().getSimpleName()+ ", Manager ID: "
                + project_manager01.getManagerID()
                + ", Active Projects: " + project_manager01.getActiveProjects()
                + ", Direct Reports: " + project_manager01.getDirectReports());
    }
}
