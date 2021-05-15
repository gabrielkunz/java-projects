package assignment02;

public class Aluno extends Pessoa {
    private String nu_matricula;
    private Integer nu_ano;
    private Curso curso;
    
    public Aluno(String p_nmAluno, String p_nuMatricula, Integer p_nuAno,
            Curso p_curso) {
        super(p_nmAluno);
        setNuMatricula(p_nuMatricula);
        setNuAno(p_nuAno);
        setCurso(p_curso);
    }
    
    private void setNuMatricula(String p_nuMatricula) {
        this.nu_matricula = p_nuMatricula;
    }
    
    public String getNuMatricula() {
        return this.nu_matricula;
    }
    
    private void setNuAno(Integer p_nuAno) {
        this.nu_ano = p_nuAno;
    }
    
    public Integer getNuAno() {
        return this.nu_ano;
    }
    
    private void setCurso(Curso p_curso) {
        this.curso = p_curso;
    }
    
    public Curso getCurso() {
        return this.curso;
    }
}
