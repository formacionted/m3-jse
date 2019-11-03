package com.jse.poo.clases;

/**
 * Ejemplos de como crear objetos de la clase Coche
 */
public class CocheMain {

	int numero = 5;
	
	public static void main(String[] args) {

		//sintaxis creacion objeto
		Coche coche1 = new Coche();
		// asignacion valores a sus propiedades/atributos
		coche1.marca = "Ferrari";
		coche1.modelo = "458 Italia";
		coche1.peso = 1437.78;
		
//		System.out.println("Marca: " + coche1.marca);
//		System.out.println("Modelo: ".concat(coche1.modelo));
//		System.out.println("Peso: " + coche1.peso);
//		System.out.println(coche1);
//		System.out.println(coche1.toString());
//		System.out.println("======================");
//		
		Coche coche2 = new Coche();
		coche2.marca = "Tesla";
		coche2.modelo = "Roadster";
		coche2.peso = 1238;
//		System.out.println(coche2.toString());
//		System.out.println(coche2.marca);
//		System.out.println("======================");


		Coche coche3 = new Coche("Fiat","Multipla", 1755.48);
//		System.out.println(coche3.toString());
//		System.out.println(coche3.marca);
//		System.out.println("======================");
		
		Coche[] coches = {coche1, coche2, coche3};
		for (int i = 0; i < coches.length; i++) {
			System.out.println(coches[i].toString());
		}
		
		System.out.println("======================");

		
		// Modificar valores de un objeto
		coche1.marca = "Dodge";
		coche1.modelo = "Charger";
		coche1.peso = 1845.23;
		System.out.println(coche1.toString());
		System.out.println("======================");
//		
//		
		// Ejemplo de static
		// metodos public (pero no static) - necesitamos crear un objeto para llamarlos
		coche1.acelerar();
		
		// metodos static - podemos llamarlos sin crear un objeto - sirve por ejemplo en clases de utilidad
		Coche.frenar();
//		
//
//		
		// modificador final - no se puede cambiar el valor
		// probar a añadir un nuevo atributo con final
		
	}

}
