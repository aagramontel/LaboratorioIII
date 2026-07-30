package Nivel2.Ejercicio15;

import java.util.ArrayList;

public class Ejercicio15 {
    public static void main(String[] args) {

        ArrayList<String> productos = new ArrayList<>();

        productos.add("Pantalón");
        productos.add("Camisa");
        productos.add("Short");

        System.out.println("Lista de productos:");

        for (String producto : productos) {
            System.out.println(producto);
        }
    }
}
