package com.jse.poo.clases;

/**
 * 8 - Crear una clase Móvil con propiedades para 
 * nombre
 * numero de núcleos
 * gigas de ram
 * tamaño de la pantalla en pulgada
 * peso en gramos
 */
public class Movil {

	private String nombre;
	private int numNucleos;
	private double ram;
	private double pulgadas;
	private double peso;
	private FabricanteMoviles fabricante;
	
	public Movil() {
	}
	public Movil(String nombre, int numNucleos, double ram, double pulgadas, double peso, FabricanteMoviles fabricante) {
		this.nombre = nombre;
		this.numNucleos = numNucleos;
		this.ram = ram;
		this.pulgadas = pulgadas;
		this.peso = peso;
		this.fabricante = fabricante;
	}
	
	public FabricanteMoviles getFabricante() {
		return fabricante;
	}
	public void setFabricante(FabricanteMoviles fabricante) {
		this.fabricante = fabricante;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumNucleos() {
		return numNucleos;
	}
	public void setNumNucleos(int numNucleos) {
		this.numNucleos = numNucleos;
	}
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		this.ram = ram;
	}
	public double getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Movil [nombre=" + nombre + ", numNucleos=" + numNucleos + ", ram=" + ram + ", pulgadas=" + pulgadas
				+ ", peso=" + peso + ", fabricante=" + fabricante.getNombre() + "]";
	}
	
	
	
	
}
