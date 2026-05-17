package tema03_variablesytipos;

public class DatosDePrueba {
    public static void main(String[] args) {
        // declarer variables
        boolean loginExitoso = true;
        int cantidadDeErrores = 0;
        double tiempoDeRespuesta = 1.35;
        char ambiente = 'Q';

        String usuario = "admin";
        String password = "1234";
        String cadena = "hola mundo";

        System.out.println("usuario: " + usuario);
        System.out.println("Password: " + password);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("La cadena es: " + cadena);

        double resultadoInvalido = 0.0/0.0;
        System.out.println("Resultado invalido: " + resultadoInvalido);
    }
}
