package gui;

import app.Medico;
import app.RepositorioClinica;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MedicoForm extends CadastroForm {
    private final JTextField txtNome = new JTextField(24);
    private final JTextField txtCrm = new JTextField(24);
    private final JTextField txtEspecialidade = new JTextField(24);
    private final JTextField txtTelefone = new JTextField(24);
    private final JPasswordField txtSenha = new JPasswordField(24);

    public MedicoForm() {
        super("Cadastro de Médicos", "Nome", "CRM", "Especialidade", "Telefone");
        adicionarCampo("Nome:", txtNome);
        adicionarCampo("CRM:", txtCrm);
        adicionarCampo("Especialidade:", txtEspecialidade);
        adicionarCampo("Telefone:", txtTelefone);
        adicionarCampo("Senha:", txtSenha);
        finalizarMontagem();
        carregarTabela();
    }

    private void carregarTabela() {
        for (Medico medico : RepositorioClinica.listarMedicos()) {
            modeloTabela.addRow(new Object[] {
                medico.getNome(), medico.getCrm(), medico.getEspecialidade(), medico.getTelefone()
            });
        }
    }

    @Override
    protected void salvar() {
        String nome = txtNome.getText().trim();
        String crm = txtCrm.getText().trim();
        String especialidade = txtEspecialidade.getText().trim();
        String telefone = txtTelefone.getText().trim();
        String senha = new String(txtSenha.getPassword()).trim();

        if (!obrigatorio(nome, crm, especialidade, telefone, senha)) {
            mostrarErro("Preencha todos os campos.");
            return;
        }

        Medico medico = new Medico(nome, telefone, senha, crm, especialidade);
        RepositorioClinica.adicionar(medico);
        modeloTabela.addRow(new Object[] { nome, crm, especialidade, telefone });
        mostrarSucesso("Médico cadastrado com sucesso.");
        limpar();
    }

    @Override
    protected void limpar() {
        txtNome.setText("");
        txtCrm.setText("");
        txtEspecialidade.setText("");
        txtTelefone.setText("");
        txtSenha.setText("");
        txtNome.requestFocusInWindow();
    }
}
