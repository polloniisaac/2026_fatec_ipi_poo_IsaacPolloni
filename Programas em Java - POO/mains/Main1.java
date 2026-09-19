import classes.medico;

public class Main1 {
    public void main(String[] args) {
        medico medico = new medico();
        medico.senha = "senha";
        medico.crm = 18;
        medico.nome = " Manuel Gomes";
        medico.telefone = 1198784556;
        medico.especialidade= "Pediatria";

        medico.mostrar();

    }
}
