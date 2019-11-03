package com.jse.string;

import java.util.Arrays;

/**
 * Uso de los metodos de la clase String
 * anchor
 * @see <a href=
 *      "https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html">String API</a>
 * @author alansastre
 *
 */
public class StringMetodos {

	public static void main(String[] args) {

		// Funcion length: Longitud de un string
		String nombre0 = "Gandolfi";
		System.out.println(nombre0.length());
		System.out.println("==================");

		// Funcion charAt(int x): obtiene un caracter
		String nombre1 = "Rintintin";
		char caracter = nombre1.charAt(0);
		System.out.println(caracter); // R
		System.out.println(nombre1.charAt(6)); // t

		
		// imprime: Rintintin
		for (int i = 0; i < nombre1.length(); i++) {
			System.out.print(nombre1.charAt(i));
		}

		
		System.out.println("\n==================");

		// Funcion concat()
		String nombre2 = "Miguel", nombre3 = "Carlos";
		System.out.println(nombre2.concat(nombre3)); // MiguelCarlos
		System.out.println(nombre2.concat(" Carlos")); // Miguel Carlos
		System.out.println(nombre2 + " " + nombre3); // Miguel Carlos
		
		
		// Funcion isEmpty() - para comprobar si un string tiene longitud 0
		String nombre4 = "fgffgfg";
		if (nombre4.isEmpty()) {
			System.out.println("La variable nombre4 está vacía.");
		} else {
			System.out.println("La variable nombre4 tiene valor: ".concat(nombre4));
		}
		System.out.println("==================");
		
		
		
//
//		
		// Funcion contains("") - Permite saber si un string contiene a otro string o un char
		String nombre5 = "Licenciado";
		System.out.println(nombre5.contains("ado")); // true
		System.out.println(nombre5.contains("Licenciado")); // true 
		System.out.println(nombre5.contains("dd")); // false

		System.out.println("==================");
//
		// Funcion contentEquals("") - Permite verificar si dos string son iguales
		String nombre6 = "Fernando";
		System.out.println(nombre6.contentEquals("Miguel")); //  false
		System.out.println(nombre6.contentEquals("Fernando")); // true

		System.out.println("==================");
//
//		
		//Funcion endsWith("") - Permite saber si un string termina con una cadena de texto
		System.out.println("Fernando".endsWith("ando")); // true
		//Funcion endsWith("") - Permite saber si un string empieza con una cadena de texto
		System.out.println("Fernando".startsWith("gggg")); // false
//
		System.out.println("==================");

		//funcion compareTo() - comparacion lexicografica (Unicode)
		System.out.println("Pepe".compareTo("Pep"));
		System.out.println("Pepe".compareTo("Pepe"));
		System.out.println("Pepe".compareTo("Pepd"));
		System.out.println("Pepe".compareTo("Pepf"));
		System.out.println("Pepe".compareTo("Pepee"));
//		
//		System.out.println("==================");
//
//		
		//Funcion equals
		System.out.println("Hola".equals("Hola"));
		System.out.println("Hola".equals("Adios"));
		System.out.println("==================");
//
//		
//		//Funcion equalsIgnoreCase
		System.out.println("Hola Pepe".equalsIgnoreCase("hola pepe")); // true
		System.out.println("Hola".equals("hola")); // false
//
		System.out.println("==================");
		
//
//		//funcion toUpperCase y toLowerCase
		String nombre7 = "Marcos";
		System.out.println(nombre7.toUpperCase()); //
		System.out.println(nombre7.toLowerCase()); // 

		System.out.println("==================");
//
//
//		
//		// Funcion replace
		String nombre8 = "Nombrezillo bajo zero";
		System.out.println(nombre8.replace("z", "c")); // Nombrecillo bajo cero
		System.out.println(nombre8.replaceFirst("z", "c")); // Nombrecillo bajo zero
		
		System.out.println("==================");
//
//		
		String myString = "__x___x___x_x____xx_";
		char oldChar = 'x';
		char newChar = 'o';
		System.out.println(myString.replace(oldChar, newChar)); // __o___
		System.out.println("=================="); 
//
//		
		String otroNombre= "one fish, two fish, three fish";
		String target = "fish";
		String replacement = "sheep";
		String replacementResult = otroNombre.replace(target, replacement);
		System.out.println(replacementResult); // one sheep, two sheep
		System.out.println("==================");
//
//		
//		// Funcion replaceAll - la diferencia con la anterior es que replaceAll nos permite usar
//		// expresiones regulares (patrones de busqueda)
//
		String nombre10 = "__1_6____3__6_345____0";
		String regex1 = "\\d";
		String reemplazo1 = "x";
		String resultadoReplaceAll = nombre10.replaceAll(regex1, reemplazo1); 
		System.out.println(resultadoReplaceAll);
		System.out.println("==================");
//
//		
		String nombre11 = "   Horse         Cow\n\n   \r Camel \t\t Sheep \n Goat        ";
		String regex = "\\s";
		String reemplazo2 = "";
		String pruebaReplaceAll = nombre11.replaceAll(regex, reemplazo2); 
System.out.println(pruebaReplaceAll);
System.out.println("==================");
		
		// trim
		String orig = "    quick brown fox    ";
		System.out.println(orig.trim());
		
		// substring 
		System.out.println("desconcertado".substring(3)); 
		// concertado
//		
		String obdulio = "Obduliooo";
		System.out.println(obdulio.substring(2, 7));
		// dulio
		//duli
//		
//		System.out.println("==================");
// PARSING - PARSEO - PARSEAR
		// valueOf - nos permite obtener la represetancion textual del parametro recibido
		long numero = 5;
		String numeroString = String.valueOf(numero);
		String numeroConcatenado = numeroString.concat(" gatos");
		System.out.println(numeroConcatenado);
		// 5 gatos
//		
//		
//		 //split

		String nombreEspaciado = "alan,miguel,marcos,juanito";
		String[] nombreArray = nombreEspaciado.split(",");
		System.out.println(nombreArray.length); 

		
//		// La clase StringBuilder
		StringBuilder platillo = new StringBuilder("Platillo");
		platillo.append(" volador");
		platillo.append(" no identificado");
		System.out.println(platillo);
		System.out.println(platillo.toString());
		System.out.println("==================");
		// Platillo volador no identificado

//		// StringBuilder
//		// como aplicar toString a un array
		String[] array = {"elemento1", "elemento2", "elemento3"};
		System.out.println(array);
		System.out.println(Arrays.toString(array));
		System.out.println("==================");
//
//		

		
	}

}
