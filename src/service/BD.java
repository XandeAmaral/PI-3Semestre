package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BD {
	
	public Connection con = null;//realiza a conex�o ao banco.
	public PreparedStatement st = null; //executa instru��es SQL.
	public ResultSet rs = null; //armazena as querys.
	
	public final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; //driver de conex�o ao banco
	public final String BANCO = "fornecedor";
	//public final String URL = "jdbc:sqlserver://localhost:1433;databasename="+BANCO;
	private final String URL = "jdbc:sqlserver://localhost:1433;databasename="+BANCO+";encrypt=true;trustServerCertificate=true";
	public final String LOGIN = "sa";
	public final String SENHA = "123456789";
	
	/**
	 * Abre uma conex�o com o banco de dados a partir dos dados definidos acima
	 * @return - true em caso de sucesso ou false caso contr�rio
	 */
	public boolean getConnection() {
		//carrega o driver
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL,LOGIN,SENHA);
			System.out.println("Sucesso!!");
			return true;
		}
		catch(ClassNotFoundException erro) {
			System.out.println("Driver n�o encontrado!!!");
			return false;
		}
		catch (SQLException erro) {
			System.out.println("Falha na conex�o !!!"+erro);
			return false;
		}
	}
	/**
	 * Encerra a conex�o com o banco de dados
	 */
	public void close() {
		try {
			if(rs!=null) rs.close();
			
		}
		catch(SQLException erro) {
			
		}
		try {
			if(st!=null) st.close();
			
		}
		catch(SQLException erro) {
			
		}	try {
			if(con!=null) {
				con.close();
			
			System.out.println("Desconectou!!");
			}
		}
		catch(SQLException erro) {
			
		}
	}
	
	public static void main(String[] args) {
		BD bd = new BD();
		bd.getConnection();
		bd.close();
	}

}
