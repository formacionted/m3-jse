package com.jse.excepciones;

/**
 * Excepciones multicatch
 */
public class Excepciones4 {

	public static void main(String[] args) {

		try {
			String nombre1 = null;
			String nombre2 = null;
//			String nombre1 = "nombre1";
//			String nombre2 = "nombre2";
			String[] nombres = { nombre1, nombre2 };
			for (int i = 0; i <= nombres.length; i++) {
				System.out.println(nombres[i].length());
			}
		} catch (NullPointerException | ArrayIndexOutOfBoundsException exception) {
			exception.printStackTrace();
		} 
		}

}
