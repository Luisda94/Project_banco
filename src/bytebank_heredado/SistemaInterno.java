package bytebank_heredado;
	 public class SistemaInterno {
		 
		 private String clave = "Aluracursos";
		 
	public boolean verificar(Autenticable admin) {
		boolean puedeIniciarSesion = admin.ingresarSeccion(clave);
		if (puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("Error en Login");
			return false;	
		}
	}
		
}
