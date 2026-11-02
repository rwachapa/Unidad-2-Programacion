package poo;
import uni1a.*;

public class PruebaAudiovisual {
    public static void main(String[] args) {
        // Crear película y sus actores
        Pelicula pelicula1 = new Pelicula("El secreto del bosque", 110, "Aventura", "Estudio Norte");
        Actor actor1 = new Actor("Luis Mena", 34);
        Actor actor2 = new Actor("Ana Torres", 29);
        pelicula1.agregarActor(actor1);
        pelicula1.agregarActor(actor2);

        // Crear serie y sus temporadas
        SerieDeTV serie1 = new SerieDeTV("Camino a casa", 45, "Drama", "TV Nacional");
        Temporada temp1 = new Temporada(1, 12);
        Temporada temp2 = new Temporada(2, 10);
        serie1.agregarTemporada(temp1);
        serie1.agregarTemporada(temp2);

        // Crear documental y su investigador
        Documental docu1 = new Documental("Vida silvestre", 50, "Naturaleza", "Fauna local");
        Investigador inv1 = new Investigador("María Cruz", "Bióloga");
        docu1.asignarInvestigador(inv1);

        // Crear noticia y podcast
        NoticiaDigital noticia1 = new NoticiaDigital("Inauguración de parque", 6, "Noticia", "Canal Digital");
        PodcastAudiovisual podcast1 = new PodcastAudiovisual("Historias de la tierra", 35, "Cultura", "Relatos comunitarios");

        // Arreglo de contenidos
        ContenidoAudiovisual[] listaContenidos = {pelicula1, serie1, docu1, noticia1, podcast1};

        // Mostrar todos los datos
        System.out.println("=== LISTA DE CONTENIDOS AUDIOVISUALES ===");
        for (ContenidoAudiovisual contenido : listaContenidos) {
            contenido.mostrarDetalles();
            System.out.println("----------------------------------------");
        }
    }
}