import classes.paciente;
    public class Main{
    public static void main(String[] args) {
        paciente maria = new paciente();
        maria.nome = "Maria da Silva";
        maria.cpf = 1445498633;
        maria.telefone = 888888888;
        maria.genero = "Female";
        maria.idade = 60;

        maria.consultar();
    }
}