package bytebank_heredado;

public class TestControBonificacion {
	public static void main(String[] args) {
		
		Funcionario Luis = new Gerente();
		Luis.setSalario(2000);
		
		Gerente Lucia = new Gerente();
		Lucia.setSalario(10000);
		
		Contador Alexis = new Contador();
		Alexis.setSalario(10000);
		
		ControlBonficacion controlBonficacion =
			new	ControlBonficacion();
		
		controlBonficacion.registrarSalario(Luis);
		
		controlBonficacion.registrarSalario(Lucia);
		controlBonficacion.registrarSalario(Alexis);
		
	}

}
