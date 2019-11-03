package com.jse.poo.herencia;
/**
 * Ejemplo de subclase que hereda de la superclase Empleado
 */
public class Mecanico extends Empleado {

	private String especialidad;
	private boolean motocicletas;
	private boolean reprogramacion;
	private double sueldoBrutoAnual;
	private double sueldoNetoAnual;
	
	public Mecanico() {
	}

	public Mecanico(String especialidad, boolean motocicletas, boolean reprogramacion, double sueldoBrutoAnual,
			double sueldoNetoAnual) {
		this.especialidad = especialidad;
		this.motocicletas = motocicletas;
		this.reprogramacion = reprogramacion;
		this.sueldoBrutoAnual = sueldoBrutoAnual;
		this.sueldoNetoAnual = sueldoNetoAnual;
	}

	public Mecanico(String nombre, String nif, long nss, int antiguedad,String especialidad, boolean motocicletas, boolean reprogramacion, double sueldoBrutoAnual,
			double sueldoNetoAnual) {
		super(nombre, nif, nss, antiguedad);
		this.especialidad = especialidad;
		this.motocicletas = motocicletas;
		this.reprogramacion = reprogramacion;
		this.sueldoBrutoAnual = sueldoBrutoAnual;
		this.sueldoNetoAnual = sueldoNetoAnual;
	}
	
	public Mecanico(String nombre, String nif, long nss, int antiguedad) {
		super(nombre, nif, nss, antiguedad);
	}

	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public boolean isMotocicletas() {
		return motocicletas;
	}
	public void setMotocicletas(boolean motocicletas) {
		this.motocicletas = motocicletas;
	}
	public boolean isReprogramacion() {
		return reprogramacion;
	}
	public void setReprogramacion(boolean reprogramacion) {
		this.reprogramacion = reprogramacion;
	}
	public double getSueldoBrutoAnual() {
		return sueldoBrutoAnual;
	}
	public void setSueldoBrutoAnual(double sueldoBrutoAnual) {
		this.sueldoBrutoAnual = sueldoBrutoAnual;
	}
	public double getSueldoNetoAnual() {
		return sueldoNetoAnual;
	}
	public void setSueldoNetoAnual(double sueldoNetoAnual) {
		this.sueldoNetoAnual = sueldoNetoAnual;
	}
	
	
	public void trabajar() {
		System.out.println("Soy Mecanico y tamos trabajando, todo ok.");
	}
	
	@Override
	public String toString() {
		return "Mecanico [especialidad=" + especialidad + ", motocicletas=" + motocicletas + ", reprogramacion="
				+ reprogramacion + ", sueldoBrutoAnual=" + sueldoBrutoAnual + ", sueldoNetoAnual=" + sueldoNetoAnual
				+ ", getNombre()=" + getNombre() + ", getNif()=" + getNif() + ", getNss()=" + getNss()
				+ ", getAntiguedad()=" + getAntiguedad() + "]";
	}

	
	

}
