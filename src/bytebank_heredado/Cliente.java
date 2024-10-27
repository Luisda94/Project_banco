package bytebank_heredado;

public class Cliente implements Autenticable {
	private String nombre;
	private String documento;
	private String telefono;
	
	private AutenticacionUtil util;
	private String clave;
	
	 public Cliente() {
		 this.setUtil(new AutenticacionUtil());
	 }
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String getClave() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setClave(String clave) {
		this.clave =clave;
	}
	
	public boolean ingresarSeccion(String clave) {
		if (this.clave ==clave) {
			}
		return false;
	}

	public AutenticacionUtil getUtil() {
		return util;
	}

	public void setUtil(AutenticacionUtil util) {
		this.util = util;
	}


}
