package assignment04;

public class Branch {
    private String branch_name;
    private String location;

    public Branch(String branch_name, String location) {
        setBranchName(branch_name);
        setLocation(location);
    }

    private void setBranchName(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getBranchName() {
        return branch_name;
    }

    private void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
