package com.jse.sintaxis;

/**
 * Ejemplos de uso de la clase Math
 * 
 * @see https://www.w3schools.com/java/java_ref_math.asp
 */
public class EjemplosMath {

	public static void main(String[] args) {

		int x = 10;
		int y = 5;
		System.out.println(x > y); 
		
		
		// máximo
		System.out.println(Math.max(5.7, 4.6));
		// mínimo
		System.out.println(Math.min(5.7, 4.6));
		// valor absoluto
		System.out.println(Math.abs(-6.99));
		// raiz cuadrada
		System.out.println(Math.sqrt(64));
		// potencia
		System.out.println(Math.pow(4, 2));
		System.out.println(Math.pow(4, 3));
		// numero aleatorio entre 0 incluido y 1 excluido
		System.out.println(Math.random());
		// numero aleatorio entre 0 y 50
		System.out.println(Math.random()*50);
		// numero aleatorio entre 0 y 400
		System.out.println(Math.random()*400);
		


	}

}
