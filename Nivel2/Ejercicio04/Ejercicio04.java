package Nivel2.Ejercicio04;

public class Ejercicio04 {
    private String nombre;

    public Ejercicio04(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Ejercicio04 persona = new Ejercicio04("Gabriel");

        System.out.println("Nombre: " + persona.nombre);
    }
}
