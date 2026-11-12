import java.util.Scanner;
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int tiempo1, tiempo2, tiempo3;
        System.out.print("Ingrese el primer tiempo: ");
        tiempo1 = tcl.nextInt();
        System.out.print("Ingrese el segundo tiempo: ");
        tiempo2 = tcl.nextInt();
        System.out.print("Ingrese el tercer tiempo: ");
        tiempo3 = tcl.nextInt();
        if (tiempo1 <= tiempo2 && tiempo2 <= tiempo3) {
            System.out.println(tiempo1 + ", " + tiempo2 + ", " + tiempo3);
        } else 
            if (tiempo1 <= tiempo3 && tiempo3 <= tiempo2) {
            System.out.println(tiempo1 + ", " + tiempo3 + ", " + tiempo2);
        } else 
            if (tiempo2 <= tiempo1 && tiempo1 <= tiempo3) {
            System.out.println(tiempo2 + ", " + tiempo1 + ", " + tiempo3);
        } else 
            if (tiempo2 <= tiempo3 && tiempo3 <= tiempo1) {
            System.out.println(tiempo2 + ", " + tiempo3 + ", " + tiempo1);
        } else 
            if (tiempo3 <= tiempo1 && tiempo1 <= tiempo2) {
            System.out.println(tiempo3 + ", " + tiempo1 + ", " + tiempo2);
        } else {
            System.out.println(tiempo3 + ", " + tiempo2 + ", " + tiempo1);
        }
        if (tiempo1 <= tiempo2 && tiempo1 <= tiempo3) {
            System.out.println("Mejor tiempo: " + tiempo1 + " segundos");
        } else 
            if (tiempo2 <= tiempo1 && tiempo2 <= tiempo3) {
            System.out.println("Mejor tiempo: " + tiempo2 + " segundos");
        } else {
            System.out.println("Mejor tiempo: " + tiempo3 + " segundos");
        }
    }
}