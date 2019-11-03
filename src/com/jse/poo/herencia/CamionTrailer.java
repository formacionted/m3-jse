package com.jse.poo.herencia;

/**
 * Subclase que hereda de la superclase Vehiculo
 */
public class CamionTrailer extends Vehiculo {

	private double alto;
	private double ancho;
	private int numLuces;
	
	public CamionTrailer() {
	}
	public CamionTrailer(double alto, double ancho, int numLuces) {
		super();
		this.alto = alto;
		this.ancho = ancho;
		this.numLuces = numLuces;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public int getNumLuces() {
		return numLuces;
	}
	public void setNumLuces(int numLuces) {
		this.numLuces = numLuces;
	}
	
	@Override
	public String toString() {
		return "CamionTrailer [alto=" + alto + ", ancho=" + ancho + ", numLuces=" + numLuces + ", numRuedas="
				+ getNumRuedas() + "]";
	}

	
}
