/**
 * Ejercicio 13: Sistema de reservas hoteleras: En una hostería de la ciudad de 
 * Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, del
 * 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. 
 * Elaborar una solución que pida el número de días y el precio diario de la 
 * habitación y luego calcule e imprima el subtotal por pagar, el descuento y
 * el total por pagar.
 * @author Emilio González, Juan Castillo
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio13_ReservasHotel {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el numero de dias que se quedo en la hosteria: ");
        int dias = tcl.nextInt();
        System.out.print("Ingrese el precio de la habitacion: ");
        double precio = tcl.nextDouble();
        double descuento;
        double subtotal;
        double total = 0;
        if (dias > 5 && dias < 10) {
            System.out.println("Usted recibe un descuento del 10%");
            descuento = precio * 0.1;
            total = precio - descuento;
            System.out.println("Subtotal: " + precio + " - " + descuento);
            System.out.printf("Total: %.2f%n" , total);
        } else 
            if (dias > 10 && dias < 15) {
            System.out.println("Usted recibe un descuento del 15%");
            descuento = precio * 0.15;
            total = precio - descuento;
            System.out.println("Subtotal: " + precio + " - " + descuento);
            System.out.printf("Total: %.2f%n" , total);                        
        } else
            if (dias > 15){
            System.out.println("Usted recibe un descuento del 20%");
            descuento = precio * 0.2;
            total = precio - descuento;
            System.out.println("Subtotal: " + precio + " - " + descuento);
            System.out.printf("Total: %.2f%n" , total);                        
        } else {
            System.out.println("No recibe descuento");
            System.out.printf("Total: %.2f%n", total);                       
            }
    }
}
/***
 * EVIDENCIA DEL RUN:
 *  run:
    Ingrese el numero de dias que se quedo en la hosteria: 13
    Ingrese el precio de la habitacion: 25
    Usted recibe un descuento del 15%
    Subtotal: 25.0 - 3.75
    Total: 21.25
    BUILD SUCCESSFUL (total time: 20 seconds)
 */