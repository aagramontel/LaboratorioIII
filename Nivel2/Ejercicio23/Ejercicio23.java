package Nivel2.Ejercicio23;

public class Ejercicio23 {
    private double salario;

    public void setSalario(double salario) {

        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario debe ser positivo.");
        }
    }

    public double getSalario() {
        return salario;
    }

    public static void main(String[] args) {

        Ejercicio23 empleado = new Ejercicio23();

        empleado.setSalario(-1000);
        empleado.setSalario(7000);

        System.out.println("Salario: Q" + empleado.getSalario());
    }
}
