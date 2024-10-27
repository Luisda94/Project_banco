package bytebank_heredado;

public class Gerente  extends Funcionario implements Autenticable{
	
	 

//	esto es sobre escritura de la clase madre is good 
	public double getBonificacion(){	
		System.out.println("Ejucutado desde Gerente");
		return getSalario() + getBonificacion(); 

}
	public double getSalario() {
	// TODO Auto-generated method stub
	return 2000;
}
	public void setclave(String string) {
		// TODO Auto-generated method stub
		
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