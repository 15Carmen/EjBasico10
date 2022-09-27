package ejbasico10;

import java.util.Scanner;

public class EjBasico10 {
    public static void main(String[] args) {

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner (System.in);

        //Declaramos la variable precio y la constante IVA
        double precio;
        final double IVA=0.21;

        /**
         * Le pedimos al ususario que introduzca el precio del producto sin IVA
         */
        System.out.println("Introduzca el precio del producto: ");
        precio=sc.nextDouble();

        //Calculamos el nuevo precio multiplicando la cantidad introducida por el IVA y sumándosela al precio introducido
        precio=(precio*IVA)+precio;

        //Mostramos por pantalla las variables
        System.out.println("El precio del producto con IVA es: "+precio);


    }
}
