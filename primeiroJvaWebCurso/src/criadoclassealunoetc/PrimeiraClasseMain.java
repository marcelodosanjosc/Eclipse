package criadoclassealunoetc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import criandoclasseauxilia.FuncaoAutenticacao;
import criandoconstantesstaticos.StatusAluno;
import criandointerfaces.PermitirAcesso;

public class PrimeiraClasseMain {

	public static void main(String[] args) {
		try {
		
		// login
		String login = JOptionPane.showInputDialog(" Informe o login ");
		String senha = JOptionPane.showInputDialog(" Informe a senha ");
	
		
		
		PermitirAcesso permitirAcesso = new Secretario(login, senha);
		
		if (new FuncaoAutenticacao(permitirAcesso).autenticarCursoJava()) {
			
		
		
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		// 
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		// lista separada
		List<Aluno> alunosAprovado = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovado = new ArrayList<Aluno>();
		
		for (int quatidade = 1; quatidade <=2;quatidade++ ) {
		
		Aluno aluno1 = new Aluno();
		
		String nome = JOptionPane.showInputDialog("Qual nome do aluno "+quatidade+"? ");
		/*String idade = JOptionPane.showInputDialog("Qual a idade ");
		String dataNasc = JOptionPane.showInputDialog("Data de Nascimento");
		String rg = JOptionPane.showInputDialog("RG");
		String cpf = JOptionPane.showInputDialog("CPF");
		String mae = JOptionPane.showInputDialog("Nome da mãe");
		String pai = JOptionPane.showInputDialog("Nome do Pai");
		String dataMat = JOptionPane.showInputDialog("Data da Matricula");
		String nomeEscola = JOptionPane.showInputDialog("Nome da Escola ");
		String serie = JOptionPane.showInputDialog("Serie Matriculado ");*/
				
		
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.parseInt(idade));
		aluno1.setDataNascimento(dataNasc);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(dataMat);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(serie);*/
		
		// para add as discipina na lista
		
		for (int pos = 1; pos <= 1;pos++) {
			String disc = JOptionPane.showInputDialog("Nome da Disciplina "+pos+" ?");
			String nota = JOptionPane.showInputDialog("Digite a Nota "+pos+" ?");
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(disc);
		//	disciplina.setNota((Double.parseDouble(nota)));
			aluno1.getDisciplinas().add(disciplina);
			
		}
		
		/*int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ? ");
		
		if (escolha == 0) {
			int continuaRemover = 0;
			int posicao = 1;
			while (continuaRemover == 0){
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - posicao);// removedo na posição do array
					posicao++; // soma mais 1 
					continuaRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ?");
				}
		}
		*/
		
		aluno1.getMediaNota();
		 alunos.add(aluno1);
		 
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		// add na lista separada 
		for (Aluno aluno : alunos) {
			if (aluno.getAlunoAprvado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else if (aluno.getAlunoAprvado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);
			}else if (aluno.getAlunoAprvado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
		
		
		System.out.println(" ------- Lista de aprovados ---------- ");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println(" Nome do aluno: "+aluno.getNome());
			System.out.println("Resultado: "+ aluno.getAlunoAprvado() + " com media: "+ aluno.getMediaNota());
		}
		
		System.out.println(" ------- Lista de recuperação ---------- ");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println(" Nome do aluno: "+aluno.getNome());
			System.out.println("Resultado: "+ aluno.getAlunoAprvado() + " com media: "+ aluno.getMediaNota());
		}
		
		System.out.println(" ------- Lista de reprovados ---------- ");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println(" Nome do aluno: "+aluno.getNome());
			System.out.println("Resultado: "+ aluno.getAlunoAprvado() + " com media: "+ aluno.getMediaNota());
		}
		
		/*
		// percorrendo a lista 
		for (int pos = 0; pos < alunos.size(); pos++) {
			Aluno aluno = alunos.get(pos);
			System.out.println("Nome do aluno: "+aluno.getNome());
			System.out.println("Media é: "+aluno.getMediaNota());
			System.out.println(" Resultado: "+aluno.getAlunoAprvado());
			System.out.println(" ---- -- -------------------  -- --- --- ---");
			 	// percorrendo a disciplina 
				for (int posd = 0; posd < aluno.getDisciplinas().size();posd++) {
						Disciplina disciplina = aluno.getDisciplinas().get(posd);
						System.out.println(" Materia: " + disciplina.getDisciplina()+ " Nota: "+ disciplina.getNota());
						System.out.println("----------- ----------- ---------- -------");
				}
		}
		// para substitui para outro objeto
			System.out.println("---- Trocando Aluno -------");
		for (int pos = 0; pos < alunos.size(); pos++) {
			
			Aluno aluno = alunos.get(pos);
			if (aluno.getNome().equalsIgnoreCase("marcelo")) {
				Aluno trocar = new Aluno();
				trocar.setNome("Aluno fo trocado");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(" PHP ");
				disciplina.setNota(89);
				
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(pos, trocar);
				aluno = alunos.get(pos);
			}
			System.out.println("Nome do aluno: "+aluno.getNome());
			System.out.println("Media é: "+aluno.getMediaNota());
			System.out.println(" Resultado: "+aluno.getAlunoAprvado());
			System.out.println(" ---- -- -------------------  -- --- --- ---");
			 	// percorrendo a disciplina 
				for (int posd = 0; posd < aluno.getDisciplinas().size();posd++) {
						Disciplina disciplina = aluno.getDisciplinas().get(posd);
						System.out.println(" Materia: " + disciplina.getDisciplina()+ " Nota: "+ disciplina.getNota());
						System.out.println("----------- ----------- ---------- -------");
				}
		}
		
		*/
		
		
		
		
		// imprimindo todos 
		/*for (Aluno aluno : alunos) {
			
			
			System.out.println(aluno.toString());
			System.out.println("A media "+ aluno.getMediaNota());
			System.out.println("A media "+ aluno.getAlunoAprovado());
			System.out.println(" O resultado "+ aluno.getAlunoAprvado());
			System.out.println(aluno.getDisciplinas().toString());
			System.out.println("---------------------------------------------------------------");
			
			}
		// buscado na lsita nome se eguais ignorando case sencitive
		for (Aluno aluno : alunos) {
			
		if (aluno.getNome().equalsIgnoreCase("marcelo")) {
		System.out.println(aluno.toString());
		System.out.println("A media "+ aluno.getMediaNota());
		System.out.println("A media "+ aluno.getAlunoAprovado());
		System.out.println(" O resultado "+ aluno.getAlunoAprvado());
		System.out.println(aluno.getDisciplinas().toString());
		System.out.println("---------------------------------------------------------------");
		break;
		}
		}
		// for que remove 
		for (Aluno aluno : alunos) {
			
			if (aluno.getNome().equalsIgnoreCase("marcelo")) {
				alunos.remove(aluno);
			
			break;
			}else {
				System.out.println(aluno.toString());
				System.out.println("A media "+ aluno.getMediaNota());
				System.out.println("A media "+ aluno.getAlunoAprovado());
				System.out.println(" O resultado "+ aluno.getAlunoAprvado());
				System.out.println(aluno.getDisciplinas().toString());
				System.out.println("---------------------------------------------------------------");
			}
			}
		 // for dentro de for com as sobras 
			for (Aluno aluno : alunos) {
				System.out.println("Alunos que sobraram na lista");
				System.out.println(aluno.getNome());
				System.out.println("Suas materias são: ");
				 for (Disciplina disciplina : aluno.getDisciplinas()) {
					 System.out.println(disciplina.getDisciplina());
					 
				 }
			}*/
	}else {
		JOptionPane.showMessageDialog(null, " login ou senha incorretas !!");
		System.out.println(" login ou senha incorretas !!");
	}
	
	} catch (NumberFormatException e) {
		e.printStackTrace();
		
		JOptionPane.showMessageDialog(null, "Erro ");
	} catch (NullPointerException e) {
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "opa um null positer :"+e.getClass());
	} catch (Exception e) {
		StringBuilder saida = new StringBuilder();
		e.printStackTrace();
		for (int i = 0; i< e.getStackTrace().length; i++) {
			saida.append("\n Classe de erro : " +e.getStackTrace()[i].getClassName());
			saida.append("\n Metodo de erro : " +e.getStackTrace()[i].getMethodName());
			saida.append("\n Linha de erro : " +e.getStackTrace()[i].getLineNumber());
			saida.append("\n Classe2 de erro : " +e.getClass().getName());
		}
		JOptionPane.showMessageDialog(null, "Erro ");
	}
		
	}
}
