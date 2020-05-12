package criadoclassealunoetc;

import criandointerfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso{
	private int registro;
	private int nivelCargo;
	private String experiencia;
	
	private String login;
	private String senha;
	
	public Secretario() {
		
	}
	
	public Secretario (String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public int getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(int nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	
	
	
	@Override
	public String toString() {
		return super.toString() + "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", toString()=" + "]";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	// metodo de co contrado de autenticação 

	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return  autenticar();
		
	 }
	@Override
	public boolean autenticar() {
		
		return login.equals("admin") && senha.equals("admin");
	}
}
