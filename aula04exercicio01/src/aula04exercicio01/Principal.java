package aula04exercicio01;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		Calculadora calculadora = new Calculadora();
		String opcao;
		
		System.out.println("\t  Calculadora");
		System.out.println("Primeiro Valor: ");
		calculadora.setValorUm(in.nextDouble());
		System.out.println("Operações: \n(+)Soma\t(-)Subtração\n(*)Multiplicação\t(/) Divisão");
		System.out.println("Digite a operação que deseja realizar: ");
		opcao = in.next();
		System.out.println("Segundo Valor: ");
		calculadora.setValorDois(in.nextDouble());
		
		switch(opcao) {
			case "+":
				System.out.println(calculadora.getValorUm()+" "+opcao+" "+calculadora.getValorDois()+" = "+calculadora.soma());
				break;
			case "-":
				System.out.println(calculadora.getValorUm()+" "+opcao+" "+calculadora.getValorDois()+" = "+calculadora.subtracao());
				break;
			case "*":
				System.out.println(calculadora.getValorUm()+" "+opcao+" "+calculadora.getValorDois()+" = "+calculadora.multiplicacao());
				break;
			case "/":
				System.out.println(calculadora.getValorUm()+" "+opcao+" "+calculadora.getValorDois()+" = "+calculadora.divisao());
				break;
			default:
				System.out.println("Operação Inválida!");
				break;
		}
	}
}
