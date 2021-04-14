package program03;

public class Student extends Person {
    private Integer registration;
    private Integer year;
    
    public void setRegistration(Integer registration){
        this.registration = registration;
    }
    
    public Integer getRegistration(){
        return this.registration;
    }
    
    public void setYear(int year) throws Exception{
        if (year > 2020){
            throw new Exception("Student year cannot be over 2020.");
        }
        this.year = year;
    }
    
    public int getYear(){
        return this.year;
    }
}
