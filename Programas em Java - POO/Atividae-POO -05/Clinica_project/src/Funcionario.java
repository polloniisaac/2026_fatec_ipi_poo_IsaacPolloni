/**
 * Funcionario - classe base (superclasse) do diagrama.
 * Recepcionista e Medico HERDAM (extends) desta classe.
 */
public abstract class Funcionario {

    protected String nome;
    protected String telefone;
    protected String senha;

    public Funcionario(String nome, String telefone, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.senha = senha;
    }

    /** +acessar() do diagrama: valida a senha do funcionario. */
    public boolean acessar(String senhaDigitada) {
        boolean autorizado = this.senha != null && this.senha.equals(senhaDigitada);
        System.out.println((autorizado ? "[OK] Acesso concedido" : "[X] Acesso negado")
                + " para " + nome);
        return autorizado;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
