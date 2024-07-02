public class Primitivos {

    /* existen 2 categorias de datos los de primitivos y de referencia */
    /* los de referencia son los objetivos las instancias de una clase*/

    public static void main(String[] args) {

        /* byte = byte short en byte es Short  int en byte es Integer long en BYte es Long */
        /* el var es un tipo de caracter que puede ser cualquier tipo de dato primitivo de aceerdo a lo que se le asigne */

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en Byte a = " +Byte.BYTES);
        System.out.println("tipo byte corresponde en Byte a= " +Byte.SIZE);
        System.out.println("malor maximo de byte= " +Byte.MAX_VALUE);
        System.out.println("malor manimo de byte= " +Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroByte);
        System.out.println("tipo short corresponde en Byte a = " +Short.BYTES);
        System.out.println("tipo short corresponde en Byte a= " +Byte.SIZE);
        System.out.println("malor maximo de byte= " +Short.MAX_VALUE);
        System.out.println("malor manimo de byte= " +Short.MIN_VALUE);

        int numeroInt= 2147483647;
        System.out.println("numeroInt = " + numeroByte);
        System.out.println("tipo int corresponde en Byte a = " +Integer.BYTES);
        System.out.println("tipo int corresponde en Byte a= " +Byte.SIZE);
        System.out.println("malor maximo de byte= " +Integer.MAX_VALUE);
        System.out.println("malor manimo de byte= " +Integer.MIN_VALUE);

        long numeroLong= 9223372036854775807L;
        System.out.println("numerolong = " + numeroByte);
        System.out.println("tipo long corresponde en Byte a = " +Long.BYTES);
        System.out.println("tipo long corresponde en Byte a= " +Byte.SIZE);
        System.out.println("malor maximo de byte= " +Long.MAX_VALUE);
        System.out.println("malor manimo de byte= " +Long.MIN_VALUE);
    }
}
