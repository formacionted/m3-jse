package com.jse.sintaxis.ejercicios;

/**
 * Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
 */
public class Ejercicio11 {


    public static void main(String[] args) throws Exception {
    	
        int numero = 1;
        // Definimos el bucle, incluye el 100
        boolean checker = true;
        while (checker) {
            System.out.println(numero);
            // Incrementamos num
            numero++;
            if (numero > 100) {
            	checker = false;
			}
        }

        System.out.println("===========");
        // ahora con un bucle for 
        for (int i=1;i<=100;i++){
            System.out.println(i);
        }
    }
}