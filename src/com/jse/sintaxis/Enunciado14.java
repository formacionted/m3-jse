package com.jse.sintaxis;

import java.util.Scanner;

/**
 * 14 - Crear una clase con metodo main 
 * 
 * Leer de la consola un numero entero
 * 
 * Crear un bucle for que sume todos los numeros pares desde 1 incluido hasta el
 * numero leido
 *
 */
public class Enunciado14 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numeroLeido = teclado.nextInt();
		int sumatorio = 0;
		for (int i = 0; i < numeroLeido; i++) {
			if (i % 2 == 0) {
//				sumatorio += i;
				sumatorio = sumatorio + i;
			}
		}
		System.out.println(sumatorio);
		teclado.close();
		
		
	}

}
