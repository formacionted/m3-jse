package com.jse.poo.inner;

public class InnerMain {

	public static void main(String[] args) {

		
		
		/*
		 * 1 - Eclipse: clases, objetos, herencia, polimorfismo, clases internas - Practicar
		 * 2 - Github y repositorio git en Github 
		 * 3 - Avanzar en el proyecto - Frontend html css js 
		 * 4 - Linkedin
		 */
		
		
		
//		OuterClass1 outer = new OuterClass1();
//		OuterClass1.InnerClass1 inner = outer.new InnerClass1();
//		inner.apellidos = "Kilimanjaro Garcia";
//		inner.peso = 67;
//
//		System.out.println(inner.apellidos);
//		System.out.println(inner.peso);
//		outer.method1();
//		inner.method2();
//		inner.method3();

		AplicacionWeb aplicacion = new AplicacionWeb();
		AplicacionWeb.Frontend frontend = aplicacion.new Frontend();
		AplicacionWeb.BackEnd backend = aplicacion.new BackEnd();

		aplicacion.imprimirStack();
		frontend.imprimirStackFrontend();
		backend.imprimirStackBackEnd();
		
		
		
		// Ejemplo si la clase interna es static
//		AplicacionWeb.Frontend staticFrontend = new AplicacionWeb.Frontend();
//		staticFrontend.imprimirStackFrontend();
		
		
//		OuterClass2 outer2 = new OuterClass2();
//		outer2.createInner();
//
//		OuterClass3.InnerClass1.saludar();
//		
	}

}
