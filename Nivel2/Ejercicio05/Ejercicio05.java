package Nivel2.Ejercicio05;

public class Ejercicio05 {
    private String nombre;
    private int edad;

    public Ejercicio05(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        Ejercicio05 persona = new Ejercicio05("Sophia", 28);

        persona.mostrarDatos();
    }
}
