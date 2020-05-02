package criadoclassealunoetc;

import java.util.ArrayList;
import java.util.List;

import criandoconstantesstaticos.StatusAluno;

public class Aluno {
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
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
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
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
			 somaNotas += disciplina.getNota(); // fazendo a soma das notas 
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
		return "Aluno [nome=" + nome + ", idade=" + idade + ",\n dataNascimento=" 
				+ dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf 
				+ ",\n nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ",\n nomeEscola=" 
				+ nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}
	
}
