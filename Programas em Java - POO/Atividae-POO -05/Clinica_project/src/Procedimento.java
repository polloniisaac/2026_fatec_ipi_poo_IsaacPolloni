/**
 * Procedimento - classe base (superclasse) do diagrama.
 * Receita e Exame HERDAM (extends) desta classe.
 */
public class Procedimento {

    protected String data;
    protected String descritivo;

    public Procedimento(String data, String descritivo) {
        this.data = data;
        this.descritivo = descritivo;
    }

    /** +consultar() do diagrama. */
    public void consultar() {
        System.out.println("Procedimento em " + data + ": " + descritivo);
    }

    public String getData() {
        return data;
    }

    public String getDescritivo() {
        return descritivo;
    }
}
