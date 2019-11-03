package com.jse.sintaxis.ejercicios;

/**
 * Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 o 3.
 */
class Ejercicio12 {

	public static void main(String[] args) throws Exception {
		int num = 1;

		// Definimos el bucle, incluye el 100
		while (num <= 100) {
			if (num % 2 == 0 || num % 3 == 0) {
				System.out.println(num);
			}
			num++;
		}
	}
}