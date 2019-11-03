package com.jse.poo.inner;

/**
 * Ejemplo de inner class accesible desde el exterior
 */
public class OuterClass1 {

	String nombre = "Raulito";
	int edad = 19;
	
	public void method1() {
		System.out.println("Buenos días desde OuterClass1");
	}
	class InnerClass1{
		
		String apellidos = "Rocatagliatta";
		int peso = 70;
		
		public void method2() {
			System.out.println("Buenos días desde InnerClass1");
		}
		
		public void method3() {
			System.out.println(nombre);
			System.out.println(edad);
		}
	}
	
	
}
