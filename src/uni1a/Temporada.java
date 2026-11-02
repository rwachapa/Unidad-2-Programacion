package uni1a;

public class Temporada {
    private int numeroTemporada;
    private int cantidadCapitulos;

    public Temporada(int numeroTemporada, int cantidadCapitulos) {
        this.numeroTemporada = numeroTemporada;
        this.cantidadCapitulos = cantidadCapitulos;
    }

    public void mostrarDatos() {
        System.out.println("Temporada " + numeroTemporada + ", Capítulos: " + cantidadCapitulos);
    }
}