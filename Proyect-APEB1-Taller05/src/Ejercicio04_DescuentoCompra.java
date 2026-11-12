/**
 * Ejercicio 04: Descuento en Compras: Calcular el precio final de un producto 
 * con un descuento del 10% si el precio original es mayor de $100; de lo 
 * contrario, no hay descuento.
 * @author Juan Castillo, Emilio Gonzalez
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio04_DescuentoCompra {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el precio: ");
        double precio = tcl.nextDouble(), descuento = 1;
        if (precio > 100) {
            descuento = 0.9;
        precio *= descuento;
        System.out.printf("Precio: " + precio);
    }
}
}
/**
 * EVIDENCIA DEL RUN:
 *  run:
    Ingrese el precio de su producto: 923
    Usred tiene un descuento del 10%
    Precio con descuento: 830.70
    BUILD SUCCESSFUL (total time: 3 seconds)
 */