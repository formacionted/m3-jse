package com.jse.poo.clases;

/**
 * Clase fabricante apara agrupar todas las propiedades de un proveedor
 */
public class Fabricante {

	// Estado: Atributos
	private String nombre;
	private String razonSocial;
	private String direccion;
	private String telefono;
	private String email;
	
	// Constructores
	public Fabricante() {
	}

	// Comportamiento: metodos
	public String obtenerNombre() {
		return nombre.concat(" ").concat(razonSocial);
	}
	
	// Encapsulación: metodos Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	@Override
	public String toString() {
		return "Fabricante [nombre=" + nombre + ", razonSocial=" + razonSocial + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", email=" + email + "]";
	}
}
