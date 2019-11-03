package com.jse.poo.interfaces;

import com.jse.poo.clases.Coche;

/**
 * Clase que implementa la interfaz CocheService, es obligatorio implementar todos los metodos que haya en la interfaz
 */
public class CocheServiceImpl implements CocheService{

	/**
	 * Devuelve todos los coches de la base de datos
	 */
	@Override
	public Coche[] findAll() {
		// TODO conectar con base de datos
		Coche coche1 = new Coche("Ferrari", "Italia 458", 1322.56);
		Coche coche2 = new Coche("Lamborghini", "Aventador", 1111.11);
		Coche[] coches = {coche1, coche2};
		return coches;
	}

	/**
	 * Encuentra un coche en la base de datos por su atributo id
	 */
	@Override
	public Coche findOne(Long id) {
		// TODO conectar con base de datos
		Coche coche1 = new Coche("Ferrari", "Italia 458", 1322.56);
		return coche1;
	}

	/**
	 * Guarda o actualiza un coche en la base de datos
	 */
	@Override
	public Coche save(Coche coche) {
		// TODO conectar con base de datos
		Coche coche1 = new Coche("Ferrari", "Italia 458", 1322.56);
		return coche1;
	}

	/**
	 * Borra un coche de la base de datos por su atributo id
	 */
	@Override
	public void delete(Long id) {
		// TODO conectar con base de datos
		
	}

}
