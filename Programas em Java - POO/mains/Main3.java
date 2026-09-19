import classes.agenda;
import classes.consulta;
import classes.exame;
import  classes.receita;
public class Main3 {

    public static void main(String[] args) {

        agenda agenda = new agenda();

        agenda.data = "16/08/2026";
        agenda.hora = "15:30";
        agenda.medico = "Dr. Navathe";
        agenda.paciente = "Vitor Nascimento";


        consulta consulta = new consulta();

        consulta.data = "16/08/2026";
        consulta.hora = "15:30";
        consulta.medico = "Dr. Navathe";
        consulta.paciente = "Vitor Nascimento";
        consulta.motivo = "Consulta de rotina";
        consulta.historico = "Paciente sem histórico de doenças";


        receita receita = new receita();

        receita.consulta = "Consulta de rotina";
        receita.data = "16/08/2026";
        receita.descritivo = "Tomar medicamento conforme orientação médica";


        exame exame = new exame();

        exame.consulta = "Consulta de rotina";
        exame.data = "15/09/2026";
        exame.descritivo = "Exame de sangue";


        System.out.println("===== AGENDA =====");
        agenda.mostrar();

        System.out.println("\n===== CONSULTA =====");
        consulta.mostrar();

        System.out.println("\n===== RECEITA =====");
        receita.mostrar();

        System.out.println("\n===== EXAME =====");
        exame.mostrar();
    }
}