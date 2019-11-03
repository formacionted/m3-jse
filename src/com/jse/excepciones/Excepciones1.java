package com.jse.excepciones;

/**
 * Manejo de excepciones, pueden ser de 3 tipos:
 * 
 *  1 - Errores: Ej. Desbordamiento de la pila o que la JVM se queda sin memoria
 *  2 - Unchecked Exceptions: Ej. fallos en tiempo de ejecución como ArrayIndexOutOfBoundsException
 *  3 - Checked Exception: Ej. fallos en tiempo de compilación como FileNotFoundException
 *  
 *  Jerarquía:
 *  
 *  Object
 *  	Throwable
 *  		Error
 *  		Exception
 *  			RuntimeException
 *  			Resto de excepciones
 */
public class Excepciones1 {

	public static void main(String[] args) {
		// Ejemplo de NullPointerException
		// https://i.stack.imgur.com/j9vg8.jpg
		try {
			String prueba = null;
			prueba.length();
		} catch (Exception exception) {
		}

		
		try {
			String[] nombres = {"Nombre1", "Nombre2", "Nombre3", "Nombre4"};
			for (int i = 0; i <= nombres.length; i++) {
				System.out.println(nombres[i]);
			}
		} catch (ArrayIndexOutOfBoundsException excepcion) {
			System.out.println("Ha ocurrido un error");
			excepcion.printStackTrace();
		}

		System.out.println("Seguimos avanzando");
	}

}
