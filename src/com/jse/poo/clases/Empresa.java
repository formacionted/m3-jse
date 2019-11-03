package com.jse.poo.clases;

/**
 * 1 - Crear una clase Empresa SIN encapsulacion que tenga atributos para:
 * nombre legal cif numero de empleados año de inicio numero de productos
 * facturacion anual costes anuales
 * 
 * crear un metodo para calcular el benefinio anual
 * 
 * Crear objetos de tipo Empresa haciendo uso del constructor y otros dando
 * valor directamente a sus propiedades
 */
public class Empresa {

	public String nombreLegal;
	public String cif;
	public int numEmpleados;
	public int fecha;
	public int numProductos;
	public double facturacionAnual;
	public double costeAnual;

	public Empresa() {
	}

	public Empresa(String nombreLegal, String cif, int numEmpleados, int fecha, int numProductos,
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

	@Override
	public String toString() {
		return "Empresa [nombreLegal=" + nombreLegal + ", cif=" + cif + ", numEmpleados=" + numEmpleados + ", fecha="
				+ fecha + ", numProductos=" + numProductos + ", facturacionAnual=" + facturacionAnual + ", costeAnual="
				+ costeAnual + "]";
	}
	
	

}
