package com.jse.excepciones;

/**
 * Propagar excepciones con throws
 */
public class Excepciones5 {

	public static void main(String[] args) {

		try {
			metodoConExcepcion();
			metodoConExcepcion2();
		} catch (NullPointerException | ArrayIndexOutOfBoundsException exception) {
			exception.printStackTrace();
		}
		System.out.println("seguimos");
		
	}

	private static void metodoConExcepcion() throws ArrayIndexOutOfBoundsException{

			String nombre1 = "nombre1";
			String nombre2 = "nombre2";
			String[] nombres = { nombre1, nombre2 };
			for (int i = 0; i <= nombres.length; i++) {
				System.out.println(nombres[i].length());
			}
	}

	
	private static void metodoConExcepcion2() throws NullPointerException{

		String nombre1 = null;
		String nombre2 = null;
		String[] nombres = { nombre1, nombre2 };
		for (int i = 0; i <= nombres.length; i++) {
			System.out.println(nombres[i].length());
		}
}
	
}
