import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        double costoInstagram, costoDropbox, costoYoutube, costoApplemusic, total, preciodescuento, totaldescuento;
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        System.out.print("Ingrese el costo que paga por Dropbox: ");
        costoDropbox = tcl.nextDouble();
        System.out.print("Ingrese el costo que paga por Instagram: ");
        costoInstagram = tcl.nextDouble();
        System.out.print("Ingrese el costo que paga por Youtube: ");
        costoYoutube = tcl.nextDouble();
        System.out.print("Ingrese el costo que paga por Apple Music: ");
        costoApplemusic = tcl.nextDouble();
        total = costoApplemusic + costoDropbox + costoInstagram + costoYoutube;
        if (edad < 30 && total >= 25) {
            System.out.println("Usted tiene un 20% de descuento");
            totaldescuento = total * 0.8;
            preciodescuento = total * 0.2;
            System.out.printf("Total: %.2f%n" , totaldescuento); 
            System.out.println("Descuento: " + preciodescuento);
        } else {
            System.out.printf("Total: %.2f%n", total);
        }  
    }
}
