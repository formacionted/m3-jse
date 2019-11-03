package com.jse.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.jse.poo.clases.Coche;


public class MapasCoche {

	public static void main(String[] args) {
		
		Coche ferrari = new Coche("Ferrari", "Italia 458", 1322.56);
		Coche lamborghini = new Coche("Lamborghini", "Aventador", 1111.11);
		Coche bentley = new Coche("Bentley", "Continental GT", 1835.62);
		
		HashMap<String, Coche> coches = new HashMap<String, Coche>();
		coches.put("Ferrari", ferrari);
		coches.put("Lamborghini", lamborghini);
		coches.put("Bentley", bentley);
		
		System.out.println(coches);
		System.out.println("========================");
		/*
		 * Los mapas se suelen utilizar para almacenar listas, por ejemplo, almacenar varios coches en base a su marca:
		 */
		
		Coche ferrari812 = new Coche("Ferrari", "812 GTS", 1322.56);
		Coche ferrari458 = new Coche("Ferrari", "458 Italia", 1111.11);
		List<Coche> ferrariList = new ArrayList<>();
		ferrariList.add(ferrari812);
		ferrariList.add(ferrari458);

		Coche lambAventador = new Coche("Lamborghini", "Aventador", 1322.56);
		Coche lambHuracan = new Coche("Lamborghini", "Huracán", 1111.11);
		List<Coche> lambList = new ArrayList<>();
		lambList.add(lambAventador);
		lambList.add(lambHuracan);
		
		HashMap<String, List<Coche>> cochesMap = new HashMap<String, List<Coche>>();
		cochesMap.put("Ferrari", ferrariList);
		cochesMap.put("Lamborghini", lambList);
		
		System.out.println(cochesMap);
		
		
	}
}
