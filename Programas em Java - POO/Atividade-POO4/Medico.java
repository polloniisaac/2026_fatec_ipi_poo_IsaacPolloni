public class Medico {
    private String nome;
    private String crm;
    private String telefone;
    private String especilidade;
    private String senha;

    public Medico(){}
    
    public Medico(String nome, String crm, String telefone, String especilidade, String senha) throws Exception {
        setNome(nome);
        setCrm(crm);
        setTelefone(telefone);
        setEspecilidade(especilidade);
        setSenha(senha);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) throws Exception {
        if(nome.isEmpty() || nome.isBlank()) {
            throw new Exception("O nome do medido e obrigatorio!!!");
        }
        this.nome = nome;
    }
    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) throws Exception 
    {
        if(crm.isBlank() || crm.isEmpty()) throw new Exception("Crm Obrigatório!!");
        this.crm = crm;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEspecilidade() {
        return especilidade;
    }
    public void setEspecilidade(String especilidade) {
        this.especilidade = especilidade;
    }
    public String getSenha() {
        return "********";
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }


    public void mostrar() {
        System.out.println("Medico [nome=" + nome + ", crm=" + crm + ", telefone=" + telefone + ", especilidade=" + especilidade
                + ", senha=" + senha + "]");
    }

    public void acessar(){
    }

}