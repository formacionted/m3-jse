package com.jse.excepciones;

/**
 * Ejemplo de manejo de excepciones haciendo uso de try 
 * con varios catch
 */
public class Excepciones2 {

	public static void main(String[] args) {

		
		
		int variable1 = 5;
		try {
//			String prueba = null;
//			prueba.length();
			String nombre1 = null;
			String nombre2 = null;
//			String nombre1 = "nombre1";
//			String nombre2 = "nombre2";
			String[] nombres = { nombre1, nombre2 };
			for (int i = 0; i <= nombres.length; i++) {
				System.out.println(nombres[i].length());
			}
		} catch (NullPointerException exception) {
			System.out.println("NullPointerException");
//			exception.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("ArrayIndexOutOfBoundsException");
//			exception.printStackTrace();
		}

	}

}
