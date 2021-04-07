package program02;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Program02 {

    public static void main(String[] args) {
        Person person01 = new Person();
        Professor professor01 = new Professor();
        
        person01.setName("gabriel");
        try {
            person01.setAge(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        professor01.setName("margrit");
        professor01.setNumberSiape(12345);
        
        System.out.println(person01.getName());
        System.out.println(professor01.getName());
        System.out.println(professor01.getNumberSiape());
    }
    
}
