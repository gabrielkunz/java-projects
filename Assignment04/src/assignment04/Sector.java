package assignment04;

public class Sector {
    private String sector_name;
    private Branch branch;

    public Sector(String sector_name, Branch branch){
        setSectorName(sector_name);
        setBranch(branch);
    }

    public void setSectorName(String sector_name) {
        this.sector_name = sector_name;
    }

    public String getSectorName() {
        return sector_name;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Branch getBranch() {
        return branch;
    }
}
