package com.jse.excepciones;

/**
 * Ejemplo de manejo de excepciones anidando bloques try-catch
 */
public class Excepciones3 {

	public static void main(String[] args) {

		try {
				try {
					String nombre1 = null;
					String nombre2 = null;
//					String nombre1 = "nombre1";
//					String nombre2 = "nombre2";
					String[] nombres = { nombre1, nombre2 };
					for (int i = 0; i <= nombres.length; i++) {
						System.out.println(nombres[i].length());
					}
				} catch (NullPointerException exception) {
					exception.printStackTrace();	
				}
		} catch (ArrayIndexOutOfBoundsException exception) {
			exception.printStackTrace();
		}
	}

}
