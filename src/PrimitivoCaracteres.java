public class PrimitivoCaracteres {

    public static void main(String[] args) {

        char caracter = 'a';
        System.out.println("caracter = " + caracter);


        char caracter2 = '\u0040';
        System.out.println("caracter2 = " + caracter2);
        //
        var decimal = 64;
        System.out.println("decimal = " + decimal);

        System.out.println("decimal comparacion = " + (decimal == caracter2));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo comparacion = " + (simbolo == caracter2));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("Char corresponde en bytes =  " + Character.BYTES );
        System.out.println("Char corresponde en bites =  " + Character.SIZE );
        System.out.println("Character.MIN_VALUE =  " + Character.MIN_VALUE );
        System.out.println("Character.MAX_VALUE =  " + Character.MAX_VALUE );



    }

}
