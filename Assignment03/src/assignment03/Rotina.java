package assignment03;

public class Rotina {
    private String output;
    
    public String EliminaAcento(String input) throws Exception {
        if("".equals(input)) {
            throw new Exception("String cannot be null.");
        }
        this.output = input;
        
        return output;
    }
    
    public String EliminaEspacoDuplo(String input) throws Exception {
        if("".equals(input)) {
            throw new Exception("String cannot be null.");
        }
        this.output = input;
        
        return output;
    }
}
