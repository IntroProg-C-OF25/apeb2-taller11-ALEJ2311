
import java.util.Scanner;
/***
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien inmueble. 
 * Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente).
 * En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y el número de kilowatios del mes. 
 * Y se genera en pantalla el siguiente reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10
 * En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca el 2% del valor del inmueble. Y se genera el siguiente reporte:
 * Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.
 * En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2 se llama al procedimiento calcularPredio. 
 * Los datos que se necesita en cada procedimiento se los debe ingresar por teclado.
 * @author Jesus R
 */
public class Ejercicio4_PlanillaLuz_Inmueble {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, cedula;
        int n;        
        System.out.println("BIENVENID@");
        System.out.print("INGRESE SU NOMBRE: ");
        nombre = tcl.nextLine();
        System.out.print("INGRESE SU NUMERO DE CEDULA: ");
        cedula = tcl.nextLine();
        System.out.println("-----CALCULADOR DE SERVICIOS-----");
        System.out.println("1. Planilla de Luz ");
        System.out.println("2. Valor predio de un bien Inmueble");
        System.out.print("Ingrese una opcion: ");
        n = tcl.nextInt();
        tcl.nextLine();
        switch (n) {
            case 1:
                calcularValorluz(nombre, cedula);
                break;
            case 2:
                calcularPredio(nombre, cedula);
                break;
            default:
                System.out.println("¡¡OPCION INVALIDA!!");
        }
    }
    
    public static void calcularValorluz (String nombre, String cedula){
        Scanner tcl = new Scanner(System.in);
        double valorKilo, prFinal;
        int numkilo;
        System.out.print("Ingrese valor del kilovatio: ");
        valorKilo = tcl.nextDouble();
        System.out.print("Ingrese el numero de kilovatios usados en el mes: ");
        numkilo = tcl.nextInt();
        prFinal = (valorKilo * numkilo);
        System.out.println("Cliente " + nombre + " con cédula " + cedula + " debe cancelar el valor de $" + prFinal);        
    }
    
    public static void calcularPredio(String nombre, String cedula){
        Scanner tcl = new Scanner(System.in);
        double vInmueble, predioInmu;
        System.out.print("Ingrese el valor del Inmueble");
        vInmueble = tcl.nextDouble();
        predioInmu = (vInmueble * 0.02);
        System.out.println("Cliente " + nombre + " con cédula " + cedula + " tiene un bien inmueble valorado en $" + vInmueble + " y tiene que pagar de predio $" + predioInmu);        
        
    }
}

/***
 * BIENVENID@
 * INGRESE SU NOMBRE: Angel Aguilar
 * INGRESE SU NUMERO DE CEDULA: 0750633018
 * -----CALCULADOR DE SERVICIOS-----
 * 1. Planilla de Luz 
 * 2. Valor predio de un bien Inmueble
 * Ingrese una opcion: 1
 * Ingrese valor del kilovatio: 10
 * Ingrese el numero de kilovatios usados en el mes: 100
 * Cliente Angel Aguilar con c�dula 0750633018 debe cancelar el valor de $1000.0
 */