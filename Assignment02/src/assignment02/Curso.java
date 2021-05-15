package assignment02;

public class Curso {
    private String nm_curso;
    private Professor coordenador;
    
    public Curso(String p_nmCurso, Professor p_coordenador) {
        setNmCurso(p_nmCurso);
        setCoordenador(p_coordenador);
    }
    
    private void setNmCurso(String p_nmCurso) {
        this.nm_curso = p_nmCurso;
    }
    
    public String getNmCurso() {
        return this.nm_curso;
    }
    
    private void setCoordenador(Professor p_professor) {
        this.coordenador = p_professor;
    }
    
    public Professor getCoordernador() {
        return this.coordenador;
    }
}
