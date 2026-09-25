import java.util.ArrayList;
import java.util.List;

/**
 * Medico - HERDA de Funcionario.
 * AGREGACAO com Consulta: o Medico guarda a lista de Consultas que realiza,
 * mas nao e' o "dono" do ciclo de vida delas (quem cria a Consulta e' a Recepcionista).
 */
public class Medico extends Funcionario {

    private String crm;
    private String especialidade;

    // Agregacao: Medico <>-- Consulta
    private List<Consulta> consultas = new ArrayList<>();

    public Medico(String nome, String telefone, String senha, String crm, String especialidade) {
        super(nome, telefone, senha);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    /** Usado pela agregacao Medico-Consulta quando uma consulta e' marcada. */
    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public String getCrm() {
        return crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }
}
