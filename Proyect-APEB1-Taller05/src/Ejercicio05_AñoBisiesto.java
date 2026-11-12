/**
 * Ejercicio 05_AñoBisiesto:Comprobar si un año ingresado es bisiesto o no. 
 * Si es bisiesto, mostrar un mensaje especial.
 * @author Juan Castillo, Emilio Gonzalez
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio05_AñoBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese un ano: ");
        int anio = tcl.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El ano " + anio + " es bisiesto");
        } else {
            System.out.println("El ano " + anio + " no es bisiesto.");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
 * Ingrese un ano: 2013
 * El ano 2013 no es bisiesto.
 * BUILD SUCCESSFUL (total time: 54 seconds)   
 */

