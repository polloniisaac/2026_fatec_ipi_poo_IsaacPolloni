/**
 * Receita - HERDA de Procedimento.
 * Faz parte da COMPOSICAO com Consulta (losango preenchido no diagrama):
 * uma Receita so existe dentro do contexto de uma Consulta, que e' quem a cria.
 */
public class Receita extends Procedimento {

    public Receita(String data, String descritivo) {
        super(data, descritivo);
    }

    /** +preescrever() do diagrama. */
    public void preescrever() {
        System.out.println("  Receita prescrita em " + data + ": " + descritivo);
    }
}
