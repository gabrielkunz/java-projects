package assignment03;
import javax.swing.JOptionPane;

public class Assignment03 {

    public static void main(String[] args) {
        Rotina rotina = new Rotina();
        String user_input = JOptionPane.showInputDialog("Enter a string:");
        
        try {
            String input_without_accents = rotina.EliminaAcento(user_input);
            System.out.println(input_without_accents);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            String input_without_despaces = rotina.EliminaEspacoDuplo(user_input);
            System.out.println(input_without_despaces);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
