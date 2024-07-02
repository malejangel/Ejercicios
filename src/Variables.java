public class Variables {

    public static void main(String[] args) {

    }

        // variables: es un espacio reservado en la memoria, que guarda un valor

        // Se utiliza convencion el camelCase
        String holaSaludo;

        // utilizar guion bajo
        String hola_saludo;
        // tipo valor nombre variable su valor correspondiente
        String saludo = "Hola a todos";



        // variables instanciadas dentro de un clase

        public class Persona {
            String nombre;
            int edad;
        }

        // variables staticas

        static String especie = "humano"; // variable de la clase

        // variables locales

        public void saludar(){

            String mensaje = "Hola"; // variable local
            System.out.println("mensaje = " + mensaje);

        }
        // variable como parametro

        String nombre = "Jesus";
        public void mensajeBienvenida(String nombre){
            System.out.println("Hola bienvenido" + nombre);
        }





    }
