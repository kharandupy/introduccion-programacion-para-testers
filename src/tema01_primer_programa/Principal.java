package tema01_primer_programa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Primer linea escrita de codigo
        System.out.println("Hola mundo!");
        System.out.println("Nuestro nuevo codigo");

       // System.out.print("Esto");
      //  System.out.print(" es una prueba de impresion");

        int numero;
        numero = 12;
        System.out.println("1-- El numero es: " + numero);

        numero = 7;
        System.out.println("2-- El numero es: " + numero);

        System.out.println("Ingrese su nombre: ");
        String nombre;
        Scanner scan = new Scanner(System.in);
        nombre = scan.nextLine();

        int edad;
        System.out.println("Ingrese su edad: ");
        edad = scan.nextInt();

        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad de " + nombre + " es de " + edad + " anos");


    }
}
