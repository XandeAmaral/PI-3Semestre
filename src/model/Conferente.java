package model;

public class Conferente extends Funcionario{
	
	public Conferente() {}
	public Conferente(int codigo, String nome, String senha, String login, String email) {
		if (codigo <= 0) this.setCodigo(codigo);
		this.setNome(nome);
		this.setSenha(senha);
		this.setLogin(login);
		this.setEmail(email);
	}
	
	public String toString() {
		return getCodigo()+";"+getNome()+";"+getLogin()+";"+getEmail()+";"+getCargo();
	}
}
