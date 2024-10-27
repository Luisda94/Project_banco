package bytebank_heredado;

public class TestHerencia {
	public static void main(String[] args) {
//		el elemento mas general puede adaptar al mas especifico
		
		Funcionario Funcionario = new Gerente();
		Funcionario.setNombre("Luis");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Lucia");
		
		Funcionario.setSalario(2132);
		
	}
}
