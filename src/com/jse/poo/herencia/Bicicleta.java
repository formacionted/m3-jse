package com.jse.poo.herencia;

/**
 * Subclase que hereda de la superclase Vehiculo
 */
public class Bicicleta extends Vehiculo{

	private String tipo; // Montaña, carreras, plegale etc
	private double radioRueda;
	private String composicionCuadro;
	
	public Bicicleta() {
	}
	public Bicicleta(String tipo, double radioRueda, String composicionCuadro) {
		super();
		this.tipo = tipo;
		this.radioRueda = radioRueda;
		this.composicionCuadro = composicionCuadro;
	}
	public Bicicleta(String tipo, double radioRueda, String composicionCuadro, int numRuedas) {
		super();
		this.tipo = tipo;
		this.radioRueda = radioRueda;
		this.numRuedas = numRuedas;
//		setNumRuedas(numRuedas);
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getRadioRueda() {
		return radioRueda;
	}
	public void setRadioRueda(double radioRueda) {
		this.radioRueda = radioRueda;
	}
	public String getComposicionCuadro() {
		return composicionCuadro;
	}
	public void setComposicionCuadro(String composicionCuadro) {
		this.composicionCuadro = composicionCuadro;
	}
	@Override
	public String toString() {
		return "Bicicleta [tipo=" + tipo + ", radioRueda=" + radioRueda + ", composicionCuadro=" + composicionCuadro
				+ ", getNumRuedas()=" + getNumRuedas() + "]";
	}

	
	
	
}
