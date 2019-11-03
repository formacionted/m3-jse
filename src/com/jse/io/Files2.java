package com.jse.io;

import java.io.File;
/**
 * Obtener informacion 
 */
public class Files2 {

	public static void main(String[] args) {

		File myObj = new File("/home/alan/ted/files/file1.txt");
		if (myObj.exists()) {
			System.out.println("File name: " + myObj.getName());
			System.out.println("Absolute path: " + myObj.getAbsolutePath());
			System.out.println("Writeable: " + myObj.canWrite());
			System.out.println("Readable " + myObj.canRead());
			System.out.println("File size in bytes " + myObj.length());
		} else {
			System.out.println("The file does not exist.");
		}
	}

}
