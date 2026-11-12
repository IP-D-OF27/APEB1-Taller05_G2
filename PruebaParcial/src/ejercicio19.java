import java.util.Scanner;
public class ejercicio19 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double evaContinua, examenFinal, asistencia, notafinal;
        System.out.print("Ingrese su calificacion de evaluacion continua: ");
        evaContinua = tcl.nextDouble();
        System.out.print("Ingrese su calificacion de examen final: ");
        examenFinal = tcl.nextDouble();
        System.out.print("Ingrese su porcentaje de asistencia: ");
        asistencia = tcl.nextDouble();
        notafinal = evaContinua * 0.40 + examenFinal * 0.60;
        if (asistencia < 75 || examenFinal < 4) {
            System.out.println("Usted esta reprobado");
        } else if (notafinal >= 7) {
            System.out.println("Usted esta aprobado");
        } else if (notafinal >= 5 && notafinal < 7) {
            System.out.println("Usted esta en supletorio");
        } else {
            System.out.println("Usted esta reprobado");
        }
        System.out.printf("Nota final: %.1f%n", notafinal);
    }
}
