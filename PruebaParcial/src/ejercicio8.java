import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double cuadro, rueda, manubrio, asiento, total;
        System.out.print("Ingrese el precio del cuadro: ");
        cuadro = tcl.nextDouble();
        System.out.print("Ingrese el precio de una rueda: ");
        rueda = tcl.nextDouble();
        System.out.print("Ingrese el precio del manubrio: ");
        manubrio = tcl.nextDouble();
        System.out.print("Ingrese el precio del asiento: ");
        asiento = tcl.nextDouble();        
        total = cuadro + (rueda * 2) + manubrio + asiento;
        System.out.println("Total: " + total);
        
        
    }
}
