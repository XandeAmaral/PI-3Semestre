package control;

import model.Fornecedor;
import model.FornecedorDAO;

public class FornecedorControle {
	private Fornecedor fornecedor;
	private FornecedorDAO dao;
	private String retorno;
	
	/** Realiza os testes de campo da camada view.
	 * 
	 * @param codFornecedor - recebe codigo do fornecedor.
	 * @param nome - recebe nome do fornecedor em string.
	 * @param cnpj - recebe o cnpj do fornecedor em string.
	 * @param telefone - recebe o telefone do fornecedor em string.
	 * @param email - recebe o email do fornecedor em string.
	 * @return - retorna verdadeiro caso salvo com  sucesso ou falso caso nao sucesso.
	 */
	public boolean checarCampos(String nome, String cnpj,String telefone, String email) {
				
		if( nome != null && nome.length() >0 
				&& cnpj != null && cnpj.length() >0 && telefone!= null && telefone.length() >0 
				&& email != null && email.length() >0 ) {			
			return true;	
		} 
		else return false;
	}
}
