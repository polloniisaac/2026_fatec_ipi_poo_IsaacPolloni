import java.util.ArrayList;
import java.util.List;

/**
 * Consulta - HERDA de Agenda (data, hora, consultar()).
 * ASSOCIACAO com Paciente e Medico: a Consulta apenas referencia objetos que
 * ja existem e continuam existindo independente da Consulta.
 * COMPOSICAO com Receita e Exame (losangos preenchidos no diagrama): a propria
 * Consulta cria suas Receitas/Exames, que nao fazem sentido fora dela.
 */
public class Consulta extends Agenda {

    private String motivo;
    private String historico;

    // Associacao simples: Consulta apenas referencia Paciente e Medico
    private Paciente paciente;
    private Medico medico;

    // Composicao: Consulta e' dona do ciclo de vida de Receita e Exame
    private List<Receita> receitas = new ArrayList<>();
    private List<Exame> exames = new ArrayList<>();

    public Consulta(String data, String hora, String motivo, Paciente paciente, Medico medico) {
        super(data, hora);
        this.motivo = motivo;
        this.paciente = paciente;
        this.medico = medico;
    }

    /** +marcar() do diagrama. */
    public void marcar() {
        System.out.println("Consulta marcada -> " + this);
    }

    /** +cancelar() do diagrama. */
    public void cancelar() {
        System.out.println("Consulta cancelada -> " + this);
    }

    /** +consultar() do diagrama (sobrescreve o metodo herdado de Agenda). */
    @Override
    public void consultar() {
        super.consultar();
        System.out.println("Motivo: " + motivo + " | Historico: "
                + (historico == null ? "(sem registro)" : historico));
    }

    /** +realizar() do diagrama. */
    public void realizar() {
        System.out.println("Consulta realizada entre Dr(a). " + medico.getNome()
                + " e o paciente " + paciente.getNome());
    }

    /** +atualizar() do diagrama. */
    public void atualizar(String novoHistorico) {
        this.historico = novoHistorico;
        System.out.println("Historico da consulta atualizado.");
    }

    /** Composicao: a Consulta cria e possui a Receita. */
    public Receita prescreverReceita(String data, String descritivo) {
        Receita receita = new Receita(data, descritivo);
        receitas.add(receita);
        receita.preescrever();
        return receita;
    }

    /** Composicao: a Consulta cria e possui o Exame. */
    public Exame solicitarExame(String data, String descritivo) {
        Exame exame = new Exame(data, descritivo);
        exames.add(exame);
        exame.solicitar();
        return exame;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public List<Exame> getExames() {
        return exames;
    }

    @Override
    public String toString() {
        return "[" + data + " " + hora + "] " + motivo
                + " (paciente: " + paciente.getNome() + ", medico: " + medico.getNome() + ")";
    }
}
