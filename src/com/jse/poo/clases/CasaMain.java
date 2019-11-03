package com.jse.poo.clases;

/**
 * 3 - Crear una clase Casa con encapsulacion y atributos para:
 * tipo (departamento, piso, chalet)
 * numero de plantas
 * numero de habitaciones
 * numero de baños
 * tiene chimenea ? si o no
 * tiene garaje ? si o no
 * 
 * Crear todas las variantes de constructores sobrecargados.
 * Crear objetos de tipo Casa haciendo uso de todos los constructores, las propiedades
 * que no permita instanciar el constructor las instanciaremos con metodos setter
 *
 */
public class CasaMain {

	public static void main(String[] args) {

		Casa scarface = new Casa();
		scarface.setChimenea(true);
		scarface.setGaraje(true);
		scarface.setNumBathrooms(4);
		scarface.setNumHabitaciones(4);
		scarface.setNumPlantas(3);
		scarface.setTipo("pisaco");
		
		Casa mansion = new Casa(2, true, true);
		mansion.setTipo("chalet");
		mansion.setNumPlantas(3);
		mansion.setNumHabitaciones(5);
		
		Casa pisoFranco = new Casa("Pisito", 1, 3);
		pisoFranco.setNumBathrooms(1);
		pisoFranco.setGaraje(true);
		pisoFranco.setChimenea(false);
		
		Casa sotano = new Casa("Zulo", 1, 1, 0, false, false);
		
		Casa[] casas = {scarface, mansion, pisoFranco, sotano};
		for (int i = 0; i < casas.length; i++) {
			System.out.println(casas[i]);
		}

	}

}
