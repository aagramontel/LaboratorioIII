package Nivel3.Integración.Ejercicio01;

import java.util.ArrayList;

abstract class Figura {
    public abstract double area();
}

class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }
}

public class Ejercicio01 {

    public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Cuadrado(4));
        figuras.add(new Cuadrado(6));

        System.out.println("Cantidad de figuras: " + figuras.size());
    }
}
