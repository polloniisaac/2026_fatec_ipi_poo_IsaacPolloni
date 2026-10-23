package app;

public abstract class Funcionario {
    private final String nome;
    private final String telefone;
    private final String senha;

    protected Funcionario(String nome, String telefone, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean validarSenha(String senhaInformada) {
        return senha != null && senha.equals(senhaInformada);
    }
}
