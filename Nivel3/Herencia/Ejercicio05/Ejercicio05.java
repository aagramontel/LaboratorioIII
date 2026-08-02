package Nivel3.Herencia.Ejercicio05;

public class Ejercicio05 {
    //crear objeto y probar 
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
        Perro miPerro = new Perro();
        System.out.println("Probando el sonido del perro:");
        miPerro.sonido();
    }
}
