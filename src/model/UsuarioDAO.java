package model;

import java.util.ArrayList;
import java.util.List;

import service.BD;

public class UsuarioDAO {

	private String sql,retorno;
	private BD bd;
	
	public UsuarioDAO() {
		bd = new BD();
	}

	/**
	 * Registra no banco um novo usuario e caso a chave primaria ja exista
	 * o usuario e atualizado.
	 * @param us recebe um objeto do tipo usuario
	 * @return retorna um String com o resultado de sucesso ou nao.
	 */

    public String cadastrar(Usuario us) 
    {
    	sql = "insert into usuario(nome,senha,loginUS,email,cargo) values (?,?,?,?,?); ";
    	bd.getConnection();
    	
        try
        {        	
        	bd.st = bd.con.prepareStatement(sql);
        	bd.st.setNString(1, us.nome);
        	bd.st.setNString(2, us.senha);
        	bd.st.setNString(3, us.loginUs);
        	bd.st.setNString(4, us.email);
        	bd.st.setNString(5, us.cargo);
        	bd.st.executeUpdate();
			retorno = "Usuario inserido com sucesso!";
			
			return retorno;
        }
        catch(Exception erro) {	
        	sql = "update usuario set nome=?, senha=?, loginUS=?, email=?, cargo=? where codusuario=?";
        	try {
        		bd.st = bd.con.prepareStatement(sql);
            	bd.st.setNString(1, us.nome);
            	bd.st.setNString(2, us.senha);
            	bd.st.setNString(3, us.loginUs);
            	bd.st.setNString(4, us.email);
            	bd.st.setNString(5, us.cargo);
            	bd.st.setInt(6, us.codusuario);
        		bd.st.executeUpdate();
        		retorno = "Funcionario atualizado com sucesso"; 
        	}
        	catch(Exception e) {retorno = "Falha no método alterar do usuarioDAO";}        	
        }		
		finally { bd.close(); }
		return retorno;
    }

    /**
     * Lista todos os usuarios no banco
     * @return retorna uma lista de usuarios.
     */
    public List<Usuario> listar()
    {
    	sql = "Select codusuario, nome, senha, loginUS, email, cargo from usuario"; 
    	bd.getConnection();
    	List<Usuario> lista = new ArrayList<Usuario>();
    	
        try
        {
        	bd.st = bd.con.prepareStatement(sql);
        	bd.rs = bd.st.executeQuery();
        	
            while(bd.rs.next()) {
            	lista.add(new Usuario(
            			bd.rs.getInt(1),
            			bd.rs.getString(2),
            			bd.rs.getString(3),
            			bd.rs.getString(4),
            			bd.rs.getString(5),
            			bd.rs.getString(6))
            	);
            }            
        }
        catch(Exception erro) {	lista = null; System.out.println("Falha no método listar do usuarioDAO");	}		
		finally { bd.close(); }
		return lista;
    }
    
    /**
     * Exclui do banco um usuario.
     * @param codigo variavel int que simboliza o codigo do usuario.
     * @return retorna em uma string o resultado de sucesso ou nao.
     */
    public String remover(int codigo)
    {
    	sql = "delete usuario where codusuario = ?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1,codigo);
			if(bd.st.executeUpdate()==1)
				retorno = "Usuario exclu�do com sucesso!";
			else
				retorno = "Usuario n�o foi encontrado!";
		}
		catch(Exception erro) {	retorno = "Falha no método remover do usuarioDAO";	}
		finally { bd.close(); }
		return retorno;    	
    }

    /**
     * Busca pelo nome de um usuario no banco de dados.
     * @param n uma String que sera pesquisada no banco.
     * @return retorna uma lista de usuarios compativeis com o nome.
     */
    public List<Usuario> buscaNome(String n)
    {    	
    	int cod = -1;
    	sql = "Select codusuario, nome, senha, loginUS, email, cargo from usuario where nome like '?'"; 
    	bd.getConnection();
    	List<Usuario> lista = new ArrayList<Usuario>();
    	
        try
        {
        	bd.st = bd.con.prepareStatement(sql);
        	bd.st.setNString(1, n);
        	bd.rs = bd.st.executeQuery();
        	
            while(bd.rs.next()) {
            	lista.add(new Usuario(
            			cod,
            			bd.rs.getString(1),
            			bd.rs.getString(2),
            			bd.rs.getString(3),
            			bd.rs.getString(4),
            			bd.rs.getString(5))
            	);
            }            
        }
        catch(Exception erro) {	lista = null; System.out.println(erro);	}		
		finally { bd.close(); }
		return lista;
	}
    
    /**
     * Busca pelo codigo de um usuario no banco de dados.
     * @param n uma variavvel inteira que serea pesquisada no banco.
     * @return retorna uma lista de usuarios compativevis com o codigo.
     */
    public List<Usuario> buscaCodigo(int n)
    {    	
    	int cod = -1;
    	sql = "Select codusuario, nome, senha, loginUS, email, cargo from usuario where codusuario=?'"; 
    	bd.getConnection();
    	List<Usuario> lista = new ArrayList<Usuario>();
    	
        try
        {
        	bd.st = bd.con.prepareStatement(sql);
        	bd.st.setInt(1, n);
        	bd.rs = bd.st.executeQuery();
        	
            while(bd.rs.next()) {
            	lista.add(new Usuario(
            			cod,
            			bd.rs.getString(1),
            			bd.rs.getString(2),
            			bd.rs.getString(3),
            			bd.rs.getString(4),
            			bd.rs.getString(5))
            	);
            }            
        }
        catch(Exception erro) {	lista = null; System.out.println(erro);	}		
		finally { bd.close(); }
		return lista;
	}
    
    /**
     * Faz a operacao de login, recebendo um usuario e confirmando
     * se existe no banco.
     * @param us uma variavel do tipo Usuario.
     * @return retorna uma lista de usuario, com um usuario ou nula.
     */
    public List<Usuario> fazerLogin(Usuario us)
    {    	
    	sql = "Select codusuario, nome, senha, loginUS, email, cargo from usuario "
    			+ "where nome = ? and senha = ?"; 
    	bd.getConnection();
    	List<Usuario> lista = new ArrayList<Usuario>();
    	
        try
        {
        	bd.st = bd.con.prepareStatement(sql);
        	bd.st.setNString(1, us.nome);
        	bd.st.setNString(2, us.senha);
        	bd.rs = bd.st.executeQuery();
        	
        	while(bd.rs.next()) {
            	lista.add(new Usuario(
            			bd.rs.getInt(1),
            			bd.rs.getString(2),
            			bd.rs.getString(3),
            			bd.rs.getString(4),
            			bd.rs.getString(5),
            			bd.rs.getString(6))
            	);
            }        	
        }
        catch(Exception erro) {	lista = null; System.out.println(erro);	}		
		finally { bd.close(); }
		return lista;
    }

	
}
