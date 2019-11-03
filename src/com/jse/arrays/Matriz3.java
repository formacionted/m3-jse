package com.jse.arrays;

public class Matriz3 {

	public static void main(String[] args) {


		int[][][] array3d = new int[3][4][2];
		int i, j, k, num = 1;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				for (k = 0; k < 2; k++) {
					array3d[i][j][k] = num;
					num++;
				}
			}
		}

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				for (k = 0; k < 2; k++) {
					System.out.print("arr[" + i + "][" + j + "][" + k + "] = " + array3d[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
