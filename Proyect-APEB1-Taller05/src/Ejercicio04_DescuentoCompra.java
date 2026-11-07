/**
 * Ejercicio 04: Descuento en Compras: Calcular el precio final de un producto 
 * con un descuento del 10% si el precio original es mayor de $100; de lo 
 * contrario, no hay descuento.
 * @author Emilio Gonzalez, Juan Castillo
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio04_DescuentoCompra {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el precio de su producto: ");
        int precio = tcl.nextInt();
        double precioDescuento;
        double descuento;
        if (precio > 100) {
            System.out.println("Usred tiene un descuento del 10%");
            descuento = precio * (0.1);
            precioDescuento = precio - descuento;
            System.out.printf("Precio con descuento: %.2f%n" , precioDescuento);
        } else {
            System.out.println("No es elegible para el descuento");
            System.out.println("Precio: " + precio);
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 *  run:
    Ingrese el precio de su producto: 923
    Usred tiene un descuento del 10%
    Precio con descuento: 830.70
    BUILD SUCCESSFUL (total time: 3 seconds)
 */