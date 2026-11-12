import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double dias, precio, preciototal, subtotal, total;
        System.out.println("Ingrese el numero de dias que se quedo en el hotel: ");
        dias = tcl.nextDouble();
        System.out.println("Ingrese el precio por cada noche: ");
        precio = tcl.nextDouble();
        preciototal = dias * precio;
        if (dias >= 5 && dias <= 9){
            System.out.println("Usted recibe un 10% de descuento");
            subtotal = preciototal;
            System.out.printf("Subtotal: %.2f%n", subtotal);
            total = subtotal * 0.9;
            System.out.printf("Total: %.2f%n", total);
        } else 
            if (dias >= 10 && dias <= 14) {
            System.out.println("Usted recibe un 15% de descuento");
            subtotal = preciototal;
            System.out.printf("Subtotal: %.2f%n", subtotal);
            total = subtotal * 0.85;
            System.out.printf("Total: %.2f%n", total);
        } else
            if (dias >= 15) {
            System.out.println("Usted recibe un 20% de descuento");
            subtotal = preciototal;
            System.out.printf("Subtotal: %.2f%n", subtotal);
            total = subtotal * 0.80;
            System.out.printf("Total: %.2f%n" , total);
        } else {
            System.out.println("Usted no recibe descuento");
            subtotal = preciototal;
            total = subtotal;
            System.out.printf("Total: %.2f%n" , total);
        }
    }
}
