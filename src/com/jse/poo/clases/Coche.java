package com.jse.poo.clases;


/**
 * Clase que sirve como abstracción del concepto de Coche y sus diferentes propiedades
 */
public class Coche implements Comparable<Coche>{

	// Atributos
	public String marca;
	public String modelo;
	public double peso;
	
	//Constructores: el constructor permite instanciar un objeto
	// debe tener el mismo nombre que la clase
	public Coche() {
	}
	// Constructor sobrecargado
	public Coche(String marca, String modelo, double peso) {
		this.marca = marca;
		this.modelo = modelo;
		this.peso = peso;
	}
	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public Coche(String marca) {
		this.marca = marca;
	}
	
	// Podemos seguir añadiendo constructores....
	
	
	// Métodos
	public void acelerar() {
		System.out.println("Aceleramos pues");
	}
	
	public static void frenar() {
		System.out.println("Frenamos pues");
	}
	
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo  + ", peso=" + peso + "]";
	}
	@Override
	public int compareTo(Coche o) {
		return this.marca.compareTo(o.marca);
	}
	
	
}

