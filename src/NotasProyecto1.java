import java.util.Scanner;

    public class NotasProyecto1 {

        public static void main(String[] args) {

            System.out.println(" ===== Programa de notas =====");

            // objeto que permite escanear o recibir un valor de la consola
            Scanner escaner = new Scanner(System.in);

            // solicitamos numero estudiantes
            System.out.println("Ingrese Nombre del estudiante: ");
            // variable que guarda el numero de estudiantes
            String nombreEstudiante = escaner.next();

            System.out.println(" Igresar Notas del estudiante = " + nombreEstudiante);

            int cantidadNotas = escaner.nextInt();

            double [] calificaciones = new double[cantidadNotas];


            for (int i = 0; i < cantidadNotas; i++ ){
                System.out.println("Ingrese la nota " + (i+1) +" : ");
                calificaciones [i]= escaner.nextDouble();

            }

            double sumaNotas = 0.0;
            double notaMaxima = calificaciones[0];
            double notaMinima = calificaciones[0];
            double aprobado;
            double notaAprobacion = 6.0;

            for (double nota : calificaciones){
                sumaNotas += nota;

                if (nota > notaMaxima){
                    notaMaxima = nota;
                }

                if (nota < notaMinima) {
                    notaMinima = nota;
                }

            }


            double promedio = sumaNotas / cantidadNotas;



            System.out.println("Nombre del estudiante " + nombreEstudiante);
            System.out.println("Cantidad de notas " + cantidadNotas);
            System.out.println("promedio = " + promedio);
            System.out.println("Nota minima = " + notaMinima);
            System.out.println("Nota maxima = " + notaMaxima );

            if(promedio >= notaAprobacion) {
                System.out.println("Estudiante aprobado, felicitaciones \u263A");
            }else {
                System.out.println("Estudiante reprobado, ya valio \u2639");
            }

        }


    }
