package assignment04;

public class Driver extends JobRole {
    private String cnh_number;

    public Driver(String role_name, Department department, String cnh_number) {
        super(role_name, department);
        setCNH(cnh_number);
    }

    public void setCNH(String cnh_number) {
        this.cnh_number = cnh_number;
    }

    public String getCNH() {
        return cnh_number;
    }
}
