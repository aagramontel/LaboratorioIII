package Nivel2.Ejercicio24;

public class Ejercicio24 {
    private String nombre;
    private double salario;

    public Ejercicio24(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: Q" + salario);
    }

    public static void main(String[] args) {

        Ejercicio24 empleado = new Ejercicio24("Mateo", 6000);

        empleado.mostrarDatos();
    }
}

