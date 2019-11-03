package com.jse.poo.clases;

/**
 * Clase para probar el concepto de encapsulacion
 * 
 * 2 - Crear una clase Empresa2 CON encapsulacion que tenga atributos para:
 * nombre legal
 * cif
 * numero de empleados
 * año de inicio
 * numero de productos
 * facturacion anual
 * costes anuales
 * 
 * Crear objetos de tipo Empresa2 haciendo uso de constructor y haciendo uso de metodos setter
 */
public class Empresa2 {

	private String nombreLegal;
	private String cif;
	private int numEmpleados;
	private int fecha;
	private int numProductos;
	private double facturacionAnual;
	private double costeAnual;

	public Empresa2() {
	}

	public Empresa2(String nombreLegal, String cif, int numEmpleados, int fecha, int numProductos,
			double facturacionAnual, double costeAnual) {
		this.nombreLegal = nombreLegal;
		this.cif = cif;
		this.numEmpleados = numEmpleados;
		this.fecha = fecha;
		this.numProductos = numProductos;
		this.facturacionAnual = facturacionAnual;
		this.costeAnual = costeAnual;
	}

	/**
	 * It calculates benefits of the company
	 * 
	 * @return total
	 */
	public double calcularBeneficio() {
		return this.facturacionAnual - this.costeAnual;
	}

	//getter - setter
	
	


	public String getNombreLegal() {
		return nombreLegal;
	}

	@Override
	public String toString() {
		return "Empresa2 [nombreLegal=" + nombreLegal + ", cif=" + cif + ", numEmpleados=" + numEmpleados + ", fecha="
				+ fecha + ", numProductos=" + numProductos + ", facturacionAnual=" + facturacionAnual + ", costeAnual="
				+ costeAnual + "]";
	}

	public void setNombreLegal(String nombreLegal) {
		this.nombreLegal = nombreLegal;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public int getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public int getNumProductos() {
		return numProductos;
	}

	public void setNumProductos(int numProductos) {
		this.numProductos = numProductos;
	}

	public double getFacturacionAnual() {
		return facturacionAnual;
	}

	public void setFacturacionAnual(double facturacionAnual) {
		this.facturacionAnual = facturacionAnual;
	}

	public double getCosteAnual() {
		return costeAnual;
	}

	public void setCosteAnual(double costeAnual) {
		this.costeAnual = costeAnual;
	}
}
