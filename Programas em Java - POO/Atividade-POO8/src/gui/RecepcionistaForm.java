package gui;

import app.Recepcionista;
import app.RepositorioClinica;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RecepcionistaForm extends CadastroForm {
    private final JTextField txtNome = new JTextField(24);
    private final JTextField txtCpf = new JTextField(24);
    private final JTextField txtTelefone = new JTextField(24);
    private final JPasswordField txtSenha = new JPasswordField(24);

    public RecepcionistaForm() {
        super("Cadastro de Recepcionistas", "Nome", "CPF", "Telefone");
        adicionarCampo("Nome:", txtNome);
        adicionarCampo("CPF:", txtCpf);
        adicionarCampo("Telefone:", txtTelefone);
        adicionarCampo("Senha:", txtSenha);
        finalizarMontagem();
        carregarTabela();
    }

    private void carregarTabela() {
        for (Recepcionista recepcionista : RepositorioClinica.listarRecepcionistas()) {
            modeloTabela.addRow(new Object[] {
                recepcionista.getNome(), recepcionista.getCpf(), recepcionista.getTelefone()
            });
        }
    }

    @Override
    protected void salvar() {
        String nome = txtNome.getText().trim();
        String cpf = txtCpf.getText().trim();
        String telefone = txtTelefone.getText().trim();
        String senha = new String(txtSenha.getPassword()).trim();

        if (!obrigatorio(nome, cpf, telefone, senha)) {
            mostrarErro("Preencha todos os campos.");
            return;
        }

        Recepcionista recepcionista = new Recepcionista(nome, telefone, senha, cpf);
        RepositorioClinica.adicionar(recepcionista);
        modeloTabela.addRow(new Object[] { nome, cpf, telefone });
        mostrarSucesso("Recepcionista cadastrado com sucesso.");
        limpar();
    }

    @Override
    protected void limpar() {
        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtSenha.setText("");
        txtNome.requestFocusInWindow();
    }
}
