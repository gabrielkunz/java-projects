package assignment04;

public class Branch {
    private String branch_name;
    private String location;

    public Branch(String branch_name, String location) {
        setBranchName(branch_name);
        setLocation(location);
    }

    public void setBranchName(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getBranchName() {
        return branch_name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
