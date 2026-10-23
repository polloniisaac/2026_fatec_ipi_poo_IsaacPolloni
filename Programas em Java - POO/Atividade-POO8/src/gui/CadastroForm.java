package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public abstract class CadastroForm extends JFrame {
    protected final JPanel formulario = new JPanel(new GridBagLayout());
    protected final DefaultTableModel modeloTabela;
    private int proximaLinha;

    protected CadastroForm(String titulo, String... colunas) {
        setTitle(titulo);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(900, 650);
        setMinimumSize(new Dimension(760, 540));
        setLocationRelativeTo(null);

        modeloTabela = new DefaultTableModel(colunas, 0) {
            @Override
            public boolean isCellEditable(int linha, int coluna) {
                return false;
            }
        };
    }

    protected final void adicionarCampo(String rotulo, Component campo) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(4, 6, 4, 6);
        gbc.gridy = proximaLinha;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 0;
        gbc.weightx = 0;
        formulario.add(new JLabel(rotulo), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        formulario.add(campo, gbc);
        proximaLinha++;
    }

    protected final void finalizarMontagem() {
        JPanel principal = new JPanel(new BorderLayout(12, 12));
        principal.setBorder(BorderFactory.createEmptyBorder(16, 16, 16, 16));

        JLabel titulo = new JLabel(getTitle(), SwingConstants.LEFT);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        principal.add(titulo, BorderLayout.NORTH);

        formulario.setBorder(BorderFactory.createTitledBorder("Dados"));
        JPanel centro = new JPanel(new BorderLayout(10, 10));
        centro.add(formulario, BorderLayout.NORTH);

        JTable tabela = new JTable(modeloTabela);
        tabela.setFillsViewportHeight(true);
        JScrollPane rolagem = new JScrollPane(tabela);
        rolagem.setBorder(BorderFactory.createTitledBorder("Cadastros desta sessão"));
        centro.add(rolagem, BorderLayout.CENTER);
        principal.add(centro, BorderLayout.CENTER);

        JButton btnSalvar = new JButton("Salvar");
        JButton btnLimpar = new JButton("Limpar");
        JButton btnFechar = new JButton("Fechar");
        btnSalvar.addActionListener(evento -> salvar());
        btnLimpar.addActionListener(evento -> limpar());
        btnFechar.addActionListener(evento -> dispose());

        JPanel botoes = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        botoes.add(btnSalvar);
        botoes.add(btnLimpar);
        botoes.add(btnFechar);
        principal.add(botoes, BorderLayout.SOUTH);

        setContentPane(principal);
    }

    protected final boolean obrigatorio(String... valores) {
        for (String valor : valores) {
            if (valor == null || valor.trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    protected final void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Verifique os dados", JOptionPane.ERROR_MESSAGE);
    }

    protected final void mostrarSucesso(String mensagem) {
        JOptionPane.showMessageDialog(this, mensagem, "Cadastro realizado", JOptionPane.INFORMATION_MESSAGE);
    }

    protected abstract void salvar();

    protected abstract void limpar();
}
