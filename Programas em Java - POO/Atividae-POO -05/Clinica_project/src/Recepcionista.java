import java.util.ArrayList;
import java.util.List;

/**
 * Recepcionista - HERDA de Funcionario.
 * ASSOCIACAO direcionada "+cadastra" com Paciente.
 * ASSOCIACAO direcionada "+marcar" com Consulta.
 */
public class Recepcionista extends Funcionario {

    private String cpf;

    // Associacao: Recepcionista --cadastra--> Paciente
    private List<Paciente> pacientesCadastrados = new ArrayList<>();
    // Associacao: Recepcionista --marca--> Consulta
    private List<Consulta> consultasMarcadas = new ArrayList<>();

    public Recepcionista(String nome, String telefone, String senha, String cpf) {
        super(nome, telefone, senha);
        this.cpf = cpf;
    }

    /** +cadastra do diagrama (Recepcionista -> Paciente). */
    public void cadastra(Paciente paciente) {
        pacientesCadastrados.add(paciente);
        paciente.cadastrar();
        System.out.println("Recepcionista " + nome + " cadastrou o paciente " + paciente.getNome());
    }

    /**
     * +marcar do diagrama (Recepcionista -> Consulta).
     * Cria a Consulta e, de quebra, alimenta a agregacao Paciente-Consulta e Medico-Consulta.
     */
    public Consulta marcar(Paciente paciente, Medico medico, String data, String hora, String motivo) {
        Consulta consulta = new Consulta(data, hora, motivo, paciente, medico);
        consultasMarcadas.add(consulta);
        paciente.adicionarConsulta(consulta);
        medico.adicionarConsulta(consulta);
        System.out.println("Recepcionista " + nome + " marcou consulta de "
                + paciente.getNome() + " com Dr(a). " + medico.getNome()
                + " para " + data + " as " + hora);
        return consulta;
    }

    public String getCpf() {
        return cpf;
    }
}
