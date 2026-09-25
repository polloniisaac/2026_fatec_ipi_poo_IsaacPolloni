/**
 * Agenda - classe base (superclasse) do diagrama.
 * Consulta HERDA (extends) desta classe (triangulo vazado Consulta -> Agenda).
 */
public class Agenda {

    protected String data;
    protected String hora;

    public Agenda(String data, String hora) {
        this.data = data;
        this.hora = hora;
    }

    /** +consultar() do diagrama. */
    public void consultar() {
        System.out.println("Data: " + data + " | Hora: " + hora);
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }
}
