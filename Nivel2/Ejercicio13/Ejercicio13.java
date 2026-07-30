package Nivel2.Ejercicio13;

public class Ejercicio13 {
    private double precio;

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio debe ser positivo.");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public static void main(String[] args) {
        Ejercicio13 producto = new Ejercicio13();

        producto.setPrecio(-50);
        producto.setPrecio(250);

        System.out.println("Precio: Q" + producto.getPrecio());
    }
}
