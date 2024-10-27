package bytebank_heredado;

public class TestArreglos {
	
	public static void main(String[] args) {
		
		
		Cliente clienteNormal = new Cliente();
		clienteNormal.setNombre("Flavio");

		Cliente clienteVip = new Cliente();
		clienteVip.setNombre("Romulo");

		Object[] refs = new Object[5];
		refs[0]  = clienteNormal;
		refs[1]  = clienteVip;

		System.out.println(((Cliente) refs[1]).getNombre());
	}

}
