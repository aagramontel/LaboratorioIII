package Nivel3.Integración.Ejercicio04;

interface Vehiculo {

    void arrancar();
}

class Carro implements Vehiculo {

    @Override
    public void arrancar() {
        System.out.println("El carro está arrancando.");
    }
}

public class Ejercicio04 {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.arrancar();
    }
}
