package assignment02;

abstract public class Pessoa {
    private String nm_pessoa;
    
    public Pessoa(String p_nmPessoa) {
        setNome(p_nmPessoa);
    }
    
    private void setNome(String p_nmPessoa) {
        this.nm_pessoa = p_nmPessoa;
    }
    
    public String getNome() {
        return this.nm_pessoa;
    }
}
