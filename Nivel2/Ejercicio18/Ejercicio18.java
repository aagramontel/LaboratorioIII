package Nivel2.Ejercicio18;

public class Ejercicio18 {
    private double nota1;
    private double nota2;
    private double nota3;

    public Ejercicio18(double nota1, double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularPromedio(){
        return (nota1 + nota2 + nota3) / 3;
    }
    public static void main(String[] args) {
        Ejercicio18 estudiante = new Ejercicio18(82, 79.5, 91);
        System.out.println("El promedio es: " + estudiante.calcularPromedio());
    }
}
