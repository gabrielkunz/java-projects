package pkg01_input_dialog;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Name:");
        System.out.println("Hello " + name);
    }
    
}
