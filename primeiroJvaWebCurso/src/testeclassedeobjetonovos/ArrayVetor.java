package testeclassedeobjetonovos;

import javax.swing.JOptionPane;

import criadoclassealunoetc.Aluno;
import criadoclassealunoetc.Disciplina;



public class ArrayVetor {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Aluno aluno2 = new Aluno();
		// as notas 
		double[] notas = {8,10,9,7};
		double[] notas2 = {8.4,10,9.5,7.7};
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
		
		
		//aluno2 
		aluno2.setNome("Outro");
		aluno2.setNomeEscola("Programação");
		// setado as disciplinas 
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("JavaScrip");
		disciplina3.setNota(notas2);
		// adicionando aa e notas
		aluno2.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("SQL");
		disciplina4.setNota(notas2);
		
		aluno2.getDisciplinas().add(disciplina4);
		// --------------------------------------------------------
		Aluno[]  arrayAluno = new Aluno[2];
		
		arrayAluno[0] = aluno;
		arrayAluno[1] = aluno2;
		double notaMax = 0;
		double notaMin = 0;
		System.out.println(" -----  Alunos ------");
		for (int pos = 0; pos < arrayAluno.length; pos++) {
			System.out.println(" Nome do aluno é: " + arrayAluno[pos].getNome());
			
			for (Disciplina d : arrayAluno[pos].getDisciplinas()) {
				System.out.println("  Disciplina: " + d.getDisciplina());
				
				for (int i = 0; i < d.getNota().length; i++) {
					System.out.println(" Nota " +(i+1)+": "+d.getNota()[i]);
					if (i == 0) {
						notaMax = d.getNota()[i];
					}else {
						if (d.getNota()[i] > notaMax) {
						notaMax = d.getNota()[i];
						}
					}
					// menor nota
					if (i == 0) {
						notaMin = d.getNota()[i];
					}else {
						if (d.getNota()[i] < notaMin) {
						notaMin = d.getNota()[i];
						}
					}
			
			
				}
				System.out.println(" A maior nota da disciplina  = " + d.getDisciplina()+ " é: "+notaMax);
				System.out.println(" A menor nota da disciplina  = " + d.getDisciplina()+ " é: "+notaMin);
			}
		}
		
		

	
	}

}
