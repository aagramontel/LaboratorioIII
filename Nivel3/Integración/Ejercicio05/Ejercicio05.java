package Nivel3.Integración.Ejercicio05;

interface Vehiculo {

    void arrancar();
}

class Moto implements Vehiculo {

    @Override
    public void arrancar() {
        System.out.println("La moto está arrancando.");
    }
}

public class Ejercicio05 {

    public static void main(String[] args) {

        Moto moto = new Moto();

        moto.arrancar();
    }
}
