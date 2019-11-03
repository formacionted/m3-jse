package com.jse.poo.polimorfismo;

import com.jse.poo.herencia.Empleado;
import com.jse.poo.herencia.Mecanico;
import com.jse.poo.herencia.Programador;

public class PolimorfismoMain {

	public static void main(String[] args) {

		Empleado empleado = new Empleado("Rocatagliata", "8754165D", 145785221, 4);
		Empleado mecanico = new Mecanico("Pepe", "75247863T", 458799521, 5, "motos", true, true, 30000, 25000);
		Empleado programador = new Programador("Rigatuso", "7533463T", 74485965, 10, 500, "Java", true, true);
		// ================================
		
		Empleado[] empleados = {empleado, mecanico, programador};
		for (int i = 0; i < empleados.length; i++) {
			empleados[i].trabajar(); // Polimorfismo, es un Empleado pero ejecutará trabajar() de la subclase que corresponda
			
			// Ejemplos de como detectar a qué clase pertenece un objeto
			if (empleados[i] instanceof Mecanico) {
				System.out.println("Estamos trabajando con un objeto de tipo: " + Mecanico.class);
			}else if(empleados[i] instanceof Programador) {
				System.out.println("Estamos trabajando con un objeto de tipo: " + Programador.class);
			}else {
				System.out.println("Empleado normal");
			}
		}
	}

}
