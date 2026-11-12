import java.util.Scanner;
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double prestamo, tasaInteres, interesMes, interesMeses, cuota;
        System.out.print("Ingrese el monto del prestamo: ");
        prestamo = tcl.nextDouble();
        System.out.print("Ingrese la tasa de interes mensual: ");
        tasaInteres = tcl.nextDouble();
        interesMes = prestamo * tasaInteres / 100;
        interesMeses = interesMes * 12;
        cuota = (prestamo + interesMeses) / 12;
        System.out.println("Interes de un mes: " + interesMes);
        System.out.println("Interes de los 12 meses: " + interesMeses);
        System.out.println("Cuota: " + cuota);
    }
    
}
