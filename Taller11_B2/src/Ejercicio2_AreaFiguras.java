
import java.util.Scanner;

/**
 * *
 * Generar una solución que implemente 3 procedimientos. Que permitan calcular
 * el área de un cuadrado, área de un triángulo y área de un rectángulo. Cada
 * procedimiento/función debe recibir los datos necesarios y generar el valor
 * correspondiente. Se debe invocar a los procedimientos desde un método
 * principal; Si el usuario ingresa 1 se llama al procedimiento
 * obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo; 3 se
 * llama al procedimiento obtenerAreaCuadrado. El área del cuadrado es igual a
 * lado x lado x lado x lado El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 *
 * @author Personal
 */
public class Ejercicio2_AreaFiguras {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num, base , altura , area = 0;
        System.out.print("INGRESE EL LADO DE UNA FIGURA: ");
        base = tcl.nextInt();
        System.out.print("INGRESE LA ALTURA DE UNA FIGURA: ");
        altura = tcl.nextInt();
        System.out.println("");
        System.out.println("----CALCULADORA DE AREAS----");
        System.out.println("1. AREA DE UN CUADRADO");
        System.out.println("2. AREA DE UN TRINAGULO");
        System.out.println("3. AREA RECTANGULO");
        System.out.print("INGRESE UNA OPCION: ");
        num = tcl.nextInt();
        switch (num) {
            case 1:
                System.out.println("EL AREA DEL CUADRADO ES: " + areaCuadrado(base, area));
                
                break;
            case 2:
                System.out.println("AREA DEL TRIANGULO ES: " + areaTriangulo(base, altura, area));
                
                break;
            case 3:
                System.out.println("AREA DEL RECTANGULO ES: " + areaRectangulo(base, altura, area));
                break;
            default:
                System.out.println("ERROR");
        }
    }

    public static int areaCuadrado(int base, int area) {
        area = base * base; 
        return area;
    }

    public static int areaTriangulo(int base, int altura, int area) {
        area = (base * altura) / 2;
        return area;
    }

    public static int areaRectangulo(int base, int altura, int area) {
        area = (base * altura);
        return area;
    }
}

/***
 * run:
 * INGRESE EL LADO DE UNA FIGURA: 10
 * INGRESE LA ALTURA DE UNA FIGURA: 10

 * ----CALCULADORA DE AREAS----
 * 1. AREA DE UN CUADRADO
 * 2. AREA DE UN TRINAGULO
 * 3. AREA RECTANGULO
 * INGRESE UNA OPCION: 2
 * AREA DEL TRIANGULO ES: 50
 */