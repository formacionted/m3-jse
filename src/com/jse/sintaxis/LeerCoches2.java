package com.jse.sintaxis;

import java.util.Scanner;

public class LeerCoches2 {

	public static void main(String[] args) {

		/* 5 - Crear una clase con main que lea 5 nombres de Coches utilizando Scanner y metodo next
		 * Imprimir los nombres utilizando un bucle while */
	     Scanner teclado = new Scanner(System.in);
	     int contador = 0;
	     String[] coches = new String[2];
	     while (contador <2) {
	    	 coches[contador] = teclado.next();
	    	 contador++;
	     }
	     for (int i = 0; i < coches.length; i++) {
			System.out.println(coches[i]);
		}
			teclado.close();

	}

}
