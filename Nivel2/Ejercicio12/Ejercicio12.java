package Nivel2.Ejercicio12;

public class Ejercicio12 {
    private double precio;

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public static void main(String[] args) {
        Ejercicio12 producto = new Ejercicio12();

        producto.setPrecio(250);

        System.out.println("Precio: Q" + producto.getPrecio());
    }
}
