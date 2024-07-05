import java.util.Scanner;

public class EjercicioMaria {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        boolean salir = true;
        bucle1: while(salir) {

            // se imprime el listado de emociones concatenadas para ir una bajo otra con \n
            System.out.println("Cada numero de la lista representa un estado emocional de 'maria' \n 1. Alegria \n 2. Tristeza \n 3. Enojo \n 4. Ansiedad \n 5. Miedo\n 6. Salir del programa\n 7. ???..... "
                    + "\nIngresa un numero correspondiente al listado: ");

            // cada caso es un entero
            int estadoEmocional = s.nextInt(); // cada uno se imprime en una linea diferente
            // switch permite ejecutar diferentes bloques de código según el valor de una expresión.
            // Es una alternativa a utilizar múltiples sentencias if-else
            switch (estadoEmocional) {

                case 1:
                    System.out.println("Elejiste alegre: " + "\nEs creativa y dispone de todas sus habilidades. 'ultrainstinto'");
                    break;
                case 2:
                    System.out.println("Elejiste triste: " + "\nSe la mantiene diciendo que no es buena para programar.");
                    break;
                case 3:
                    System.out.println("Elejiste enojada: " + "\nNo se le puede decir nada, y no ganaras en una discusion.");
                    break;
                case 4:
                    System.out.println("Elejiste ansiedad: " + "\nTodo el dia piensa en lo que no ha pasado, y se lo imagina, y un poco intensa.");
                    break;
                case 5:
                    System.out.println("Elejiste miedo: " + "\nSe la mantiene imaginando un capitulo de la rosa de guadalupe, pero en su vida.");
                    break;
                case 6:
                    System.out.println("Elejiste salir: \n Saliendo del programa.....");

                    break bucle1;
                case 7:
                    System.out.println("La verdad maria eres capas de muchas cosas, siga adelante.... :) ");
                    break;
                default:
                    System.out.println("Debes elegir un numero del 1 al 7");
                    break;

            }
            s.nextLine();
            System.out.println("Ingresa enter para continuar de nuevo");
            s.nextLine();



        }
    }
    }

