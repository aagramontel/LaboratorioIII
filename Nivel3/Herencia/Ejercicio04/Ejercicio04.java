package Nivel3.Herencia.Ejercicio04;

public class Ejercicio04 {
    
    static class Animal {
        public void sonido () {
            System.out.println("Sonido del animal.");
        }
    }

    static class Perro extends Animal {
        @Override
        public void sonido () {
            System.out.println("Guau guau");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sonido();
        Perro perro = new Perro();
        perro.sonido();
    }
}
