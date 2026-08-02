package Nivel3.Integración.Ejercicio02;

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

class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
}

public class Ejercicio02 {

    public static void main(String[] args) {

        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Cuadrado(4));
        figuras.add(new Circulo(3));

        for (Figura figura : figuras) {
            System.out.println("Área: " + figura.area());
        }
    }
}
