package program03;

public class Program03 {

    public static void main(String[] args) {
        Professor professor01 = new Professor();
        Student student01 = new Student();
        
        student01.setName("gabriel");
        try {
            student01.setAge(23);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        student01.setRegistration(54321);
        professor01.setName("margrit    ");
        professor01.setNumberSiape(12345);
        
        System.out.println(student01.getName());
        System.out.println(student01.getAge());
        System.out.println(student01.getRegistration());
        System.out.println(professor01.getName());
        System.out.println(professor01.getNumberSiape());
    }
    
}
