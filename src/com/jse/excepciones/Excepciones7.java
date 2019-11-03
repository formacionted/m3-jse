package com.jse.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejemplo de uso try-catch con finally
 */
public class Excepciones7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		try {
			int number = teclado.nextInt();
			System.out.println("Numero leido: " + number);
		}catch (InputMismatchException e) {
			e.printStackTrace();
		} finally {
			// Cerrar recursos
			teclado.close();
		}
		
	}

}
