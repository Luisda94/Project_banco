package bytebank_heredado;

public class testfuncionario {

	public static void main(String[] args) {
		Funcionario luis = new Gerente();
		luis.setDocumento("Luis");
		luis.setDocumento("1231");
		luis.setSalario(2000);
		luis.getBonificacion();
		System.out.println(luis.getSalario());
		System.out.println(luis.getBonificacion());
	}
}
