package com.jse.colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class ListasString {

	public static void main(String[] args) {
		
		// Creacion de arraylist
	    ArrayList<String> cars = new ArrayList<String>();
	    // Añadir datos al array con el metodo add, se puede utilizar add cuantas veces queramos
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    System.out.println("================");

	    // obtener un elemento por su indice
	    System.out.println(cars.get(0));
	    System.out.println(cars.get(1));
	    System.out.println("================");

	    // Cambiar un elemento
	    
	    cars.set(0, "Ferrari");
	    System.out.println(cars);
	    System.out.println("================");
	    
	    // Obtener la longitud del array
	    System.out.println(cars.size());
	    System.out.println("================");
	    
	    // Iterar sobre el array: es común utilizar la estructura foreach
	    for (int i = 0; i < cars.size(); i++) {
	    	System.out.println(cars.get(i));
		}
	    System.out.println("================");
	    for (String car : cars) {
			System.out.println(car);
		}
	    System.out.println("================");
	    
	    
	    // Borrar un elemento
	    cars.remove(0);
	    System.out.println(cars);
	    System.out.println("================");
	    
	    // Resetear o limpiar el array:
	    cars.clear();
	    System.out.println(cars);
	    System.out.println(cars.size());
	    System.out.println("================");
	    
	    // a un array se le pueden añadir los elementos de otro array, ejemplo:
	    ArrayList<String> cars2 = new ArrayList<String>();
	    cars2.add("Volvo");
	    cars2.add("BMW");

	    ArrayList<String> cars3 = new ArrayList<String>();
	    cars3.add("Ford");
	    cars3.add("Bentley");
	    
	    cars.addAll(cars2);
	    cars.addAll(cars3);

	    System.out.println("Arraylist desornenado:");
	    System.out.println(cars);
	    
	    // Como ordenar un arraylist
	    
	    Collections.sort(cars); 
	    System.out.println("Arraylist ornenado:");

	    System.out.println(cars);
	    
	}

}
