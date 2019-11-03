package com.jse.io;

import java.io.File;
import java.io.IOException;

/**
 * Ejemplo de como crear un archivo de texto en el sistema
 */
public class Files1 {

	public static void main(String[] args) {

	    try {
	    	// Windows:
	    	//File myObj = new File("C:\\Users\\MyName\\filename.txt");
	    	// Linux:
	    	File myObj = new File("/home/alan/ted/files/file1.txt");
	        if (myObj.createNewFile()) {
	          System.out.println("File created: " + myObj.getName());
	        } else {
	          System.out.println("File already exists.");
	        }
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	    
	}

}
