package assignment03;

public class Rotina {
    private String output;
    
    public String EliminaAcento(String input) throws Exception {
        if("".equals(input)) {
            throw new Exception("String cannot be null.");
        }
        
        if(input.matches(".*[áàãéèíìóòõúù].*")){
            output = input.replace("á","a");
            output = output.replace("à","a");
            output = output.replace("ã","a");
            output = output.replace("é","e");
            output = output.replace("è","e");
            output = output.replace("í","i");
            output = output.replace("ì","i");
            output = output.replace("ó","o");
            output = output.replace("ò","o");
            output = output.replace("õ","o");
            output = output.replace("ú","u");
            output = output.replace("ù","u");
        } else {
            output = input;
        }
        
        return output;
    }
    
    public String EliminaEspacoDuplo(String input) throws Exception {
        if("".equals(input)) {
            throw new Exception("String cannot be null.");
        }
        
        if(input.matches(".*[  ].*")){
            output = input;
            while(output.matches(".*[  ].*")) {
                output = output.replace("  "," ");
            }
        } else {
            output = input;
        }
        
        return output;
    }
}
