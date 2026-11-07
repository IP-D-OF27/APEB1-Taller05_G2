/**
 * Ejercicio 07: Rango de Notas: Asignar una letra (A, B, C, D) a una 
 * calificación en función de su rango (A para 90-100, B para 80-89, etc.).
 * @author Emilio González, Juan Castillo
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio07_RangoNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese su calificacion: ");
        int calificacion = tcl.nextInt();
            if (calificacion >= 90) {
            System.out.println("Usted esta en el rango A");
        } else 
            if (calificacion >= 80) {
            System.out.println("Usted esta en el rango B");
        } else 
            if (calificacion >= 70) {
            System.out.println("Usted esta en el rango C");
        } else {
            System.out.println("Usted esta en el rango D");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 *  run:
    Ingrese su calificacion: 
    30
    Usted esta en el rango D
    BUILD SUCCESSFUL (total time: 2 seconds)
 */