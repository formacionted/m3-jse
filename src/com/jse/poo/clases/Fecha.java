package com.jse.poo.clases;

public class Fecha {

	// Atributos/Propiedades de los valores
	final static public int ENERO = 1, FEBRERO = 2, MARZO = 3, ABRIL = 4;
	final static public int MAYO = 5, JUNIO = 6, JULIO = 7, AGOSTO = 8, SEPTIEMBRE = 9;
	final static public int OCTUBRE = 10, NOVIEMBRE = 11, DICIEMBRE = 12;
	private int day;
	private int month;
	private int year;

	// Constructor
	public Fecha(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// Métodos/Operaciones sobre los valores
	// ...
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Fecha [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	

}
