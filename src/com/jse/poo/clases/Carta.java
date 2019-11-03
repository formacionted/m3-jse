package com.jse.poo.clases;

public class Carta {

	// Atributos/Propiedades de los valores
	//variables de clase
	final static public int OROS = 1, COPAS = 2, ESPADAS = 3, BASTOS = 4;
	final static public int AS = 1, DOS = 2, TRES = 3, CUATRO = 4, CINCO = 5, SEIS = 6;
	final static public int SIETE = 7, SOTA = 10, CABALLO = 11, REY = 12;

	//variables de instancia
	public int palo;
	private int numero;

	// Métodos/Operaciones sobre los valores
	// Constructor
	public Carta(int numero, int palo) {
		switch (numero) {
		case AS:
		case DOS:
		case TRES:
		case CUATRO:
		case CINCO:
		case SEIS:
		case SIETE:
		case SOTA:
		case CABALLO:
		case REY:
			this.numero = numero;
			break;
		default:
			this.numero = AS;
		}
		switch (palo) {
		case OROS:
		case COPAS:
		case ESPADAS:
		case BASTOS:
			this.palo = palo;
			break;
		default:
			this.palo = OROS;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
