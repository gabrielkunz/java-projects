package program01;
import javax.swing.JOptionPane;

public class Program01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Name:");
        System.out.println("Hello " + name);
    }
}
