import java.util.Scanner;
/**
 * Ejercicio 02_DiaSemana: Día de la semana: Mostrar el nombre del día de la semana
 * en función del número ingresado (1 para lunes, 2 para martes, etc.).
 * @author Juan Castillo - Emilio Gonzalez
 * @version 1.0
 */
public class Ejercicio02_DiaSemana {
    public static void main(String[] args) {
        String nombreDia;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme nro de dia: ");
        int nroDia = tcl.nextInt();
        //INICIO DE LA SENTENCIA DE SELECCION MULTIPLE
        {switch (nroDia){ 
            case 1:
                nombreDia = "lunes";
                break;
            case 2 :
                nombreDia = "martes";
                break;
            case 3 :
                nombreDia = "miercoles";
                break;
            case 4 :
                nombreDia = "jueves";
                break;
            case 5 :
                nombreDia = "viernes";
                break;         
            case 6 :
                nombreDia = "sabado";
                break;
            case 7 :
                nombreDia = "domingo";
                break;
            default:
                nombreDia = "Error";
                break;
        } //FIN DE LA SENTENCIA DE SELECCION MULTIPLLE
        }
        System.out.println("El dia es: " + nombreDia);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Deme nro de dia: 7
El dia es: domingo
BUILD SUCCESSFUL (total time: 2 seconds)
 */