package assignment01;

import java.util.Objects;

abstract public class Employee {
    private String employee_name;
    private Integer manager_id = 0;
    private Integer employee_id;
    private Boolean manager_exists = false;
    
    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name.toUpperCase().trim();
    }
    
    String getEmployeeName() {
        return this.employee_name;
    }

    public void setManagerID(Integer manager_id, Integer[] managers_ids, int index) throws Exception {
        for (Integer element : managers_ids) {
            if (Objects.equals(element, manager_id)) {
                manager_exists = true;
            }
        }
            
        if (manager_exists) {
            this.manager_id = manager_id;
        } else {
            throw new Exception("Error: Manager ID " + manager_id 
                    + " not found and therefore not assigned to employee " 
                    + this.employee_id + ".");
        }
    }
    
    public Integer getManagerID() {
        return this.manager_id;
    }
    
    public void setEmployeeID(Integer employee_id) {
        this.employee_id = employee_id;
    }
    
    public Integer getEmployeeID() {
        return this.employee_id;
    }
}
