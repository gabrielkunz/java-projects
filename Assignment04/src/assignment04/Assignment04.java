package assignment04;

public class Assignment04 {

    public static void main(String[] args) {
        Branch RS = new Branch("RS", "Porto Alegre, Rio Grande do Sul");
        Sector LO = new Sector("Logistics", RS);
        Department distribution = new Department("Distribution Center", LO, "Distribution of goods outside the storage.");
        JobRole director_dstr = new JobRole("Director of Distribution", distribution);
        JobRole driver_dstr = new Driver("Distribution Driver", distribution, "123");
        Employee jane = new Employee("Jane", "Alice", "", "123", "0111", (float) 1500, director_dstr, 2);
        Employee michael = new Employee("Michael", "Sabrina", "John", "432", "0112", (float) 900, driver_dstr, 1);

        System.out.println(jane.getInfo());
        System.out.println(michael.getInfo());
    }
    
}
