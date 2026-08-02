package Nivel3.Abstracción.Ejercicio03;

abstract class Figura {
    public abstract double area();
}

class Cuadrado extends Figura {

    @Override
    public double area() {
        return 0;
    }
}

public class Ejercicio03 {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        System.out.println("Clase Cuadrado creada.");
    }
}
