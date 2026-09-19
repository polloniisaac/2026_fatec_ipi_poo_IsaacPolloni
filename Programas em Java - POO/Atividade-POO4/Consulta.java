public class Consulta {
     private String data;
     private String hora;
     private Medico medico;
     private Paciente paciente;
     private String motivo;
     private String historico;

     public void cancelar(){}
    public void marcar(){}
    public void consultar(){}
    public void realizar(){}
    public void atualizar(){}





    public String getData() {
        return data;
    }
    public void setData(String data) throws Exception {
         if(data==null|| data.length()<=0)
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
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
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) throws Exception {

        if(motivo==null || motivo.length()<=0)
            throw new Exception("É necessário o motivo da consulta! ");
        this.motivo = motivo;
    }
    String getHistorico() {
        return historico;
    }
    void setHistorico(String historico) {
        this.historico = historico;
    }
    public Consulta(String data, String hora, Medico medico, Paciente paciente, String motivo, String historico) throws Exception {
         setData(data);
         setHora(hora);
         setMedico(medico);
         setPaciente(paciente);
         setMotivo(motivo);
         setHistorico(historico);
    }
    public Consulta(){}

    public void mostrar(){
            var s = "Consulta [getHora()=" + getHora() + ", getData()=" + getData() + ", getMedico()=" + getMedico()
                    + ", getPaciente()=" + getPaciente() + ", getMotivo()=" + getMotivo() + ", getHistorico()="
                    + getHistorico() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                    + super.toString() + "]";
        System.out.println(s);
    };


}