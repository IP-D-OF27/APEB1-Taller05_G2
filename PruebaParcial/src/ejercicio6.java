import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double est1, est2, est3, total;
        System.out.print("ingrese el gasto del primer estudiante: ");
        est1 = tcl.nextDouble();
        System.out.print("ingrese el gasto del segundo estudiante: ");
        est2 = tcl.nextDouble();
        System.out.print("ingrese el gasto del tercer estudiante: ");
        est3 = tcl.nextDouble();
        total = est1 + est2 + est3 / 3;
        System.out.printf("Total: %2f.%n" , total);
    }
}
