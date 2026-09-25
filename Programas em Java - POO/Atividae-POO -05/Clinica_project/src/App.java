/**
 * App - classe principal (main) que demonstra o funcionamento do sistema da clinica,
 * exercitando heranca, associacao, agregacao e composicao definidas no diagrama.
 */
public class App {
 
    public static void main(String[] args) {
 
        System.out.println("=== HERANCA: Funcionario -> Recepcionista / Medico ===");
        Recepcionista recepcionista = new Recepcionista(
                "Ana Souza", "11 99999-0000", "1234", "111.222.333-44");
        Medico medico = new Medico(
                "Dr. Carlos Lima", "11 98888-7777", "senha123", "CRM12345", "Cardiologia");
 
        recepcionista.acessar("1234");
        medico.acessar("senhaErrada");
 
        System.out.println("\n=== ASSOCIACAO: Recepcionista --cadastra--> Paciente ===");
        Paciente paciente = new Paciente(
                "Maria Oliveira", "555.666.777-88", "11 97777-6666", "Feminino", 34);
        recepcionista.cadastra(paciente);
 
        System.out.println("\n=== ASSOCIACAO: Recepcionista --marca--> Consulta"
                + " (que alimenta as AGREGACOES Paciente<>Consulta e Medico<>Consulta) ===");
        Consulta consulta = recepcionista.marcar(
                paciente, medico, "25/09/2026", "14:30", "Dor no peito");
 
        System.out.println("\n=== HERANCA: Consulta -> Agenda / metodos proprios da Consulta ===");
        consulta.marcar();
        consulta.realizar();
        consulta.atualizar("Paciente estavel, sem alteracoes no ECG.");
 
        System.out.println("\n=== COMPOSICAO: Consulta *-- Receita / Consulta *-- Exame ===");
        consulta.prescreverReceita("25/09/2026", "Losartana 50mg - 1x ao dia");
        consulta.solicitarExame("25/09/2026", "Eletrocardiograma");
 
        System.out.println("\n=== Consulta.consultar() (heranca de Agenda.consultar()) ===");
        consulta.consultar();
 
        System.out.println("\n=== AGREGACAO: consultando o historico via Paciente e Medico ===");
        paciente.consultar();
        System.out.println("Total de consultas do Dr(a). " + medico.getNome()
                + ": " + medico.getConsultas().size());
 
        System.out.println("\n=== HERANCA: Receita/Exame -> Procedimento ===");
        for (Receita r : consulta.getReceitas()) {
            r.consultar(); // metodo herdado de Procedimento
        }
        for (Exame e : consulta.getExames()) {
            e.consultar(); // metodo herdado de Procedimento
        }
    }
}