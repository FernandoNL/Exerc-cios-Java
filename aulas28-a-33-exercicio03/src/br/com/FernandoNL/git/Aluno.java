package br.com.FernandoNL.git;

import java.util.Arrays;

public class Aluno {
	private String nome;
	private String matricula;
	private String curso;
	private String[] disciplinas;
	private double[][] notas;
	
	public Aluno() {
		disciplinas = new String[3];
		notas = new double[3][3];
	}
	
	public Aluno(String nome, String matricula, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		disciplinas = new String[3];
		notas = new double[3][3];
	}
	
	public void adicionarDisciplina(int index, String disciplina) {
		this.disciplinas[index]= disciplina;
	}
	
	public void adicionarNotas(int indexLinhas, int indexColunas, double nota) {
		this.notas[indexLinhas][indexColunas] = nota;
	}
	
	public boolean verificarAprovado(int index) {
		
		double soma = 0; 
		
		for(int i = 0;i<this.notas[index].length;i++) {
			soma += this.notas[index][i];
		}
		
		double media = soma/this.notas.length;
		
		if(media >= 7)
			return true;
		return false;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String[] getDisciplinas() {
		return disciplinas;
	}

	public double[][] getNotas() {
		return notas;
	}

}
