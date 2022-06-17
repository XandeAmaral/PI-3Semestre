package control;

import model.Usuario;
import model.UsuarioDAO;

public class UsuarioControle {
	private Usuario usuario;
	private UsuarioDAO dao;
	private String retorno;
	    
	public boolean checarCampos(String nome, String senha,String loginUs, String email, String cargo) {
		
		if( nome != null && nome.length() >0 
				&& senha != null && senha.length() >0 && loginUs!= null && loginUs.length() >0 
				&& email != null && email.length() >0 ) {			
			return true;
		} 
		else return false;
	}
}
