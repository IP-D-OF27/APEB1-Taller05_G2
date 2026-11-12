import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base, altura, areaPieza, areaTotal;
        int cantidad;
        System.out.print("Ingrese la base: ");
        base = tcl.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = tcl.nextDouble();
        System.out.print("Ingrese la cantidad de banderines: ");
        cantidad = tcl.nextInt();
        areaPieza = base * altura / 2;
        areaTotal = areaPieza * cantidad;
        System.out.printf("Area de una pieza: %.2f%n", areaPieza);
        System.out.printf("Area total: %.2f%n" , areaTotal);
    }
}
