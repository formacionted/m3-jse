package com.jse.poo.clases;

public class CartaMain {

	public static void main(String[] args) {

		Carta c1 = new Carta(Carta.AS, Carta.OROS);
		Carta carta = new Carta(Carta.TRES, Carta.ESPADAS);
		Carta miCarta = new Carta(Carta.REY, Carta.BASTOS);
		Carta c2 = miCarta;
		
		// Como el atributo palo es público:
		c2.palo = Carta.COPAS;
		if (miCarta.palo == Carta.BASTOS)
			System.out.println("La carta es de bastos");
		else
			System.out.println("La carta es de copas");
		
		Fecha fecha = new Fecha(21, 10, 2019);
		System.out.println(fecha.toString());
	}

}
