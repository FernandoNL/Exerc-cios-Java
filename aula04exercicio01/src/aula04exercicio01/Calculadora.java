package aula04exercicio01;

public class Calculadora {
	private double valorUm;
	private double valorDois;
	
	public double soma() {
		return this.valorUm+this.valorDois;
	}
	
	public double subtracao() {
		return this.valorUm-this.valorDois;
	}
	
	public double multiplicacao() {
		return this.valorUm*this.valorDois;
	}
	
	public double divisao() {
		return this.valorUm/this.valorDois;
	}

	public double getValorUm() {
		return valorUm;
	}

	public void setValorUm(double valorUm) {
		this.valorUm = valorUm;
	}

	public double getValorDois() {
		return valorDois;
	}

	public void setValorDois(double valorDois) {
		this.valorDois = valorDois;
	}
	
	
}
