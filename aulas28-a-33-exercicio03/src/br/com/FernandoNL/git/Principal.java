/**
 * 
 */
package br.com.FernandoNL.git;

import java.util.Scanner;

/**
 * @author fernando
 *
 */
public class Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite seu nome: ");
		aluno.setNome(in.next());
		System.out.println("Digite sua matricula: ");
		aluno.setMatricula(in.next());
		System.out.println("Digite seu curso: ");
		aluno.setCurso(in.next());
		
		for(int i = 0;i<aluno.getDisciplinas().length;i++) {
			System.out.println((i+1)+"ª Disciplina: ");
			aluno.adicionarDisciplina(i, in.next());
			for(int j = 0;j<aluno.getNotas()[i].length;j++) {
				System.out.println((j+1)+"ª Nota: ");
				aluno.adicionarNotas(i, j, in.nextDouble());
			}
		}
			
		for(int i = 0;i<aluno.getDisciplinas().length;i++) {
			if(aluno.verificarAprovado(i)) {
				System.out.println("Disciplina: "+aluno.getDisciplinas()[i]+" - Aprovado");
			}else{
				System.out.println("Disciplina: "+aluno.getDisciplinas()[i]+" - Reprovado");
			}
		}
	}
}
