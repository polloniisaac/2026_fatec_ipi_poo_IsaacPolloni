import java.util.ArrayList;
import java.util.List;

/**
 * Paciente.
 * AGREGACAO com Consulta: o Paciente guarda uma lista (historico) de Consultas,
 * mas essas Consultas nao pertencem exclusivamente a ele nem sao criadas por ele
 * (sao criadas pela Recepcionista) - por isso e' agregacao, e nao composicao.
 */
public class Paciente {

    private String nome;
    private String cpf;
    private String telefone;
    private String genero;
    private int idade;

    // Agregacao: Paciente <>-- Consulta
    private List<Consulta> consultas = new ArrayList<>();

    public Paciente(String nome, String cpf, String telefone, String genero, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
        this.idade = idade;
    }

    /** +cadastrar() do diagrama. */
    public void cadastrar() {
        System.out.println("Paciente " + nome + " cadastrado com sucesso.");
    }

    /** +consultar() do diagrama: lista o historico de consultas do paciente. */
    public void consultar() {
        System.out.println("Historico de consultas de " + nome + ":");
        if (consultas.isEmpty()) {
            System.out.println("  (nenhuma consulta registrada)");
        }
        for (Consulta c : consultas) {
            System.out.println("  - " + c);
        }
    }

    /** Usado pela agregacao Paciente-Consulta quando uma consulta e' marcada. */
    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }
}
