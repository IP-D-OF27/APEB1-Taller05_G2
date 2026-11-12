import java.util.Scanner;
public class ejercicio18 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String descripcion, pais;
        int cantidad;
        double precio, subtotal, descuento, impuesto, total;
        double tasaImpuesto;
        System.out.print("Ingrese la descripcion del articulo: ");
        descripcion = tcl.nextLine();
        System.out.print("Ingrese el pais de origen: ");
        pais = tcl.nextLine();
        System.out.print("Ingrese la cantidad pedida: ");
        cantidad = tcl.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        precio = tcl.nextDouble();
        subtotal = cantidad * precio;
        if (cantidad > 50) {
            descuento = subtotal * 0.15;
        } else {
            descuento = 0;
        }
        if (pais.equalsIgnoreCase("Alemania")) {
            long 
            tasaImpuesto = 0.20;
        } else 
            if (pais.equalsIgnoreCase("Japon")) {
            tasaImpuesto = 0.30;
        } else 
            if (pais.equalsIgnoreCase("Italia")) {
            tasaImpuesto = 0.15;
        } else 
            if (pais.equalsIgnoreCase("Estados Unidos")) {
            tasaImpuesto = 0.08;
        } else {
            System.out.println("Pais de origen no valido");
            return;
        }
        impuesto = (subtotal - descuento) * tasaImpuesto;
        total = subtotal - descuento + impuesto;
        System.out.println("Articulo: " + descripcion);
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Descuento: $%.2f%n", descuento);
        System.out.printf("Impuesto: $%.2f%n", impuesto);
        System.out.printf("Total: $%.2f%n", total);
    }
}