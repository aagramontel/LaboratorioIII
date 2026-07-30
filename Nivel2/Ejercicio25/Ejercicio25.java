package Nivel2.Ejercicio25;

public class Ejercicio25 {
    private String nombre;
    private double salario;

    public Ejercicio25(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: Q" + salario);
        System.out.println();
    }

    public static void main(String[] args) {

        Ejercicio25 empleado1 = new Ejercicio25("Luis", 7500);
        Ejercicio25 empleado2 = new Ejercicio25("Valeria", 5500);
        Ejercicio25 empleado3 = new Ejercicio25("Sarah", 6500);

        empleado1.mostrarDatos();
        empleado2.mostrarDatos();
        empleado3.mostrarDatos();
    }
}
