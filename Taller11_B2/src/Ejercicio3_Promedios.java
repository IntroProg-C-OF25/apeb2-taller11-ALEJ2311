
import java.util.Scanner;

/**
 * *
 * Generar una función que tenga 4 parámetros de tipo decimal y devuelva el
 * promedio cualitativo de los parámetros. Si el promedio es: De 0 a 5 el
 * promedio cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el
 * promedio es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente. A la función
 * se la debe llamar desde un método principal. Los parámetros necesarios para
 * llamar a la función, deben ser ingresados solicitados al usuario.
 *
 * @author Personal
 */
public class Ejercicio3_Promedios {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double acd, ape, aa, promedio = 0;
        System.out.print("INGRESE SUS PROMEDIOS ACD, APE, AA: ");
        acd = tcl.nextDouble();
        ape = tcl.nextDouble();
        aa = tcl.nextDouble();
        System.out.println("SU PROMEDIO CUALITATIVO ES: " + Promedio(acd, ape, aa, promedio));

    }

    public static String Promedio(double acd, double ape, double aa, double promedio) {
        promedio = (acd + ape + aa) / 3;
        //promedio >= 0 && promedio <= 5 ? "Regular" : promedio > 5 && promedio <= 8 ? "Bueno": promedio > 8 && promedio <= 9 ? "Muy bueno" : "Sobresaliente";
        if (promedio >= 0 && promedio <= 5) {
            return "Regular";
        } else {
            if (promedio > 5 && promedio <= 8) {
                return "Bueno";
            } else {
                if (promedio > 8 && promedio <= 9) {
                    return "Muy bueno";
                } else {
                    return "Sobresaliente";
                }
            }
        }
        
    }

}

/***
 * INGRESE SUS PROMEDIOS ACD, APE, AA: 7,5 6,7 8
 * SU PROMEDIO CUALITATIVO ES: Bueno
 */
