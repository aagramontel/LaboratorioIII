package Nivel2.Ejercicio14;

public class Ejercicio14 {
    private String nombre;
    private double precio;

    public Ejercicio14(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarProducto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: Q" + precio);
    }

    public static void main(String[] args) {
        Ejercicio14 producto = new Ejercicio14("Pulsera", 1300);

        producto.mostrarProducto();
    }
}
