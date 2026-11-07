/**
 * Ejercicio 03: Mayor de tres números: Dados tres números distintos, 
 * determinar cuál es el mayor.
 * @author NombreAutor
 * @version 1.0
 */
import java.util.Scanner;

public class Ejercicio03_TresNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int numero1 = tcl.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int numero2 = tcl.nextInt();
        System.out.println("Ingrese el tercer numero:");
        int numero3 = tcl.nextInt();
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println(numero1 + " es mayor");
        } else 
            if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(numero2 + " es mayor");
        } else 
            if (numero3 > numero1 && numero3 > numero2) {
            System.out.println(numero3 + " es mayor");
        } else {
            System.out.println("Hay un empate entre los numeros mayores");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */