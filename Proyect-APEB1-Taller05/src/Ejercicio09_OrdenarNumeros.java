/**
 * Ejercicio 09: Ordenamiento de Tres Números: Dados tres números, ordenarlos en
 * orden ascendente.
 * @author Emilio González, Juan Castillo
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio09_OrdenarNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int numero1 = tcl.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = tcl.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int numero3 = tcl.nextInt();
        if (numero1 <= numero2 && numero2 <= numero3) {
            System.out.println(numero1 + " " + numero2 + " " + numero3);
        } else 
            if (numero1 <= numero3 && numero3 <= numero2) {
            System.out.println(numero1 + " " + numero3 + " " + numero2);
        } else 
            if (numero2 <= numero1 && numero1 <= numero3) {
            System.out.println(numero2 + " " + numero1 + " " + numero3);
        } else 
            if (numero2 <= numero3 && numero3 <= numero1) {
            System.out.println(numero2 + " " + numero3 + " " + numero1);
        } else 
            if (numero3 <= numero1 && numero1 <= numero2) {
            System.out.println(numero3 + " " + numero1 + " " + numero2);
        } else {
            System.out.println(numero3 + " " + numero2 + " " + numero1);
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 *  run:
    Ingrese el primer numero: 21
    Ingrese el segundo numero: 99
    Ingrese el tercer numero: 12
    12 21 99
    BUILD SUCCESSFUL (total time: 5 seconds)
 */