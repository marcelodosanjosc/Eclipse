package criadoclassealunoetc;

import criandointerfaces.PermitirAcesso;

public class Diretor extends Pessoa implements PermitirAcesso{
	private int registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	private String login;
	private String senha;
	
	public Diretor(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
		
	public Diretor() {
		
	}
		
	public int getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(int registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	@Override
	public boolean pessoaMaiorIdade() {
		
		return getIdade() >= 21;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + "]";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
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
	

