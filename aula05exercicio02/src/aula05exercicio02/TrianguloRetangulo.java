package aula05exercicio02;

public class TrianguloRetangulo  extends Figuras{
 
	@Override
	public double calculoArea() {
		return (this.getBase()*this.getAltura())/2;
	}
	
	public double calculoHipotenusa() {
		return Math.sqrt((Math.pow(this.getBase(), 2)+(Math.pow(this.getAltura(), 2)))); //Faz o calculo segundo o teorema de pitagoras onde hipotenusa²=base²+xaltura²
		
	}
	
}
