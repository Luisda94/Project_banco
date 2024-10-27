package bytebank_heredado;

public class Contador extends Funcionario{
	
	@Override
	public double getBonificacion() {
		System.out.println("Ejucutado desde Contador");
		return 200;
	}

}
