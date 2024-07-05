import javax.swing.*;
import java.util.Scanner;

public class Facturas {
    public static void main(String[] args) {

        Scanner factura = new Scanner(System.in);
        System.out.println("Ingrese numero de factura");
        int producto = factura.nextInt();

        System.out.println("Ingrese la cantidad de productos comprados");
        int valor = factura.nextInt();

        double [] total = new double[valor];
        double sumatotal= 0.0;

        for (int i = 0; i < valor; i++ ){
            System.out.println("Ingrese valor del producto " + (i+1) +" : ");
            total [i]= factura.nextDouble();
            sumatotal += total[i];
        }

        System.out.println("total de compras es:" + sumatotal);
        factura.close();
    }
}
