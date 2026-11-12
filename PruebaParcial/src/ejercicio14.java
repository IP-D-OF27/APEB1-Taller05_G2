import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        if (edad >= 12 && edad <= 15){
            System.out.println("Usted pertenece a la categoria infantil");
        } else {
            if (edad >=16 && edad <= 17){
            System.out.println("Usted pertenece a la categoria juvenil");
            } else 
                if (edad >= 18) {
                System.out.println("Usted pertenece a la categoria adulta");
                } else
                if(edad >= 0 && edad <= 11){
                System.out.println("No pertenece a ningua categoria");                                                          
            } else 
                if (edad < 0) {
                System.out.println("Numero invalido");
            }
        }
    }  
}