public class SistemaNumerico {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numero Decimal es = " + numeroDecimal);

        System.out.println("numero Binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        // ob ayuda a la maquina a saber que es un numero decimal 
        int numeroBinario = 0b111110100;

        System.out.println("numero Binario es = " + numeroBinario);
        System.out.println("numero Octal de " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println("numeroOctal = " + numeroOctal + " = " + Integer.toHexString(numeroOctal));

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
    }
}
