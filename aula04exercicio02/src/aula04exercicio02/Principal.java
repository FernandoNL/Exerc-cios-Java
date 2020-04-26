package aula04exercicio02;

import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		String string;
		
		System.out.println("Digite uma frase: ");
		string = in.nextLine();
		
		System.out.println("Modificações: \nEm caixa alta: "+string.toUpperCase());
		System.out.println("Em caixa baixa: "+string.toLowerCase());
		System.out.println("Quantidade de caracteres: "+string.length());
		if(string.equals("Eu estou estudando Java.")) {
			System.out.println("É igual a frase desejada!");
			}else
				System.out.println("Não é igual a frase desejada.");
		System.out.println("Quantidade de palavras: "+string.split(" ").length);
	}
}
