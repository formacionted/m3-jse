package com.jse.poo.inner;

/**
 * Ejemplo de inner class no accesible desde el exterior debido al modificador
 * private
 */
public class OuterClass2 {

	private String nombre = "Rocatagliata";

	public void createInner() {
		InnerClass inner = new InnerClass();
		inner.getValue();
	}

	private class InnerClass {
		public void getValue() {
			System.out.println("Valor de nombre: " + nombre);
		}
	}

}
