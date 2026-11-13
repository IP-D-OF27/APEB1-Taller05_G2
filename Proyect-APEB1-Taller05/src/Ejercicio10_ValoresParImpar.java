/**
 * Ejercicio 10_ValoresParImpar: Dado un valor entero ingresado por teclado 
 * (positivo o negativo), determinar si se trata de un valor par o impar.
 * @author Juan Castillo, Emilio Gonzalez
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio10_ValoresParImpar {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un valor entero: ");
        int numero = tcl.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es PAR.");
        } else {
            System.out.println("El numero " + numero + " es IMPAR.");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * Ingrese un valor entero: 39
 * El numero 39 es IMPAR.
 * BUILD SUCCESSFUL (total time: 4 seconds)
 */