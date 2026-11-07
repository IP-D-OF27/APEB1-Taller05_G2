/**
 * Ejercicio 01: Edad para Votar: Determinar si una persona es elegible para 
 * votar en función de su edad (mayor o igual a 16 años).
 * @author Emilio González, Juan Castillo
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio01_LegibleVotacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme su edad: ");
        int edad = tcl.nextInt();
        if (edad >= 16) {
            System.out.println("Es legible para votar");
        } else {
            System.out.println("No es legible para votar");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 *  run:
    Deme su edad: 5
    No es legible para votar
    BUILD SUCCESSFUL (total time: 4 seconds)
 */