package com.jse.sintaxis;
/**
 * Clase de utilidad para trabajar con Arrays
 */
public class ArrayUtil {

	
	/**13 - 
	 * Crear una clase ArrayUtil.java sin main
	 * Crear dentro un metodo publico, es decir, accesible para el resto de clases
	 * Ese metodo recibe un array de int y un numero int
	 * El metodo devuelve boolean
	 * Dentro se verifica si el array contiene ese numero y devuelve true si está 
	 * o false si no está
	 * 
	 * Crear un método que reciba dos parametros, el primero un array de int
	 * el segundo un número int
	 * el método debe verificar si el array contiene ese número int
	 * devuelve true si está o false si no está
	 * 
	 * Llamar desde aquí al método 2 veces, una con un array que sí contenga un numero
	 * y otra que no lo contenga y verificar que efectivamente devuelve true o false
	 * cuando corresponde.
	 * */
	public static boolean arrayContains(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Metodo que comprueba cuantas veces esta un numero repetido en un array
	 * @param enteros10 array de enteros
	 * @param number numero a comprobar en el array de enteros
	 * @return numero de veces que number esta repetida en el array
	 */
	public static int checkRepeated(int[] enteros10, int number) {

		int sumatorio = 0;
		for (int i = 0; i < enteros10.length; i++) {
			if (enteros10[i] == number) {
				sumatorio++;
			}
		}
		
		return sumatorio;
	}

	
}
