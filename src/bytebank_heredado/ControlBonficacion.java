package bytebank_heredado;

public class ControlBonficacion {
	
	private double suma;
	
	public double registrarSalario(Funcionario funcionario){
	this.suma = funcionario.getBonificacion() + this.suma;
	System.out.println("Calculo actual: " + this.suma);
	return this.suma;
	}
//	
//	public double registrarSalario(Gerente gerente){
//	this.suma = gerente.getBonificacion() + this.suma;
//	System.out.println("Calculo actual: " + this.suma);
//	return this.suma;
//	}
	

}
