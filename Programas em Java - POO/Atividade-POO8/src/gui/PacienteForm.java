package gui;

import app.Paciente;
import app.RepositorioClinica;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class PacienteForm extends CadastroForm {
    private final JTextField txtNome = new JTextField(24);
    private final JTextField txtCpf = new JTextField(24);
    private final JTextField txtTelefone = new JTextField(24);
    private final JTextField txtIdade = new JTextField(24);
    private final JComboBox<String> cmbGenero = new JComboBox<>(new String[] {
        "Selecione...", "Feminino", "Masculino", "Outro", "Prefiro não informar"
    });

    public PacienteForm() {
        super("Cadastro de Pacientes", "Nome", "CPF", "Telefone", "Idade", "Gênero");
        adicionarCampo("Nome:", txtNome);
        adicionarCampo("CPF:", txtCpf);
        adicionarCampo("Telefone:", txtTelefone);
        adicionarCampo("Idade:", txtIdade);
        adicionarCampo("Gênero:", cmbGenero);
        finalizarMontagem();
        carregarTabela();
    }

    private void carregarTabela() {
        for (Paciente paciente : RepositorioClinica.listarPacientes()) {
            modeloTabela.addRow(new Object[] {
                paciente.getNome(), paciente.getCpf(), paciente.getTelefone(),
                paciente.getIdade(), paciente.getGenero()
            });
        }
    }

    @Override
    protected void salvar() {
        String nome = txtNome.getText().trim();
        String cpf = txtCpf.getText().trim();
        String telefone = txtTelefone.getText().trim();
        String idadeTexto = txtIdade.getText().trim();

        if (!obrigatorio(nome, cpf, telefone, idadeTexto) || cmbGenero.getSelectedIndex() == 0) {
            mostrarErro("Preencha todos os campos e selecione o gênero.");
            return;
        }

        final int idade;
        try {
            idade = Integer.parseInt(idadeTexto);
        } catch (NumberFormatException erro) {
            mostrarErro("A idade deve ser um número inteiro.");
            return;
        }
        if (idade <= 0) {
            mostrarErro("A idade deve ser maior que zero.");
            return;
        }

        String genero = (String) cmbGenero.getSelectedItem();
        Paciente paciente = new Paciente(nome, cpf, telefone, genero, idade);
        RepositorioClinica.adicionar(paciente);
        modeloTabela.addRow(new Object[] { nome, cpf, telefone, idade, genero });
        mostrarSucesso("Paciente cadastrado com sucesso.");
        limpar();
    }

    @Override
    protected void limpar() {
        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtIdade.setText("");
        cmbGenero.setSelectedIndex(0);
        txtNome.requestFocusInWindow();
    }
}
