package testeclassedeobjetonovos;

import javax.swing.JOptionPane;

import criadoclassealunoetc.Aluno;
import criadoclassealunoetc.Disciplina;



public class ArrayVetor {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		// as notas 
		double[] notas = {8,10,9,7};
		// setado dado do aluno 
		aluno.setNome("Marcelo");
		aluno.setNomeEscola("JavaWeb");
		// setado as disciplinas 
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");
		disciplina.setNota(notas);
		// adicionando aa e notas
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("MSQL");
		disciplina2.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina2);
		
		// varrendo  o for 
		System.out.println("Nome do aluno:"+aluno.getNome());
		System.out.println("Nome da Escola:"+aluno.getNomeEscola());
		System.out.println(" ---- Disciplinas: ----");
		for(Disciplina d : aluno.getDisciplinas()) { // a disciplina 
			
			System.out.println("  Disciplina: " + d.getDisciplina());
			System.out.println("As notas da disciplina são: ");	
			for (int i = 0; i < d.getNota().length; i++) { // as notas
				System.out.println("Nota "+(i+1)+ ": " +d.getNota()[i]);
			}
		
		}
		
		
		
		
		
		

	
	}

}
