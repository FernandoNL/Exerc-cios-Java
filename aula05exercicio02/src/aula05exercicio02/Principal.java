package aula05exercicio02;
import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("Bem vindo!\n");
		System.out.println("Selecione um opção: ");
		System.out.println("1 - Calculo da Área de um retângulo.");
		System.out.println("2 - Calculo da Área de um trinângulo retãngulo.");
		opcao = in.nextInt();
		
		switch(opcao) {
			case 1:
				Retangulo retangulo = new Retangulo();
				System.out.println("Base: " );
				retangulo.setBase(in.nextDouble());
				System.out.println("Altura: ");
				retangulo.setAltura(in.nextDouble());
				System.out.println("Área: "+retangulo.calculoArea());
				break;
			case 2:
				TrianguloRetangulo tRetangulo = new TrianguloRetangulo();
				System.out.println("Base: ");
				tRetangulo.setBase(in.nextDouble());
				System.out.println("Altura: ");
				tRetangulo.setAltura(in.nextDouble());
				System.out.println("Área: "+tRetangulo.calculoArea());
				System.out.println("Deseja calcular a Hipotenusa? 1 - Sim | 2 - Não");
				int opcaoHipotenusa = in.nextInt();
					if(opcaoHipotenusa == 1)
						System.out.println("Hipotenusa: "+tRetangulo.calculoHipotenusa());
				break;
			default:
				System.out.println("Opção inválida!");
				break;
		}
}
}
