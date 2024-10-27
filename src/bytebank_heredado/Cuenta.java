package bytebank_heredado;

//entidad cuenta:
public abstract class Cuenta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente(); 
	// valor es parametro "siempre tener nombre distinto a variable".
	private static int total;
	
	public Cuenta (int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Cuenta creada" + agencia);
		
		Cuenta.total ++;
	}

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
 
    public boolean transfiere(double valor, Cuenta destino) {
        if(this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

	public double getSaldo() {
		return this.saldo;
	}
	
	
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Cuenta.total = total;
	}

}

//en la progrmacion dirigida a objetos definimos como metodo toda secuencia de pasos para 
// definir una accion
// puede tener o no parametros
// que son los parametros ()
// el metodo tiene un alcance
// en java existen dos tipos de metodos
// los que retornan y los que no
// void es metodo para no retornar valor

//this es una referencia para que sea facil de leer , que a su vez es una palabra clave de java o reservada
