package tema04_operadoresaritmeticos_01;

import java.util.Scanner;

public class CalculoRectangulo {
    public static void main(String[] args) {

        // 1-- Obtener el largo del rectangulo
        float largo;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el largo del rectangulo: ");
        largo = scan.nextFloat();

        // 2-- Obtener el ancho del rectangulo
        float ancho;
       //  Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el ancho del rectangulo: ");
        ancho = scan.nextFloat();

        // 3-- Calcular el area del rectangulo
        float area;
        area = largo * ancho;

        // 4-- Imprimir el resultado
        System.out.println("El area del rectacngulo es: " + area);
    }
}
