package assignment02;

public class Titulacao {
    private String nm_titulacao;
    
    public Titulacao(String p_nmTitulacao) {
        setNmTitulacao(p_nmTitulacao);
    }
    
    private void setNmTitulacao(String p_nmTitulacao) {
        this.nm_titulacao = p_nmTitulacao;
    }
    
    public String getNmTitulacao() {
        return this.nm_titulacao;
    }
}
