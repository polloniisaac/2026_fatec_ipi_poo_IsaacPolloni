package classes;

public class exame {

    public String consulta;
    public String data;
    public String descritivo;

    public void solicitar() {
        System.out.println("Exame solicitado.");
    }

    public void consultar() {
        System.out.println("Consultando exame...");
    }

    public void mostrar() {
        System.out.println("Consulta: " + consulta);
        System.out.println("Data: " + data);
        System.out.println("Descritivo: " + descritivo);
    }
}