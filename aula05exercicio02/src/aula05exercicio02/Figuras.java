package aula05exercicio02;

public abstract class Figuras {
	private double base;
	private double altura;
	
	public abstract double calculoArea();

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
