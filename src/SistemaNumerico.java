import javax.swing.*;

public class SistemaNumerico {
    public static void main(String[] args) {

        String numeroStr= JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal= Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe intresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numero Decimal es = " + numeroDecimal);
        String resultadoBinario= "numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        // ob ayuda a la maquina a saber que es un numero decimal 
        int numeroBinario = 0b11110;
        System.out.println("numero Binario es = " + numeroBinario);

        String resultadoOctal = "numero Octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);
        String resultadoHex = "numeroOctal = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);


        String mensaje = resultadoBinario;
        mensaje += "\n"+ resultadoOctal;
        mensaje += "\n"+ resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
