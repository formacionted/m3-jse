package com.jse.poo.herencia;

public class Programador extends Empleado {

	private int numLineasCodigoDia;
	private String lenguaje;
	private boolean backend;
	private boolean frontend;
//	private boolean devops;
	public Programador() {
		// TODO Auto-generated constructor stub
	}
	public Programador(int numLineasCodigoDia, String lenguaje, boolean backend, boolean frontend) {
		this.numLineasCodigoDia = numLineasCodigoDia;
		this.lenguaje = lenguaje;
		this.backend = backend;
		this.frontend = frontend;
	}
	
	public Programador(String nombre, String nif, long nss, int antiguedad, int numLineasCodigoDia, String lenguaje, boolean backend, boolean frontend) {
		super(nombre, nif, nss, antiguedad);
		this.numLineasCodigoDia = numLineasCodigoDia;
		this.lenguaje = lenguaje;
		this.backend = backend;
		this.frontend = frontend;
	}
	public int getNumLineasCodigoDia() {
		return numLineasCodigoDia;
	}
	public void setNumLineasCodigoDia(int numLineasCodigoDia) {
		this.numLineasCodigoDia = numLineasCodigoDia;
	}
	public String getLenguaje() {
		return lenguaje;
	}
	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	public boolean isBackend() {
		return backend;
	}
	public void setBackend(boolean backend) {
		this.backend = backend;
	}
	public boolean isFrontend() {
		return frontend;
	}
	public void setFrontend(boolean frontend) {
		this.frontend = frontend;
	}
	
	public void trabajar() {
		System.out.println("Soy Programador y tamos desarrollando, todo ok.");
	}
	@Override
	public String toString() {
		return "Programador [numLineasCodigoDia=" + numLineasCodigoDia + ", lenguaje=" + lenguaje + ", backend="
				+ backend + ", frontend=" + frontend + ", getNombre()=" + getNombre() + ", getNif()=" + getNif()
				+ ", getNss()=" + getNss() + ", getAntiguedad()=" + getAntiguedad() + "]";
	}
	

	
	
	
}
