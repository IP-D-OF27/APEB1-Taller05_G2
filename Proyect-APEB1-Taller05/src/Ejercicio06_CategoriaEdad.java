/**
 * Ejercicio 06_CategoriaEdad: Clasificar a una persona en una categoría de edad 
 * (niño, adolescente, adulto) en función de su edad.
 * @author Juan Castillo, Emilio Gonzalez
 * @version 1.0
 */
import java.util.Scanner;
public class Ejercicio06_CategoriaEdad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad = tcl.nextInt();
    if(edad >= 6 && edad < 12){
            System.out.println("Usted es un niño");
    } else if (edad >=12 && edad < 18){
            System.out.println("Usted es un Adolescente");
    } else{
            System.out.println("Usted es un Adulto");
    }
}   
}
/***
 * EVIDENCIA DEL RUN:
 * Ingrese su edad: 
 * 18
 * Usted es un Adulto
 * BUILD SUCCESSFUL (total time: 2 seconds)
 */