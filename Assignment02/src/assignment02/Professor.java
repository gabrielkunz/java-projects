package assignment02;

public class Professor extends Pessoa {
    private Integer nu_siape;
    private Integer nu_filhos;
    private Titulacao titulacao;
    
    public Professor(String p_nmProfessor, Integer p_nuSiape, Integer p_nuFilhos,
            Titulacao p_titulacao) {
        super(p_nmProfessor);
        setNuSiape(p_nuSiape);
        setNuFilhos(p_nuFilhos);
        setTitulacao(p_titulacao);
    }
    
    private void setNuSiape(Integer p_nuSiape) {
        this.nu_siape = p_nuSiape;
    }
    
    public Integer getNuSiape() {
        return this.nu_siape;
    }
    
    private void setNuFilhos(Integer p_nuFilhos) {
        this.nu_filhos = p_nuFilhos;
    }
    
    public Integer getNuFilhos() {
        return this.nu_filhos;
    }
    
    private void setTitulacao(Titulacao p_titulacao) {
        this.titulacao = p_titulacao;
    }
    
    public Titulacao getTitulacao() {
        return this.titulacao;
    }
 
}
