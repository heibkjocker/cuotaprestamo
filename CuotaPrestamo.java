//cargar la libreria de utilidades de java
import java.util.Scanner;

public class CuotaPrestamo {

    public static void main(String[] args) {

        System.out.println("Programa para calcular el valor de una cuota de un prestamo");

        if (args.length >= 3) {
            double monto = Double.parseDouble(args[0]);
            double tasa = Double.parseDouble(args[1]) / 100;
            int periodos = Integer.parseInt(args[2]);


            //calcular cuota
            double cuota = monto * Math.pow(1 + tasa, periodos) * tasa / (Math.pow(1 + tasa, periodos) - 1);
            System.out.println("El valor de la cuota es " + cuota);

        } else {
            System.out.println("Faltan párametros de entrada");
        }


    }
}