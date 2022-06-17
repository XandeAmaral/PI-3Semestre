package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import control.FornecedorControle;
import model.Fornecedor;
import model.FornecedorDAO;

public class GuiCadastroFornecedor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCNPJ;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private String retorno;
	private FornecedorDAO dao;
	private Fornecedor fornecedor;
	private FornecedorControle controle;

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
		lblNewLabel_1_1_1.setBounds(62, 146, 45, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtCNPJ = new JTextField();
		txtCNPJ.setColumns(10);
		txtCNPJ.setBounds(100, 144, 122, 20);
		contentPane.add(txtCNPJ);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Telefone:");
		lblNewLabel_1_1_2.setForeground(new Color(0, 100, 0));
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1_2.setBounds(297, 146, 56, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(363, 144, 159, 20);
		contentPane.add(txtTelefone);
		
		JButton btnCadastrarFornecedor = new JButton("Cadastrar");
		btnCadastrarFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				try{
					if(controle.checarCampos(txtNome.getText(),txtCNPJ.getText(),txtTelefone.getText(),txtEmail.getText())){
						fornecedor = new Fornecedor(txtNome.getText(),txtCNPJ.getText(),txtTelefone.getText(),txtEmail.getText());
						retorno = dao.incluir(fornecedor);
						JOptionPane.showMessageDialog(null,retorno);
					}
					else JOptionPane.showMessageDialog(null,"Verifique se todos os campos estão preeenchidos corretamente.");
				}
				catch(Exception ex) {JOptionPane.showMessageDialog(null,"Erro: " + ex);}				
			}
		});
		btnCadastrarFornecedor.setForeground(new Color(0, 100, 0));
		btnCadastrarFornecedor.setBackground(new Color(153, 204, 153));
		btnCadastrarFornecedor.setBounds(62, 456, 103, 23);
		contentPane.add(btnCadastrarFornecedor);
		
		JButton btnAlterarFornecedor = new JButton("Alterar");
		btnAlterarFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				try{
					if(controle.checarCampos(txtNome.getText(),txtCNPJ.getText(),txtTelefone.getText(),txtEmail.getText())){
						fornecedor = new Fornecedor(txtNome.getText(),txtCNPJ.getText(),txtTelefone.getText(),txtEmail.getText());
						retorno = dao.atualizar(fornecedor);
						JOptionPane.showMessageDialog(null,retorno);
					}
					else JOptionPane.showMessageDialog(null,"Verifique se todos os campos estão preeenchidos corretamente.");
				}
				catch(Exception ex) {JOptionPane.showMessageDialog(null,"Erro: " + ex);}				
			}
		});
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
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				try{
					if(controle.checarCampos(txtNome.getText(),txtCNPJ.getText(),txtTelefone.getText(),txtEmail.getText())){
						fornecedor = new Fornecedor(txtNome.getText(),txtCNPJ.getText(),txtTelefone.getText(),txtEmail.getText());
						retorno = dao.atualizar(fornecedor);
						JOptionPane.showMessageDialog(null,retorno);
					}
					else JOptionPane.showMessageDialog(null,"Verifique se todos os campos estão preeenchidos corretamente.");
				}
				catch(Exception ex) {JOptionPane.showMessageDialog(null,"Erro: " + ex);}				
			}
		});
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
