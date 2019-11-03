package com.jse.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Escribir contenido a un archivo de texto en el sistema de ficheros
 */
public class Files3 {

	public static void main(String[] args) {
	    try {
	        FileWriter myWriter = new FileWriter("/home/alan/ted/files/file1.txt");
	        myWriter.write("Files in Java might be tricky, but it is fun enough!");
	        myWriter.close();
	        System.out.println("Successfully wrote to the file.");
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}

}
