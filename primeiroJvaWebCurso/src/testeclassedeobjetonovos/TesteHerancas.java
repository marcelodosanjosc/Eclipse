package testeclassedeobjetonovos;

import criadoclassealunoetc.Diretor;

public class TesteHerancas {

	public static void main(String[] args) {
		Diretor di = new Diretor();
		di.setNome("MARCELO");
		di.setIdade(30);
		di.pessoaMaiorIdade();
		System.out.println("Nome direto:"+ di.getNome());
		System.out.println("Maior de idade: "+di.pessoaMaiorIdade());

	}

}
