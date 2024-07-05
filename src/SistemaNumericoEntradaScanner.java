import javax.swing.*;
import java.util.Scanner;

public class SistemaNumericoEntradaScanner {
    public static void main(String[] args) {

        //permite scanner leer objetos desde consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        // scanner.nextLine sirve para que el usuario escriba el numero desde la consola
        //String numeroStr= scanner.nextLine();
        int numeroDecimal = 0;
        // try catch permite hacer un bucle, si esta correcto hace el try el main y pasa a el siguiente paso de umero decial
        // el catch es el que sale si existe algun error y pasa por el main
        try {
            numeroDecimal= scanner.nextInt();//Integer.parseInt(numeroStr);
        } catch (Exception e){
            System.out.println("Error debe intresar un numero entero");
            // Aquí se llama al método  nuevamente, pasando los mismos argumentos ().
            // Esto es conocido como recursión y hace que el programa vuelva a empezar desde el principio.
            main(args);
            System.exit(0);
        }

        System.out.println("numero Decimal es = " + numeroDecimal);
        String resultadoBinario= "numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHex = "numeroOctal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n"+ resultadoOctal;
        mensaje += "\n"+ resultadoHex;

        System.out.println(mensaje);
    }
}
