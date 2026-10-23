package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public final class RepositorioClinica {
    private static final List<Paciente> PACIENTES = new ArrayList<>();
    private static final List<Medico> MEDICOS = new ArrayList<>();
    private static final List<Recepcionista> RECEPCIONISTAS = new ArrayList<>();

    private RepositorioClinica() {
    }

    public static synchronized void adicionar(Paciente paciente) {
        PACIENTES.add(paciente);
    }

    public static synchronized void adicionar(Medico medico) {
        MEDICOS.add(medico);
    }

    public static synchronized void adicionar(Recepcionista recepcionista) {
        RECEPCIONISTAS.add(recepcionista);
    }

    public static synchronized List<Paciente> listarPacientes() {
        return Collections.unmodifiableList(new ArrayList<>(PACIENTES));
    }

    public static synchronized List<Medico> listarMedicos() {
        return Collections.unmodifiableList(new ArrayList<>(MEDICOS));
    }

    public static synchronized List<Recepcionista> listarRecepcionistas() {
        return Collections.unmodifiableList(new ArrayList<>(RECEPCIONISTAS));
    }
}
