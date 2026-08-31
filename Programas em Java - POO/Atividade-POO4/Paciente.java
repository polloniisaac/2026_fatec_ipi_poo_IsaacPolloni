public class Paciente {
    private int codigo;
    private String nome;
    private String telefone;
    private char genero;
    private String senha;
    private int idade;
    private String email;
    
    public Paciente(){}

    public Paciente(int _codigo, String _nome, String _email, int _idade, char _genero) throws Exception{
    setCodigo(_codigo);
    setEmail(_email);
    setIdade(_idade);
    setGenero(_genero);
    setNome(_nome);
    }
    
 
    public Paciente(int codigo, String nome, String telefone, String email, int idade, char genero, String senha) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.genero = genero;
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) throws Exception {
        if(nome.isBlank()){
            throw new Exception("nome e obrigatorio!");
        } else {
            this.nome = nome;
        }
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public void cadastrar(){
        //todo
    }
    public void consultar(){
        //todo
    }
    public void mostrar(){
        System.out.println("Objeto do tipo Paciente");
        System.out.println("nome:"+ this.nome);
        System.out.println("email:"+ this.email);
        System.out.println("telefone:"+ this.telefone);
        System.out.println("idade:"+ this.idade);
    }
    
    public String getSenha() {
        return "************";
    }
    public void setSenha(String senha) throws Exception {
        if(senha.isEmpty()||senha.isBlank())
            throw new Exception("A Senha é obrigatória!!!");
        this.senha = senha;
    }
}