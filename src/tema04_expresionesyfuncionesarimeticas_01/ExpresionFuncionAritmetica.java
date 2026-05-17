package tema04_expresionesyfuncionesarimeticas_01;


public class ExpresionFuncionAritmetica {
    public static void main(String[] args) {
        int x, y;
        x = 3;
        int valor = x+4;
        System.out.println("El resultado es: " + valor);

        y = 29;
        int variosOp = x + 12 -y +1;
        System.out.println("El resultado es: " + variosOp);

        int ecuacion = x + y - 2 * 8;
        System.out.println("El resultado es: " + ecuacion);

        int parentesis = x + (y -2) * 8;
        System.out.println("El resultado es: " + parentesis);

        double funcion = 4 - Math.sqrt(4);
        System.out.println("El resultado de funcion es: " + funcion);

        int divisionEntera = 5 / 2;
        double divisionReal = 5.0 / 2.0;
        System.out.println("El resultado de la division entera es: " + divisionEntera);
        System.out.println("El resultado de la division real es: " + divisionReal);

        int resto = 5 % 2;
        System.out.println("El resto de la division entre 5 y 2 es: " + resto);

        System.out.println("Errores: " + 2 + 3);

        int a = 15;

        int b = -3;

        ((Math.pow(2, 3)) * 2) - 12 * 2.0;



    }
}
