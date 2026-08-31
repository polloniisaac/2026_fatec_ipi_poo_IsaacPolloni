public class Agenda {
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    public String getData() {
        return data;
    }
    public void setData(String data) throws Exception {
        if(data==null)
            throw new Exception("a data não pode ser nula!");
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora)throws Exception {
        if(hora==null)
            throw new Exception("Horário não pode ser nulo!");
        this.hora = hora;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void mostrar() {
        System.out.println("Agenda [data=" + data + ", hora=" + hora + ", medico=" + medico + ", paciente=" + paciente + "]");
    }
    public Agenda(String data, String hora, Medico medico, Paciente paciente) throws Exception {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
    }

    public void consultar(){
    }

}