package com.jse.colecciones;

import java.util.HashMap;
import java.util.Map;

/**
 * Uso de la estructura de datos HashMap para almacenar pares clave - valor
 */
public class MapasString {

	public static void main(String[] args) {

		// Creacion de un mapa de nombre - apellido
		HashMap<String, String> personas = new HashMap<String, String>();
		personas.put("Rodolfito", "Cadorna");
		personas.put("Raul", "Fiorito");
		personas.put("Gandolfi", "Martinez");
		personas.put("Miguel", "Rocatagliata");
		System.out.println(personas);
		System.out.println("=====================");

		// Obtener un elemento del mapa
		String apellidoRaul = personas.get("Raul");
		System.out.println(apellidoRaul);
		System.out.println("=====================");

		
		// obtener el tamaño del mapa
		System.out.println(personas.size());
		System.out.println("=====================");

		
		// Iterar sobre el mapa:
			// iterar sobre las claves
			for (String nombre : personas.keySet()) {
				  System.out.println("Nombre: " + nombre);
			}
			System.out.println("=====================");

			// iterar sobre los valores
			for (String apellido : personas.values()) {
				  System.out.println("Apellido: " + apellido);
			}
			System.out.println("=====================");
			// iterar sobre ambos claves y obtener tambien el valor
			for (String persona : personas.keySet()) {
				  System.out.println("Persona: " + persona + " " + personas.get(persona));
			}
			System.out.println("=====================");

			// iterar sobre ambos a la vez con un entryset
			for (Map.Entry<String, String> persona : personas.entrySet()) {
				  System.out.println("Persona: " + persona.getKey() + " " + persona.getValue());
			}
	}

}
