/**
 * Exame - HERDA de Procedimento.
 * Faz parte da COMPOSICAO com Consulta (losango preenchido no diagrama):
 * um Exame so existe dentro do contexto de uma Consulta, que e' quem o cria.
 */
public class Exame extends Procedimento {

    public Exame(String data, String descritivo) {
        super(data, descritivo);
    }

    /** +solicitar() do diagrama. */
    public void solicitar() {
        System.out.println("  Exame solicitado em " + data + ": " + descritivo);
    }
}
