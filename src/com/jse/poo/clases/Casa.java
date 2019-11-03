package com.jse.poo.clases;

/**
 * 
 * 3 - Crear una clase Casa con encapsulacion y atributos para:
 * tipo (departamento, piso, chalet)
 * numero de plantas
 * numero de habitaciones
 * numero de baños
 * tiene chimenea ? si o no
 * tiene garaje ? si o no
 * 
 * Crear todas las variantes de constructores sobrecargados.
 * Crear objetos de tipo Casa haciendo uso de todos los constructores, las propiedades
 * que no permita instanciar el constructor las instanciaremos con metodos setter
 */
public class Casa {

	private String tipo; // departamento, piso, 
	private int numPlantas;
	private int numHabitaciones;
	private int numBathrooms;
	private boolean chimenea;
	private boolean garaje;
	
	public Casa() {
	} 
	public Casa(String tipo, int numPlantas, int numHabitaciones, int numBathrooms, boolean chimenea, boolean garaje) {
		super();
		this.tipo = tipo;
		this.numPlantas = numPlantas;
		this.numHabitaciones = numHabitaciones;
		this.numBathrooms = numBathrooms;
		this.chimenea = chimenea;
		this.garaje = garaje;
	}
	public Casa(String tipo, int numPlantas, int numHabitaciones) {
		super();
		this.tipo = tipo;
		this.numPlantas = numPlantas;
		this.numHabitaciones = numHabitaciones;
	}
	public Casa(int numBathrooms, boolean chimenea, boolean garaje) {
		super();
		this.numBathrooms = numBathrooms;
		this.chimenea = chimenea;
		this.garaje = garaje;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getNumPlantas() {
		return numPlantas;
	}
	public void setNumPlantas(int numPlantas) {
		this.numPlantas = numPlantas;
	}
	public int getNumHabitaciones() {
		return numHabitaciones;
	}
	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}
	public int getNumBathrooms() {
		return numBathrooms;
	}
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}
	public boolean isChimenea() {
		return chimenea;
	}
	public void setChimenea(boolean chimenea) {
		this.chimenea = chimenea;
	}
	public boolean isGaraje() {
		return garaje;
	}
	public void setGaraje(boolean garaje) {
		this.garaje = garaje;
	}
	@Override
	public String toString() {
		return "Casa [tipo=" + tipo + ", numPlantas=" + numPlantas + ", numHabitaciones=" + numHabitaciones
				+ ", numBathrooms=" + numBathrooms + ", chimenea=" + chimenea + ", garaje=" + garaje + "]";
	}


	
	
}
