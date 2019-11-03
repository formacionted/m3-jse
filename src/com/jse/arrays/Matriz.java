package com.jse.arrays;

public class Matriz {

	
	public static void main(String[] args) {

		// crear array de 5x5
		int[][] matriz = new int[5][5];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = i + j;
				System.out.println(" matriz[" + 		i + "][" + j + "]=" + matriz[i][j]);
			}
			System.out.println("===========");
		}
		
		// imprimir longitud
		System.out.println(matriz.length); //imprime 5
		System.out.println(matriz[0].length); //imprime 5

	}
	

}
