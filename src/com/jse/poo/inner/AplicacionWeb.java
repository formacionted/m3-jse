package com.jse.poo.inner;

/**
 * Ejemplo de uso de clases internas, tenemos una clase externa llamada AplicacionWeb y 
 * dentro dos clases internas: FrontEnd y BackEnd
 * @see <a href="https://www.w3schools.com/java/java_inner_classes.asp"> Inner classes</a>
 */
public class AplicacionWeb {

	public String nombre;
	public String dominio;
	public boolean almacenaDatos;
    public static String helloWorld = "helloworld"; // atributo estatico, quiere decir que pertenece a la clase no a los objetos
	
	public void imprimirStack() {
		System.out.println("Las tecnologias utilizadas en la aplicacion son Java, Html, Bootstrap, MySQL"  );
	}
	
	/**
	 * Desde la clase externa podemos crear objetos de las clases internas y utilizar su comportamiento (metodos)
	 */
	public void imprimirFrontend() {
		Frontend frontend = new Frontend();
		frontend.imprimirStackFrontend();
	}
	
	/**
	 * Inner class FrontEnd
	 */
	class Frontend{
		
		public boolean bootstrap;
		public String framework;
		
		public void imprimirStackFrontend() {
			System.out.println("Las tecnologias utilizadas en el FrontEnd son HTML, CSS3, BOOTSTRAP, JAVASCRIPT" );
		}
		/**
		 * Desde la clase interna puedo acceder a atributos estaticos de la clase externa y modificarlos, pero 
		 * solo si son static
		 */
		public void helloWorld() {
			helloWorld = "Hola mundo desde FrontEnd";
			System.out.println(helloWorld);
		}
	}
	
	/**
	 * Inner class BackEnd
	 */
	class BackEnd{
		
		public boolean database;
		public String framework;
		
		public void imprimirStackBackEnd() {
			System.out.println("Las tecnologias utilizadas en el BackEnd son Java, Spring, Hibernate, MariaDB" );
		}
		
		public String getDomain() {
			return dominio;
		}
		
	}
}
