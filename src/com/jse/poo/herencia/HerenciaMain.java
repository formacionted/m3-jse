package com.jse.poo.herencia;

/**
 * Clase para mostrar el uso de herencia
 * 
 * Vehiculo -superclase
 * 		Bicicleta - subclase
 * 		CamionTrailer -subclase
 */
public class HerenciaMain {

	public static void main(String[] args) {
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setNumRuedas(5);
		vehiculo.acelerar();
		vehiculo.frenar();
		System.out.println(vehiculo);
		
		Bicicleta bicicleta = new Bicicleta();
		bicicleta.setComposicionCuadro("Fibra de carbono");
		bicicleta.setRadioRueda(60.23);
		bicicleta.setTipo("Triatlón");
		bicicleta.setNumRuedas(2);
		//Aunque fuera protected no se puede acceder por estar en diferente paquete
//		bicicleta.numRuedas = 4;
		System.out.println(bicicleta);	
		
		CamionTrailer camion = new CamionTrailer();
		camion.setAlto(5.26);
		camion.setAncho(6.23);
		camion.setNumLuces(25);
		camion.setNumRuedas(6);
		System.out.println(camion);
		
	}
}
