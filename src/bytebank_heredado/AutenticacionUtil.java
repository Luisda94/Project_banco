package bytebank_heredado;

public class AutenticacionUtil {
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave =clave;
	}
	
	public boolean ingresarSeccion(String clave) {
		if (this.clave ==clave) {
			}
		return false;
	}

}
