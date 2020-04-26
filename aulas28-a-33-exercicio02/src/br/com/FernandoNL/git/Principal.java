/**
 * 
 */
package br.com.FernandoNL.git;

/**
 * @author fernando
 *
 */
public class Principal {
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();

		//Sacar um valor com saldo
		conta.setNumeroConta(27522);
		conta.setSaldo(5000);
		conta.setLimite(5000);
		conta.setContaEspecial(true);
		
		if(conta.sacar(1000))
			System.out.println("Saque Efetuado com Sucesso!");
		
		if(conta.sacar(4000)) {
			System.out.println("Saque Efetuado com Sucesso!");
		}else {
			System.out.println("Saque Não Efetuado");
		}
		
		//Depositar um valor
		if(conta.depositar(150)) {
			System.out.println("\nDeposito Efetuado com Sucesso");
		}else {
			System.out.println("Deposito Não Realizado");
		}
		
		//Consultando saldo
		System.out.println("Saldo atual: "+conta.consultarSaldo());
		conta.depositar(100);
		System.out.println("Deposito de 100: "+conta.consultarSaldo());
		conta.sacar(200);
		System.out.println("Saque de 200: "+conta.consultarSaldo());
		
		
		//Cheque especial
		if(conta.chqueEspecial()) {
			System.out.println("Utilizou o Chque Especial");
		}else {
			System.out.println("Não Utilizou o Ceque Especial");
		}
	}

}
