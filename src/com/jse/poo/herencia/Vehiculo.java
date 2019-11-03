package com.jse.poo.herencia;

/**
 * Ejemplo de superclase de la que otras subclases heredarán
 */
public class Vehiculo {

	// atributos
	protected int numRuedas;
	
	//constructores
	public Vehiculo() {
	}
	
	public Vehiculo(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	
	//Comportamiento: metodos 
	public void acelerar() {
		System.out.println("Acelerando a todo gas");
	}
	public void frenar() {
		System.out.println("Echando el ancla");
	}
	
	// getter y setter
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	// tostring para representar los objetos de forma textual
	@Override
	public String toString() {
		return "Vehiculo [numRuedas=" + numRuedas + "]";
	}
	
	
}
