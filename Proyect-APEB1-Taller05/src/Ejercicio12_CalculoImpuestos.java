/**
 * Ejercicio 12_CalculoImpuestos: Desarrollar una solución que permita leer los 
 * datos de un automóvil (marca, origen y costo) imprima el impuesto por pagar y 
 * el precio de venta (incluido el impuesto). Si el origen es Alemania el impuesto 
 * es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%
 * @author Juan Castillo, Emilio Gonzalez
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio12_CalculoImpuestos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese la marca del automovil: ");
        String marca = tcl.nextLine();
        System.out.print("Ingrese el origen: ");
        String origen = tcl.nextLine();
        System.out.print("Ingrese el costo del automovil: ");
        double costo = tcl.nextDouble();
        double porcentajeImpuesto = 0;
        if (origen.equals("Alemania")) {
            porcentajeImpuesto = 0.20;
        } else if (origen.equals("Japón") || origen.equals("Japon")) {
            porcentajeImpuesto = 0.30;
        } else if (origen.equals("Italia")) {
            porcentajeImpuesto = 0.15;
        } else if (origen.equals("USA")) {
            porcentajeImpuesto = 0.08;
        } else {
            porcentajeImpuesto = 0.0;
            System.out.println("Origen no reconocido. Se aplicará 0% de impuesto.");
        }
        double impuesto = costo * porcentajeImpuesto;
        double precioVenta = costo + impuesto;
        System.out.println("Marca: " + marca);
        System.out.println("Origen: " + origen);
        System.out.printf("Costo base: $%.2f%n", costo);
        System.out.printf("Impuesto por pagar: $%.2f%n", impuesto);
        System.out.printf("Precio de venta total: $%.2f%n", precioVenta);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * Ingrese la marca del automovil: Kia
 * Ingrese el origen: Japon
 * Ingrese el costo del automovil: 20000,00
 * Marca: Kia
 * Origen: Japon
 * Costo base: $20000,00
 * Impuesto por pagar: $6000,00
 * Precio de venta total: $26000,00
 * BUILD SUCCESSFUL (total time: 1 minute 3 seconds)
 */