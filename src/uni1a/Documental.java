/**
 * Class Documental
 */
package uni1a;
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador; // Nuevo atributo

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    // Método que faltaba
    public void asignarInvestigador(Investigador inv) {
        this.investigador = inv;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        // Mostrar datos del investigador si ya se asignó
        if(investigador != null) {
            investigador.mostrarDatos();
        }
    }
}