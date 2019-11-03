package com.jse.poo.clases;

/**
 * Crear la clase FabricanteMoviles con propiedades para
 * 
 * nombre
 * razon social
 * numero de moviles en venta
 * nombre movil más vendido

 */
public class FabricanteMoviles {

	private String nombre;
	private String razonSocial;
	private int numMoviles;
	private String nombreMovil;
	
	public FabricanteMoviles() {
	}
	public FabricanteMoviles(String nombre, String razonSocial, int numMoviles, String nombreMovil) {
		this.nombre = nombre;
		this.razonSocial = razonSocial;
		this.numMoviles = numMoviles;
		this.nombreMovil = nombreMovil;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public int getNumMoviles() {
		return numMoviles;
	}
	public void setNumMoviles(int numMoviles) {
		this.numMoviles = numMoviles;
	}
	public String getNombreMovil() {
		return nombreMovil;
	}
	public void setNombreMovil(String nombreMovil) {
		this.nombreMovil = nombreMovil;
	}
	@Override
	public String toString() {
		return "FabricanteMoviles [nombre=" + nombre + ", razonSocial=" + razonSocial + ", numMoviles=" + numMoviles
				+ ", nombreMovil=" + nombreMovil + "]";
	}
}
