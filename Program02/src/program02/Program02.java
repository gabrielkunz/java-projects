package program02;

public class Program02 {

    public static void main(String[] args) {
        Person person01 = new Person();
        Professor professor01 = new Professor();
        
        person01.setName("gabriel");
        professor01.setName("margrit");
        professor01.setNumberSiape(12345);
        
        System.out.println(person01.getName());
        System.out.println(professor01.getName());
        System.out.println(professor01.getNumberSiape());
    }
    
}
