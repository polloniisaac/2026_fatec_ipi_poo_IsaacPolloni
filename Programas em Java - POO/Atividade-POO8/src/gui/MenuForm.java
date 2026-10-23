package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MenuForm extends JFrame {
    public MenuForm() {
        setTitle("Sistema da Clínica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(520, 320);
        setMinimumSize(new Dimension(460, 280));
        setLocationRelativeTo(null);

        JLabel titulo = new JLabel("Sistema da Clínica", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));

        JButton btnPaciente = new JButton("Cadastro de Paciente");
        JButton btnMedico = new JButton("Cadastro de Médico");
        JButton btnRecepcionista = new JButton("Cadastro de Recepcionista");
        btnPaciente.addActionListener(evento -> new PacienteForm().setVisible(true));
        btnMedico.addActionListener(evento -> new MedicoForm().setVisible(true));
        btnRecepcionista.addActionListener(evento -> new RecepcionistaForm().setVisible(true));

        JPanel botoes = new JPanel(new GridLayout(3, 1, 10, 10));
        botoes.setBorder(BorderFactory.createEmptyBorder(18, 70, 18, 70));
        botoes.add(btnPaciente);
        botoes.add(btnMedico);
        botoes.add(btnRecepcionista);

        JPanel principal = new JPanel(new BorderLayout(8, 8));
        principal.setBorder(BorderFactory.createEmptyBorder(18, 18, 18, 18));
        principal.add(titulo, BorderLayout.NORTH);
        principal.add(botoes, BorderLayout.CENTER);
        setContentPane(principal);
    }
}
//teste