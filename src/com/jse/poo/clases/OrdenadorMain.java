package com.jse.poo.clases;

import java.util.Scanner;

/**
 * Desde un main pedimos que se introduzcan estos datos por teclado en orden, 
 * de forma que creamos 3 objetos y los almacenamos en un array de tipo Ordenador
 */
public class OrdenadorMain {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Ordenador[] ordenadores = new Ordenador[3];
		for (int i = 0; i < ordenadores.length; i++) {
			// obtencion datos
			System.out.println("Introduce los datos para un Ordenador:");
			System.out.println("Introduce tamPantalla:");
			double tamPantalla = teclado.nextDouble();
			System.out.println("Introduce nucleosFisicos:");
			int nucleosFisicos = teclado.nextInt();
			System.out.println("Introduce nucleosLogicos:");
			int nucleosLogicos = teclado.nextInt();
			System.out.println("Introduce ram:");
			double ram = teclado.nextDouble();
			// creamos Ordenador y lo almacenamos
			ordenadores[i] = new Ordenador(tamPantalla, nucleosFisicos, nucleosLogicos, ram);
			//Ordenador[] ordenadores = {ordenador1, ordenador2, ordenador3};
		}
		for (int i = 0; i < ordenadores.length; i++) {
			System.out.println(ordenadores[i]);
			if (i == 1) {
				Ordenador ordenador2 = ordenadores[i];
				System.out.println(ordenador2);
			}
		}
		teclado.close();
	}

}
