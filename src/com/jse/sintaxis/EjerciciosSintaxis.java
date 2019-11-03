package com.jse.sintaxis;

public class EjerciciosSintaxis {

	/**
	 * 
	 * @param args ARgumentos con nombres
	 * @since 1.0
	 */
	public static void main(String[] args) {

		/*
		 * 1 - If Crear una variable con un precio cualquiera Comprobar con if si es
		 * mayor de 49.99 Si lo es imprimir el precio de la variable diciendo que es
		 * mayor
		 */
		double precio1 = 54.11;
		if (precio1 > 49.99) {
			String resultado1 = "La variable precio1 con valor "+ precio1 +" es mayor que 49.99";
			System.out.println(resultado1);
		}
		
		System.out.println("==========================");
		/*
		 * 2 - If else 
		 * Crear una variable con un precio cualquiera 
		 * Comprobar con if si es mayor de 49.99 
		 * Si lo es imprimir el precio de la variable diciendo que es mayor 
		 * Si no lo es imprimir el precio de la variable diciendo que es menor o igual
		 */
		double precio2 = 54.11;
		if (precio2 > 49.99) {
			String resultado1 = "La variable precio2 con valor "+ precio2 +" es mayor que 49.99";
			System.out.println(resultado1);
		}else {
			String resultado1 = "La variable precio2 con valor "+ precio2 +" es menor o igual que 49.99";
			System.out.println(resultado1);
		}
		
		// Equivalente: String resultadoTernario = precio2 > 49.99 ? "mayor" : "menor" ;
		
		System.out.println("==========================");

		/*
		 * 3 - If anidados Crear una variable con un precio cualquiera Comprobar con if
		 * si es mayor de 49.99 
		 * Si lo es imprimir el precio de la variable diciendo que
		 * es mayor 
		 * Comprobar con if anidado si es igual que 49.99 Si lo es imprimir el
		 * precio de la variable diciendo que es igual 
		 * Si no es ninguna imprimir el
		 * precio de la variable diciendo que es menor
		 */
		double precio3 = 39.99;
		if (precio3 > 49.99) {
			System.out.println("La variable precio3 con valor "+ precio3 +" es mayor que 49.99");
		} else if(precio3 == 49.99){
			System.out.println("La variable precio3 con valor "+ precio3 +" es igual que 49.99");
		}else {
			System.out.println("La variable precio3 con valor "+ precio3 +" es menor que 49.99");
		}
		
		System.out.println("==========================");

		
		/*
		 * 4 - Operador ternario Hacer el ejercicio 2 pero con operador ternario
		 */
		double precio4 = 59.88;
		String resultadoTernario = precio4 > 49.99 ? "mayor" : "menor" ;
		System.out.println(resultadoTernario);
		
		System.out.println("==========================");

		/*
		 * 5 - Switch 
		 * Crear una variable entero con un número del mes actual 
		 * Declarar una variable String, pero no inicializarla. 
		 * Crear un switch que inicialice la
		 * variable string con el nombre del mes en base a la variable entero
		 */
		System.out.println(getMonthName(3));
		System.out.println(getMonthName(1));
		System.out.println(getMonthName(2));

		System.out.println("==========================");

		
		/*
		 * 6 - for Crear un array de precios Sumar los precios con un bucle for y
		 * mostrar el resultado por consola
		 */
		double[] precios = new double[4];		
		precios[0] = 4.99;
		precios[1] = 6.99;
		precios[2] = 8.99;
		precios[3] = 12.99;
		double resultadoPrecios = 0;
		for (int i = 0; i < precios.length; i++) {
			resultadoPrecios = resultadoPrecios + precios[i];
		}
		System.out.println(resultadoPrecios);
		
		System.out.println("==========================");

		
		/*
		 * 7 - for con break Crear un array de precios Sumar los precios con un bucle
		 * for y mostrar el resultado por consola Añadir una condición, si el precio que
		 * se itera es mayor de 49.99 lo sumamos y hacemos break
		 */
		double[] precios2 = new double[4];		
		precios2[0] = 4.99;
		precios2[1] = 6.99;
		precios2[2] = 50.22;
		precios2[3] = 12.99;
		double resultadoPrecios2 = 0;
		for (int i = 0; i < precios2.length; i++) {
			resultadoPrecios2 = resultadoPrecios2 + precios2[i];
			if (precios2[i] > 49.99) {
				break;
			}
		}
		System.out.println(resultadoPrecios2);
		
		
		
		System.out.println("==========================");

		
		/*
		 * 8 - for con continue Crear un array de precios Sumar los precios con un bucle
		 * for y mostrar el resultado por consola Añadir una condición, si el precio que
		 * se itera es mayor de 49.99 no lo sumamos y hacemos continue
		 */
		double[] precios3 = new double[4];		
		precios3[0] = 4.99;
		precios3[1] = 6.99;
		precios3[2] = 50.22;
		precios3[3] = 12.99;
		double resultadoPrecios3 = 0;
		for (int i = 0; i < precios3.length; i++) {
			if (precios3[i] > 49.99) {
				continue;
			}
			resultadoPrecios3 = resultadoPrecios3 + precios3[i];

		}
		System.out.println(resultadoPrecios3);
		
		
		System.out.println("==========================");

		
		
		/*
		 * 9 - Foreach Crear un array de caracteres que almacene las letras ordenadas de
		 * nuestro nombre Concatenar los caracteres en una misma cadena de texto
		 * utilizando un bucle foreach e imprimir esa cadena por consola
		 */

		char[] nombre = {'a','l','a','n'};
		
		String nombreResultado = "";
		for (char letra : nombre) {
//			nombreResultado = nombreResultado + letra;
			nombreResultado += letra;
		}
		System.out.println(nombreResultado);
		System.out.println("==========================");

		/*
		 * 10 - while Imprimir los numeros pares del 1 al 100 usando un bucle while
		 */
		int contador = 1;
		while (contador<=100) {
			if (contador % 2 == 0) {
				System.out.println(contador);
			}
			contador++;
		}
		/*
		 * 11 - dowhile hacer el ejemplo anterior con dowhile
		 */
		int contador2 = 1;
		do {
			if (contador2 % 2 == 0) {
				System.out.println(contador2);
			}
			contador2++;
		} while (contador2 <= 100);

		
	}


	private static String getMonthName(int mes) {
		String nombreMes;
		switch (mes) {
		case 1:
			nombreMes = "Enero";
			break;
		case 2:
			nombreMes = "Febrero";
			break;
		case 3:
			nombreMes = "Marzo";
			break;
		case 4:
			nombreMes = "Abril";
			break;
		case 5:
			nombreMes = "Mayo";
			break;
			// ... 
		default:
			nombreMes = "No existe";

			break;
		}
		return nombreMes;
	}

}
