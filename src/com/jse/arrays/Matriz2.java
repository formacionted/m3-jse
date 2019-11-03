package com.jse.arrays;

public class Matriz2 {

	public static void main(String[] args) {
		
		// forma 1
		char[][] chars = new char[2][2];
		chars[0][0] = 'a';
		chars[0][1] = 'b';
		chars[1][0] = 'c';
		chars[1][1] = 'd';
		
		// forma 2 equivalente a la forma 1
//		char[][] chars = {{'a', 'b' }, {'c' , 'd'}};
		
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars.length; j++) {
				System.out.println(" chars[" + i + "][" + j + "]=" + chars[i][j]);
			}
		}
	}

}
