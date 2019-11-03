package com.jse.poo.herencia;

public class HerenciaEmpleadoMain {

	public static void main(String[] args) {

		Empleado empleado = new Empleado("Rocatagliata", "8754165D", 145785221, 4);
		empleado.trabajar(); // Soy Empleado
		System.out.println(empleado);
		System.out.println("================================");
		
		
		Mecanico mecanico = new Mecanico("Pepe", "75247863T", 458799521, 5, "motos", true, true, 30000, 25000);
		mecanico.trabajar(); // Soy Mecanico
		System.out.println(mecanico);
		System.out.println("================================");

		
		Programador programador = new Programador("Rigatuso", "7533463T", 74485965, 10, 500, "Java", true, true);
		programador.trabajar(); // Soy Programador
		System.out.println(programador);
		System.out.println("================================");

		

	}

}
