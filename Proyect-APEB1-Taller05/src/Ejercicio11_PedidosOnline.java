/**
 * Ejercicio 11: Pedidos online: Desarrollar una solución que imprima el costo 
 * de un pedido de un artículo del cual se tiene la descripción, la cantidad que
 * se requiere y el precio unitario. Si la cantidad pedida excede de 50 
 * unidades, se hace un descuento de 15%.
 * @author Emilio González, Juan Castillo
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio11_PedidosOnline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese la descripcion del pedido: ");
        String descripcion = tcl.nextLine();
        System.out.print("Ingrese la cantidad del pedido: ");
        double cantidad = tcl.nextDouble();
        System.out.print("Ingrese el el precio unitario de cada unidad: ");
        double precioUnitario = tcl.nextDouble();
        double total = precioUnitario * cantidad;
        double descuento = total * 0.15;
        double totalDescuento;
        if (cantidad > 50) {
            System.out.println("Se le ha otorgado un 15% de descuento");
            totalDescuento = total - descuento;
            System.out.printf("Total: %.2f%n" , totalDescuento);
        } else {
            System.out.println("No se le otorga ningun descuento");
            System.out.printf("Total: %.2f%n", total);
        }
        
    }
}
/***
 * EVIDENCIA DEL RUN:
 *  run:
    Ingrese la descripcion del pedido: Horchatas de 500 ml
    Ingrese la cantidad del pedido: 65
    Ingrese el el precio unitario de cada unidad: 0.5
    Se le ha otorgado un 15% de descuento
    Total: 27.63
    BUILD SUCCESSFUL (total time: 23 seconds)
 */