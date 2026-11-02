/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.ArrayList;

public class SerieDeTV extends ContenidoAudiovisual {
    private String productora;
    private ArrayList<Temporada> temporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, String productora) {
        super(titulo, duracionEnMinutos, genero);
        this.productora = productora;
        temporadas = new ArrayList<>();
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    // Método para agregar temporadas
    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Productora: " + productora);
        System.out.println("Temporadas:");
        for(Temporada t : temporadas) {
            t.mostrarDatos();
        }
    }
}