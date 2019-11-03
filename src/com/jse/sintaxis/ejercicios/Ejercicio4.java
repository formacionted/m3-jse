package com.jse.sintaxis.ejercicios;

import java.util.Scanner;

/**
 * 4) Modifica la aplicación anterior, para que nos pida el nombre que queremos
 * introducir (recuerda usar JOptionPane).
 */
public class Ejercicio4 {

	public static void main(String[] args) throws Exception {

           Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
//		String nombre = "Alan";
		 String nombre=teclado.nextLine();

		System.out.println("Bienvenido " + nombre);
        teclado.close();

	}
}