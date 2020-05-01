package criadoclassealunoetc;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PrimeiraClasseMain {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		
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
		
		for (int pos = 1; pos <= 4;pos++) {
			String disc = JOptionPane.showInputDialog("Nome da Disciplina "+pos+" ?");
			String nota = JOptionPane.showInputDialog("Digite a Nota "+pos+" ?");
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(disc);
			disciplina.setNota(Double.parseDouble(nota));
			aluno1.getDisciplinas().add(disciplina);
			
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ? ");
		
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
		
		
		aluno1.getMediaNota();
		 alunos.add(aluno1);
		}
		// imprimindo todos 
		for (Aluno aluno : alunos) {
			
			
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
			}
	}

}
