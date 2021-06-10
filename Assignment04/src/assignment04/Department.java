package assignment04;

public class Department {
    private String dp_name;
    private Sector sector;
    private String dp_description;

    public Department(String dp_name, Sector sector, String dp_description){
        setDpName(dp_name);
        setSector(sector);
        setDpDescription(dp_description);
    }

    public void setDpName(String dp_name) {
        this.dp_name = dp_name;
    }

    public String getDpName() {
        return dp_name;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Sector getSector() {
        return sector;
    }

    public void setDpDescription(String dp_description) {
        this.dp_description = dp_description;
    }

    public String getDpDescription() {
        return dp_description;
    }
}
