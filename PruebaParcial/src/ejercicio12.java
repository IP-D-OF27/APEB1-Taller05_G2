import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double consumoMensual, precio, edad, total, descuento, totalDescuento;
        System.out.print("Ingrese el consumo mensual en kWh: ");
        consumoMensual = tcl.nextDouble();
        System.out.print("Ingrese el precio por kWh: ");
        precio = tcl.nextDouble();
        System.out.print("Ingrese su edad: ");
        total = consumoMensual * precio;
        edad = tcl.nextDouble();
        if (edad > 65){
            System.out.println("Usted recibe un 15% de descuento");
            descuento = total * 0.15;
            totalDescuento = total - descuento;
            System.out.printf("Total: %.2f%n" , totalDescuento); 
        } else {
            System.out.printf("Total: %.2f%n" , total);
        }
    }
}
