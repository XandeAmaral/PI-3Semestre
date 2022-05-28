package model;

public class Usuario extends Funcionario {
	private boolean administrador;
	
	public boolean getAdministrador() {
		return administrador;
	}
	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}	
	
	
	public Usuario() {}
	
	public Usuario(int codigo, String nome, String senha,
			Boolean administrador, String login, String email, String cargo) {
		if (codigo <= 0) this.setCodigo(codigo);
		this.setNome(nome);
		this.setSenha(senha);
		this.setAdministrador(administrador);
		this.setLogin(login);
		this.setEmail(email);
		this.setCargo(cargo);
	}
	
	public String toString() {
		return getCodigo()+";"+getNome()+";"+getAdministrador()+";"+getLogin()+
				";"+getEmail()+";"+getCargo();
	}
}
