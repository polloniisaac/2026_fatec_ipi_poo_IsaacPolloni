public class Receita {
    private Consulta consulta;
    private String data;
    private String descritivo;

public Receita(){}
    
    public Receita(Consulta consulta, String data, String descritivo)throws Exception{
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
    }
    public Consulta getConsulta() {
        return consulta;
    }
    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    public String getData() {
        return data;
    }
    public void setData(String data)  throws Exception {
        if(data.isBlank())
            throw new Exception("a data não pode ser nula!");
        this.data = data;
    }
    public String getDescritivo() {
        return descritivo;
    }
    public void setDescritivo(String descritivo) throws Exception
        {
            if(descritivo==null || descritivo.length()<=0)
                throw new Exception("Informe o descritvo do exame");
        this.descritivo = descritivo;
    }
    
    public void mostrar() {
        System.out.println( "Receita [consulta=" + consulta + ", data=" + data + ", descritivo=" + descritivo + "]");
    }

    public void preescrever(){}
    public void consultar(){}
    
}