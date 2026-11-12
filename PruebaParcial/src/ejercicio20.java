import java.util.Scanner;
public class ejercicio20 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int noches;
        double precio, total, totaldescuento;
        System.out.print("Ingrese cuantas noches paso en el hotel: ");
        noches = tcl.nextInt();
        System.out.print("Ingrese el precio de cada noche: ");
        precio = tcl.nextDouble();
        total = noches * precio;
        if (noches >= 1 && noches <= 5) {
            System.out.println("Total: " + total);
        } else
            if (noches >= 6 && noches <= 10) {
            System.out.println("Usted recibe un 10% de descuento");
            totaldescuento = total * 0.9;
            System.out.println("Total: " + totaldescuento);
        } else
            if (noches >= 11 && noches <= 15) {
            System.out.println("Usted recibe un 15% de descuento");
            totaldescuento = total * 0.85;
            System.out.println("Total: " + totaldescuento);
        } else
            if (noches >= 16) {
            System.out.println("Usted recibe un 20% de descuento");
            totaldescuento = total * 0.8;
            System.out.println("Total: " + totaldescuento);
        }            
    }
}
