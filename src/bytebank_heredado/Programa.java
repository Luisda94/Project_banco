package bytebank_heredado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//dato mi Luisiño para repasar esto repaa la lista, los areglos, los encapsulamiento y los polimorfimos si no te va a costar agarrarle el hilo.
/*Este código tiene como objetivo ordenar una 
lista de objetos (Leccion) 
usando un criterio definido,
en este caso, el tiempo de cada lección.

*Debes utilizar este tipo de código cuando quieras ordenar una colección de objetos 
según uno o más atributos. Algunos escenarios comunes:

    Ordenar productos en un carrito de compras por precio o cantidad.
    Ordenar empleados por su antigüedad o salario.
    Ordenar tareas en una lista según la prioridad o el tiempo estimado de duración.
*/
// Clase principal con el método main
	public class Programa {
		public static void main(String[] args) {
        Leccion leccionIntro = new Leccion("Introducción a las Colecciones", 20);
        Leccion leccionModelando = new Leccion("Modelando la clase Leccion", 18);
        Leccion leccionSets = new Leccion("Trabajando con Conjuntos", 16);

        List<Leccion> lecciones = new ArrayList<Leccion>();
        lecciones.add(leccionIntro);
        lecciones.add(leccionModelando);
        lecciones.add(leccionSets);

        // Ordenamos la lista de lecciones
        Collections.sort(lecciones);

        // Imprimimos las lecciones ordenadas
        for (Leccion leccion : lecciones) {
            System.out.println(leccion);
        }
    }
}

// Clase Leccion que implementa Comparable
class Leccion implements Comparable<Leccion> {

    private String titulo;
    private int tiempo;

    public Leccion(String titulo, int tiempo) {
        this.titulo = titulo;
        this.tiempo = tiempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    // Sobrescribimos el método compareTo para comparar las lecciones por tiempo
    @Override
    public int compareTo(Leccion otraLeccion) {
        return Integer.compare(this.tiempo, otraLeccion.getTiempo());
    }

    @Override
    public String toString() {
        return "[título: " + titulo + ", tiempo: " + tiempo + " minutos]";
    }
}
