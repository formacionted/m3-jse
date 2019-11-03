package com.jse.excepciones;

/**
 * Ejemplo de custom exception, una excepción creada por nosotros mismos para gestionar 
 * posibles errores en nuestro código
 * 
 */
public class NameFormatException extends Exception {

    private static final long serialVersionUID = 1L;

	private String mensaje;
	
	public NameFormatException(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	
	
}
