package com.jse.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Leer el contenido de un archivo
 */
public class Files4 {

	public static void main(String[] args) {

		try {
			File myObj = new File("/home/alan/ted/files/file1.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
