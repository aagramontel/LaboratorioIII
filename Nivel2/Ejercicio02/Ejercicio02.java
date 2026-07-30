package Nivel2.Ejercicio02;

public class Ejercicio02 {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public static void main(String[] args) {
    Ejercicio02 persona = new Ejercicio02();

    persona.setNombre("Valentina");
    persona.setEdad(25);

    System.out.println("Nombre: " + persona.getNombre());
    System.out.println("Edad: " + persona.getEdad());
}
}
