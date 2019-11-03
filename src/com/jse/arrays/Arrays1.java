package com.jse.arrays;

/**
 * Creación y uso de arrays. 
 * Un array es un conjunto indexado de valores de mismo tipo.
 * Es una estructura de datos fundamental en programación.
 */
public class Arrays1 {

	public static void main(String[] args) {

		int[] array1 = new int[5];
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		array1[4] = 5;
		printArray(array1);
		
		int array2Size = 3;
		int[] array2 = new int[array2Size];
		array2[0]= 1;
		array2[1] = 2;
		array2[2] = 3;
		printArray(array2);
		
		
		int[] array3 = { -1 ,0 , 1};
		printArray(array3);
		
		int array4[];
		array4 = new int[3];
		
	}
	
	static void printArray(int[] array) {
		System.out.println("=========== Printing array START");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("=========== Printing array END");
	}

}
