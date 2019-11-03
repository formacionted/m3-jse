package com.jse.poo.herencia;

/**
 * 5 - Crear la clase empleado con propiedades para:
 * nombre
 * nif
 * numero seguridad social
 * años de antiguedad
 */
public class Empleado {

	private String nombre;
	private String nif;
	private long nss;
	private int antiguedad;
	
	public Empleado() {
	}
	public Empleado(String nombre, String nif, long nss, int antiguedad) {
		this.nombre = nombre;
		this.nif = nif;
		this.nss = nss;
		this.antiguedad = antiguedad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public long getNss() {
		return nss;
	}
	public void setNss(long nss) {
		this.nss = nss;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public void trabajar() {
		System.out.println("Soy Empleado y tamos trabajando, todo ok.");
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", nif=" + nif + ", nss=" + nss + ", antiguedad=" + antiguedad + "]";
	}
}
