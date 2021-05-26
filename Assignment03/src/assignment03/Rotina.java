package assignment03;

public class Rotina {
    private String output;
    
    public String EliminaAcento(String input) throws Exception {
        if("".equals(input)) {
            throw new Exception("String cannot be null.");
        }
        
        if(input.matches(".*[áàâãéèêíìîóòõôúùû].*")){
            output = input.replace("á","a");
            output = output.replace("à","a");
            output = output.replace("ã","a");
            output = output.replace("â","a");
            
            output = output.replace("é","e");
            output = output.replace("è","e");
            output = output.replace("ê","e");
            
            output = output.replace("í","i");
            output = output.replace("ì","i");
            output = output.replace("î","i");
            
            output = output.replace("ó","o");
            output = output.replace("ò","o");
            output = output.replace("õ","o");
            output = output.replace("ô","o");
            
            output = output.replace("ú","u");
            output = output.replace("ù","u");
            output = output.replace("û","u");
        } else {
            output = input;
        }
        
        return output;
    }
    
    public String EliminaEspacoDuplo(String input) throws Exception {
        if("".equals(input)) {
            throw new Exception("String cannot be null.");
        }
        
        if(input.contains("  ")){
            output = input;
            while(output.contains("  ")) {
                output = output.replace("  "," ");
            }
        } else {
            output = input;
        }
        
        return output;
    }
}
