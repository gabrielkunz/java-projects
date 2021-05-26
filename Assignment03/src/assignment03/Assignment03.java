package assignment03;
import javax.swing.JOptionPane;

public class Assignment03 {

    public static void main(String[] args) {
        Rotina rotina = new Rotina();
        String user_input = JOptionPane.showInputDialog("Enter a string:");
        
        try {
            String input_without_accents = rotina.EliminaAcento(user_input);
            System.out.println("String without accents: " + input_without_accents);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            String input_without_despaces = rotina.EliminaEspacoDuplo(user_input);
            System.out.println("String without double spaces or more: " 
                    + input_without_despaces);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            String new_output = rotina.EliminaAcento(user_input);
            new_output = rotina.EliminaEspacoDuplo(new_output);
            System.out.println("String without accents and double spaces: " 
                    + new_output);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
