package uni1a;

public class NoticiaDigital extends ContenidoAudiovisual {
    private String fuente;

    public NoticiaDigital(String titulo, int duracionEnMinutos, String genero, String fuente) {
        super(titulo, duracionEnMinutos, genero);
        this.fuente = fuente;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de noticia digital:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Fuente: " + fuente);
    }
}