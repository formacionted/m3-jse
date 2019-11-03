package com.jse.sintaxis.ejercicios;

import java.util.Scanner;

/**
 * Realiza una aplicación que nos pida un número de ventas a introducir, después
 * nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
 * Al final mostrara la suma de todas las ventas
 */
public class Ejercicio13 {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de ventas");
        int numVentas = teclado.nextInt();

        /*
         * Declaramos una variable para sumar las ventas, si lo declaramos dentro del
         * bucle, no podriamos acceder fuera del bucle a la suma de las ventas. Esto es
         * por el ámbito.
         */
        double sumaVentas = 0;
        for (int i = 0; i < numVentas; i++) {
            // indico el numero de venta
            System.out.println("Introduce el precio de la venta " + (i + 1));
            double venta = teclado.nextDouble();

            // Acumulamos el valor de la venta
            sumaVentas = sumaVentas + venta;
        }
        System.out.println(sumaVentas);
        System.out.printf("Value: %.2f", sumaVentas);
        System.out.println("");
        teclado.close();
    }
}