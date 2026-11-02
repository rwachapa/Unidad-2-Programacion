package uni1a;

public class PodcastAudiovisual extends ContenidoAudiovisual {
    private String categoriaPodcast;

    public PodcastAudiovisual(String titulo, int duracionEnMinutos, String genero, String categoriaPodcast) {
        super(titulo, duracionEnMinutos, genero);
        this.categoriaPodcast = categoriaPodcast;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del podcast:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Categoría: " + categoriaPodcast);
    }
}