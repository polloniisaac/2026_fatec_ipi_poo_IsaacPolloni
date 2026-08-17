package classes;

public class consulta {

    public String data;
    public String hora;
    public String medico;
    public String paciente;
    public String motivo;
    public String historico;

    public void marcar() {
        System.out.println("Consulta marcada.");
    }

    public void cancelar() {
        System.out.println("Consulta cancelada.");
    }

    public void consultar() {
        System.out.println("Consultando consulta...");
    }

    public void realizar() {
        System.out.println("Consulta realizada.");
    }

    public void atualizar() {
        System.out.println("Consulta atualizada.");
    }

    public void mostrar() {
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Médico: " + medico);
        System.out.println("Paciente: " + paciente);
        System.out.println("Motivo: " + motivo);
        System.out.println("Histórico: " + historico);
    }
}