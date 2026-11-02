/**
 * Class Pelicula
 */
package uni1a;
import java.util.ArrayList;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private ArrayList<Actor> actores; // Lista de actores que faltaba

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        actores = new ArrayList<>(); // Inicializamos la lista
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    // Método para agregar actores (lo que faltaba)
    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        // Mostramos los actores
        System.out.println("Actores:");
        for(Actor a : actores) {
            a.mostrarDatos();
        }
    }
}