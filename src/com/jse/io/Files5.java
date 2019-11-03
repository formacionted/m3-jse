package com.jse.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Flujos de caracteres 
 * Ejemplo que copia el contenido de un archivo de entrada
 * (test1.txt) en un archivo de salida (test2.txt)
 */
public class Files5 {

	public static void main(String[] args) throws IOException {

		try {
			FileReader entrada = new FileReader("/home/alan/ted/files/test1.txt");
			FileWriter salida = new FileWriter("/home/alan/ted/files/test2.txt");
			int i;
			while ((i = entrada.read()) != -1) {
				System.out.print((char) i);
				salida.write(i);
			}
			entrada.close();
			salida.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
	}

}
