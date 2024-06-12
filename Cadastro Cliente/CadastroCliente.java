package cadastroCliente;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtEndereco;
	private JTextField txtCidade;
	private JTextField txtEstado;
	private JTextField txtCEP;
	private JTextField txtPais;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				CadastroCliente frame = new CadastroCliente();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public CadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNomeDoCliente = new JLabel("Nome do Cliente:");
		JLabel lblEmail = new JLabel("Email:");
		JLabel lblTelefone = new JLabel("Telefone:");
		JLabel lblEndereco = new JLabel("Endereço:");
		JLabel lblCidade = new JLabel("Cidade:");
		JLabel lblEstado = new JLabel("Estado:");
		JLabel lblCEP = new JLabel("CEP:");
		JLabel lblPais = new JLabel("País:");

		txtNome = new JTextField();
		txtNome.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);

		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);

		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);

		txtCidade = new JTextField();
		txtCidade.setColumns(10);

		txtEstado = new JTextField();
		txtEstado.setColumns(10);

		txtCEP = new JTextField();
		txtCEP.setColumns(10);

		txtPais = new JTextField();
		txtPais.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = txtNome.getText();
				String email = txtEmail.getText();
				String telefone = txtTelefone.getText();
				String endereco = txtEndereco.getText();
				String cidade = txtCidade.getText();
				String estado = txtEstado.getText();
				String cep = txtCEP.getText();
				String pais = txtPais.getText();

				if (nome.isEmpty() || email.isEmpty() || telefone.isEmpty() || endereco.isEmpty() || cidade.isEmpty()
						|| estado.isEmpty() || cep.isEmpty() || pais.isEmpty()) {
					JOptionPane.showMessageDialog(contentPane, "Todos os campos são obrigatórios!", "Erro",
							JOptionPane.ERROR_MESSAGE);
					return;
				}

				System.out.println("Nome: " + nome);
				System.out.println("Email: " + email);
				System.out.println("Telefone: " + telefone);
				System.out.println("Endereço: " + endereco);
				System.out.println("Cidade: " + cidade);
				System.out.println("Estado: " + estado);
				System.out.println("CEP: " + cep);
				System.out.println("País: " + pais);

				JOptionPane.showMessageDialog(contentPane, "Cadastro realizado com sucesso!", "Sucesso",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

		GroupLayout layout = new GroupLayout(contentPane);
		contentPane.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(lblNomeDoCliente)
						.addComponent(lblEmail).addComponent(lblTelefone).addComponent(lblEndereco)
						.addComponent(lblCidade).addComponent(lblEstado).addComponent(lblCEP).addComponent(lblPais))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(txtNome)
						.addComponent(txtEmail).addComponent(txtTelefone).addComponent(txtEndereco)
						.addComponent(txtCidade).addComponent(txtEstado).addComponent(txtCEP).addComponent(txtPais)))
				.addComponent(btnCadastrar, GroupLayout.Alignment.CENTER));

		layout.setVerticalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblNomeDoCliente)
						.addComponent(txtNome))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblEmail)
						.addComponent(txtEmail))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblTelefone)
						.addComponent(txtTelefone))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblEndereco)
						.addComponent(txtEndereco))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblCidade)
						.addComponent(txtCidade))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblEstado)
						.addComponent(txtEstado))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblCEP)
						.addComponent(txtCEP))
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(lblPais)
						.addComponent(txtPais))
				.addComponent(btnCadastrar));
	}
}
