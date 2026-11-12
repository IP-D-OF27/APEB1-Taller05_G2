import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double tarifa, costoMin, minConsum, costoLlamada, total;
        System.out.print("Ingrese la tarifa fija mensual: ");
        tarifa = tcl.nextDouble();
        System.out.print("Ingrese el costo por minuto: ");
        costoMin = tcl.nextDouble();
        System.out.print("Ingrese los minutos consumidos: ");
        minConsum = tcl.nextDouble();
        costoLlamada = minConsum * costoMin;
        total = tarifa + costoLlamada;
        System.out.printf("Costo de las llamadas: %.2f%n" , costoLlamada);  
        System.out.printf("Total: %.2f%n", total);
    }
}
