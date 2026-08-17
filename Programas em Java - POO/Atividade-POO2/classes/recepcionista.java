package classes;

public class recepcionista {
    public String nome;
    public String cpf;
    public String telefone;
    public String senha;

    public void acessar() {
        System.out.println("nome: " + nome);
        System.out.println("cpf: " + cpf);
        System.out.println("telefone: " + telefone);
        System.out.println("senha: " + senha);
    }
}