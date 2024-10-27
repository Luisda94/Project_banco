package bytebank_heredado;

public class TestGerente {
public static void main(String[] args) {
	Gerente gerente = new Gerente();
//	gerente.setSalario(50000);
//	System.err.println(gerente.getSalario());
//	funcionario gerente = new funcionario();
	gerente.setSalario(6000);
	gerente.setclave("Aluracursos");
	gerente.setTipo(1);
	
	System.out.println(gerente.getBonificacion());
	System.out.println(gerente.ingresarSeccion("Aluracursos"));
}
}
