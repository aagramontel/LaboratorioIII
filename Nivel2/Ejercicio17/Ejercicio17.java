package Nivel2.Ejercicio17;

public class Ejercicio17 {
    private double nota1;
    private double nota2;
    private double nota3;

    public void setNotas (double nota1,double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public static void main(String[] args) {
        Ejercicio17 estudiante = new Ejercicio17();
        estudiante.setNotas(82, 79, 94);

        System.out.println("Notas registradas.");
    }
}
