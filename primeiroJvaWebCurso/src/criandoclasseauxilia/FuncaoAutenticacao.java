package criandoclasseauxilia;

import criandointerfaces.PermitirAcesso;

// permisão extremo 
public class FuncaoAutenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticarCursoJava() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao (PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
