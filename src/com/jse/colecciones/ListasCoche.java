package com.jse.colecciones;

import java.util.ArrayList;
import java.util.Collections;

import com.jse.poo.clases.Coche;

/**
 * Uso de Arraylist con objetos de tipo Coche
 */
public class ListasCoche {

	public static void main(String[] args) {

		// Creamos objetos de la clase Coche
		Coche ferrari = new Coche("Ferrari", "Italia 458", 1322.56);
		Coche lamborghini = new Coche("Lamborghini", "Aventador", 1111.11);
		Coche bentley = new Coche("Bentley", "Continental GT", 1835.62);

		// Creacion del arraylist de tipo coche
		ArrayList<Coche> coches = new ArrayList<Coche>();
		coches.add(ferrari);
		coches.add(lamborghini);
		coches.add(bentley);
		System.out.println(coches);
		System.out.println("===============================");
		
		// Ordenar los coches, necesario que Coche implemente la interfaz Comparable
	    Collections.sort(coches);  
		System.out.println("ArrayList ordenado: " + coches);
		System.out.println("===============================");

		// añadir un coche al arraylist
		coches.add(new Coche("Dodge", "Charger", 1990.6));
		System.out.println(coches);
		System.out.println("===============================");

		
		// eliminar un coche por el indice
		coches.remove(0);
		System.out.println(coches);
		System.out.println("===============================");


		// elimianr un coche directamente por el objeto
		coches.remove(lamborghini);
		System.out.println(coches);
		System.out.println("===============================");



	}

}
