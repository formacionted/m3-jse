package com.jse.poo.clases;

/**
 * 9 - Crear una clase Ordenador
 * con propiedades para 
 * tamaño de pantalla en pulgadas
 * numero de nucleos fisicos
 * numero de nucleos logicos
 * gigas de ram
 */
public class Ordenador {

	private double tamPantalla;
	private int nucleosFisicos;
	private int nucleosLogicos;
	private double ram;
	
	public Ordenador() {
	}
	public Ordenador(double tamPantalla, int nucleosFisicos, int nucleosLogicos, double ram) {
		this.tamPantalla = tamPantalla;
		this.nucleosFisicos = nucleosFisicos;
		this.nucleosLogicos = nucleosLogicos;
		this.ram = ram;
	}
	public double getTamPantalla() {
		return tamPantalla;
	}
	public void setTamPantalla(double tamPantalla) {
		this.tamPantalla = tamPantalla;
	}
	public int getNucleosFisicos() {
		return nucleosFisicos;
	}
	public void setNucleosFisicos(int nucleosFisicos) {
		this.nucleosFisicos = nucleosFisicos;
	}
	public int getNucleosLogicos() {
		return nucleosLogicos;
	}
	public void setNucleosLogicos(int nucleosLogicos) {
		this.nucleosLogicos = nucleosLogicos;
	}
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Ordenador [tamPantalla=" + tamPantalla + ", nucleosFisicos=" + nucleosFisicos + ", nucleosLogicos="
				+ nucleosLogicos + ", ram=" + ram + "]";
	}
	
	

}
