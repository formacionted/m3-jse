package com.jse.enumeraciones;

public class EnumMain {

	public static void main(String[] args) {
		
		// Uso de una constante de la enumeracion
		System.out.println(EIncidentType.ROAD);
		System.out.println("==================");
		// iterar sobre todas las constantes de la enumeracion
		
		for (EIncidentType tipo : EIncidentType.values()) {
			System.out.println(tipo);
		}
		
	}
}
