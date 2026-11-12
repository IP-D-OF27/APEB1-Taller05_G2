import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double lado, altura, areaCuadrado, areaRectangulo, areaTriangulo, areaTotal;
        System.out.print("Ingrese el lado del cuadrado: ");
        lado = tcl.nextDouble();
        System.out.print("Ingrese la altura: ");
        altura = tcl.nextDouble();
        areaCuadrado = lado * lado;
        areaRectangulo = lado * altura;
        areaTriangulo = (lado * altura / 2) * 3;
        areaTotal = areaCuadrado + areaRectangulo + areaTriangulo;
        System.out.printf("Area del cuadrado: %.2f%n" , areaCuadrado);
        System.out.printf("Area del rectangulo: %.2f%n" , areaRectangulo);
        System.out.printf("Area de los triangulos: %.2f%n" , areaTriangulo);
        System.out.printf("Area total: %.2f%n" , areaTotal);
     
    }
}
