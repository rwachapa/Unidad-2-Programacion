package uni1a;

public class Actor {
    private String nombre;
    private int edad;

    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Actor: " + nombre + ", Edad: " + edad);
    }
}