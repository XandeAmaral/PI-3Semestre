package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GuiHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiHome frame = new GuiHome();
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
	public GuiHome() {
		setTitle("Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 550);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(153, 204, 153));
		menuBar.setBounds(0, 0, 784, 38);
		contentPane.add(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		mnCadastro.setIcon(new ImageIcon(GuiHome.class.getResource("/view/cadastro.png")));
		mnCadastro.setBorderPainted(true);
		mnCadastro.setBounds(new Rectangle(10, 10, 10, 10));
		mnCadastro.setFont(new Font("Tahoma", Font.BOLD, 13));
		mnCadastro.setBackground(new Color(153, 204, 153));
		menuBar.add(mnCadastro);
		
		JMenuItem mnConsultaPedido = new JMenuItem("Pedido");
		mnConsultaPedido.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnConsultaPedido.setIcon(new ImageIcon(GuiHome.class.getResource("/view/seta.png")));
		mnCadastro.add(mnConsultaPedido);
		
		JMenuItem mnConsultaFuncionario = new JMenuItem("Funcionario");
		mnConsultaFuncionario.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnConsultaFuncionario.setBorderPainted(true);
		mnConsultaFuncionario.setIcon(new ImageIcon(GuiHome.class.getResource("/view/seta.png")));
		mnCadastro.add(mnConsultaFuncionario);
		
		JMenuItem mnConsultaFornecedor = new JMenuItem("Fornecedor");
		mnConsultaFornecedor.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnConsultaFornecedor.setIcon(new ImageIcon(GuiHome.class.getResource("/view/seta.png")));
		mnConsultaFornecedor.setActionCommand("Fornecedore");
		mnCadastro.add(mnConsultaFornecedor);
		
		JMenuItem mnCadastroNF = new JMenuItem("Nota Fiscal");
		mnCadastroNF.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnCadastroNF.setIcon(new ImageIcon(GuiHome.class.getResource("/view/seta.png")));
		mnCadastro.add(mnCadastroNF);
		
		JMenuItem mnCadastroCategoria = new JMenuItem("Categoria");
		mnCadastroCategoria.setIcon(new ImageIcon(GuiHome.class.getResource("/view/seta.png")));
		mnCadastroCategoria.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnCadastro.add(mnCadastroCategoria);
		
		JMenuItem mnCadastroSubCategoria = new JMenuItem("SubCategoria");
		mnCadastroSubCategoria.setIcon(new ImageIcon(GuiHome.class.getResource("/view/seta.png")));
		mnCadastroSubCategoria.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnCadastro.add(mnCadastroSubCategoria);
		
		JMenuItem mnCadastroMaterial = new JMenuItem("Material");
		mnCadastroMaterial.setIcon(new ImageIcon(GuiHome.class.getResource("/view/seta.png")));
		mnCadastroMaterial.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		mnCadastro.add(mnCadastroMaterial);
		
		JLabel lblNewLabel = new JLabel("IntelSinal");
		lblNewLabel.setForeground(new Color(153, 204, 153));
		lblNewLabel.setFont(new Font("Eras Bold ITC", Font.ITALIC, 42));
		lblNewLabel.setBounds(283, 223, 232, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblSistemas = new JLabel("sistemas");
		lblSistemas.setForeground(new Color(153, 204, 153));
		lblSistemas.setFont(new Font("Eras Bold ITC", Font.ITALIC, 16));
		lblSistemas.setBounds(413, 257, 78, 19);
		contentPane.add(lblSistemas);
		
		JLabel lblNewLabel_1 = new JLabel("Usu\u00E1rio:");
		lblNewLabel_1.setForeground(new Color(102, 153, 102));
		lblNewLabel_1.setBounds(21, 486, 56, 14);
		contentPane.add(lblNewLabel_1);
	}
}
