package Nivel3.Abstracción.Ejercicio05;

abstract class Figura {

    public abstract double area();
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

public class Ejercicio05 {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(3);

        System.out.println("Área del círculo: " + circulo.area());
    }
}
