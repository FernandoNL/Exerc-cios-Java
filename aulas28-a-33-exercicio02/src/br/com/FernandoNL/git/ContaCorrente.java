package br.com.FernandoNL.git;

public class ContaCorrente {
	private int numeroConta;
	private double saldo, limite;
	private boolean contaEspecial = false;
	
	public ContaCorrente() {}
	
	public ContaCorrente(int numeroConta, double saldo, double limite, boolean contaEspecial) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.limite = limite;
		this.contaEspecial = contaEspecial;
	}

	public boolean sacar(double valor) {
		if(this.saldo >= valor) {
				this.saldo -= valor;
			return true;
		}else { //Irá verificar se a conta é especial
			if(this.contaEspecial) {
				double limite = this.saldo + this.limite;
					if(limite>=valor) {
						saldo -= valor;
						return true;
					}else {
						return false;
					}
			}else { //Conta não possui limite e não é especial
				return false;
			}
		}
	}
	
	public boolean depositar(double valor) {
		this.saldo += valor;
		return true;
	}
	
	public double consultarSaldo () {
		return getSaldo();
	}
	
	public boolean chqueEspecial() {
		return saldo < 0;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean isContaEspecial() {
		return contaEspecial;
	}

	public void setContaEspecial(boolean contaEspecial) {
		this.contaEspecial = contaEspecial;
	}

	@Override
	public String toString() {
		return "ContaCorrente [numeroConta=" + numeroConta + ", saldo=" + saldo + ", limite=" + limite
				+ ", contaEspecial=" + contaEspecial + "]";
	}
	
	
	
}
