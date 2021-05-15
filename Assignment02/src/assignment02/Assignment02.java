package assignment02;

public class Assignment02 {

    public static void main(String[] args) {
        Titulacao doutor = new Titulacao("Doutor");
        Professor margrit = new Professor("Margrit Krug", 12345, 2, doutor);
        Curso analise_sistemas = new Curso("Analise e Desenvolvimento de Sistemas", 
                margrit);
        Aluno mauricio = new Aluno("Mauricio Farias", "123.456.789-00", 2021, 
                analise_sistemas);
        
        System.out.println("Dados Aluno:");
        System.out.println("    Nome: " + mauricio.getNome());
        System.out.println("    Ano de ingresso: " + mauricio.getNuAno());
        System.out.println("    Matricula: " + mauricio.getNuMatricula());
        System.out.println("    Curso: " + mauricio.getCurso().getNmCurso());
        System.out.println("    Coordenador: " + 
                mauricio.getCurso().getCoordernador().getNome());
        
        
        System.out.println("Dados Professor:");
        System.out.println("    Nome: " + margrit.getNome());
        System.out.println("    Titulo: " + margrit.getTitulacao().getNmTitulacao());
        System.out.println("    Siape: " + margrit.getNuSiape());
        System.out.println("    Filhos: " + margrit.getNuFilhos());
    }
    
}
