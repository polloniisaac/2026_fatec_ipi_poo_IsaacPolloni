package app;

public class Recepcionista extends Funcionario {
    private final String cpf;

    public Recepcionista(String nome, String telefone, String senha, String cpf) {
        super(nome, telefone, senha);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
}
