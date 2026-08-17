package classes;

public class agenda {

    public String data;
    public String hora;
    public String medico;
    public String paciente;

    public void consultar() {
        System.out.println("Consultando agenda...");
    }

    public void mostrar() {
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Médico: " + medico);
        System.out.println("Paciente: " + paciente);
    }
}