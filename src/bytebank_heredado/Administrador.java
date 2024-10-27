package bytebank_heredado;

public class Administrador extends Funcionario implements Autenticable {


	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getClave() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ingresarSeccion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
