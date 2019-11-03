package com.jse.poo.interfaces;

import com.jse.poo.clases.Coche;

/**
 * Ejemplo de interfaz que declara métodos para trabajar con la clase Car
 * 
 * Se utilizan comunmente para definir operaciones CRUD:
 * Create
 * Retrieve
 * Update
 * Delete
 */
public interface CocheService {

	// Ejemplo operaciones Retrieve
	Coche[] findAll();
	
	Coche findOne(Long id);
	
	//Ejemplo operaciones Create and Update
	Coche save(Coche coche);

	// operacion Delete
	void delete(Long id);
}
