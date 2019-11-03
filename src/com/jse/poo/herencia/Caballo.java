package com.jse.poo.herencia;

/**
 * Subclase que hereda de una superclase que tiene el modificador abstract
 */
public class Caballo extends Animal {

	@Override
	public void animalSound() {
		System.out.println("Cabalito de palo");
	}

}
