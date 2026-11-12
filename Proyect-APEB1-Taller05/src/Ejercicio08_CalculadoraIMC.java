/**
 * Ejercicio 08_Calculadora_IMC: Calcular el índice de masa corporal (IMC) de una persona y 
 * clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 * @author Juan Castillo, Emilio Gonzalez
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio08_CalculadoraIMC {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = tcl.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        double altura = tcl.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("Su IMC es: %.2f%n", imc);
        if (imc < 18.5) {
            System.out.println("Clasificacion: Bajo peso");
        } else if (imc >= 18.5 && imc < 25.0) {
            System.out.println("Clasificacion: Peso normal");
        } else if (imc >= 25.0 && imc < 30.0) {
            System.out.println("Clasificacion: Sobrepeso");
        } else {
            System.out.println("Clasificacion: Obesidad");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * Ingrese su peso en kilogramos: 53
 * Ingrese su altura en metros: 1,50
 * Su IMC es: 23,56
 * Clasificacion: Peso normal
 * BUILD SUCCESSFUL (total time: 21 seconds)
 */