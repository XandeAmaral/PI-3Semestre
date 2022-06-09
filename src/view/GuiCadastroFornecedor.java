package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class GuiCadastroFornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtCNPJ;
	private JTextField txtTelefone;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiCadastroFornecedor frame = new GuiCadastroFornecedor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GuiCadastroFornecedor() {
		setTitle("Cadastro de fornecedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(110, 146, 86, 20);
		contentPane.add(txtCodigo);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo:");
		lblNewLabel_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(62, 148, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome /Raz\u00E3o social:");
		lblNewLabel_1_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(62, 177, 129, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(192, 177, 450, 20);
		contentPane.add(txtNome);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CNPJ:");
		lblNewLabel_1_1_1.setForeground(new Color(0, 100, 0));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(239, 148, 45, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtCNPJ = new JTextField();
		txtCNPJ.setColumns(10);
		txtCNPJ.setBounds(278, 146, 122, 20);
		contentPane.add(txtCNPJ);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Telefone:");
		lblNewLabel_1_1_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(434, 148, 56, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(499, 146, 159, 20);
		contentPane.add(txtTelefone);
		
		JButton btnCadastrarFornecedor = new JButton("Cadastrar");
		btnCadastrarFornecedor.setForeground(new Color(0, 100, 0));
		btnCadastrarFornecedor.setBackground(new Color(153, 204, 153));
		btnCadastrarFornecedor.setBounds(62, 456, 103, 23);
		contentPane.add(btnCadastrarFornecedor);
		
		JButton btnAlterarFornecedor = new JButton("Alterar");
		btnAlterarFornecedor.setForeground(new Color(0, 100, 0));
		btnAlterarFornecedor.setBackground(new Color(153, 204, 153));
		btnAlterarFornecedor.setBounds(175, 456, 112, 23);
		contentPane.add(btnAlterarFornecedor);
		
		JButton btnCancelarFornecedor = new JButton("Cancelar");
		btnCancelarFornecedor.setForeground(new Color(0, 100, 0));
		btnCancelarFornecedor.setBackground(new Color(153, 204, 153));
		btnCancelarFornecedor.setBounds(297, 456, 103, 23);
		contentPane.add(btnCancelarFornecedor);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setForeground(new Color(0, 100, 0));
		btnConsultar.setBackground(new Color(153, 204, 153));
		btnConsultar.setBounds(514, 382, 89, 23);
		contentPane.add(btnConsultar);
		
		JButton btnExcluirFornecedor = new JButton("Excluir");
		btnExcluirFornecedor.setForeground(new Color(0, 100, 0));
		btnExcluirFornecedor.setBackground(new Color(153, 204, 153));
		btnExcluirFornecedor.setBounds(613, 382, 89, 23);
		contentPane.add(btnExcluirFornecedor);
		
		JLabel lblCadastroDeFornecedores = new JLabel("Cadastro de Fornecedores ");
		lblCadastroDeFornecedores.setIcon(new ImageIcon(GuiCadastroFornecedor.class.getResource("/view/cadastro.png")));
		lblCadastroDeFornecedores.setForeground(new Color(0, 100, 0));
		lblCadastroDeFornecedores.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblCadastroDeFornecedores.setBounds(156, 34, 472, 46);
		contentPane.add(lblCadastroDeFornecedores);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("E-mail:");
		lblNewLabel_1_1_3.setForeground(new Color(0, 100, 0));
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_3.setBounds(62, 208, 45, 14);
		contentPane.add(lblNewLabel_1_1_3);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(106, 206, 450, 20);
		contentPane.add(txtEmail);
		
		JList listConsultaFornecedor = new JList();
		listConsultaFornecedor.setBackground(Color.WHITE);
		listConsultaFornecedor.setBounds(56, 240, 661, 131);
		contentPane.add(listConsultaFornecedor);
	}
}
