package criadoclassealunoetc;

import java.util.ArrayList;
import java.util.List;

import criandoconstantesstaticos.StatusAluno;

public class Aluno extends Pessoa{
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	// instacia do objeto disciplina
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	
	
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	
	// metodo retorno de media 
	public double getMediaNota() {
		double somaNotas = 0.0;
		 for (Disciplina disciplina : disciplinas) {
			 somaNotas += disciplina.getMediaNotas(); // fazendo a soma das notas 
		 }
		return somaNotas / disciplinas.size(); // fazendo a divisao com essa funçao que conta do java
	}
	
	// metodo retorna verdadei ou falso de aprovado
	public boolean getAlunoAprovado() {
			double media = this.getMediaNota();
		if(media >= 70) {
			return true;
		}else {
			return false;
		}
	}
	// metodo string como message se aprovado 
	public String getAlunoAprvado() {
		double media = this.getMediaNota();
		if(media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;	
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}
	@Override
	public String toString() {
		return super.toString() + "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + "]";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
