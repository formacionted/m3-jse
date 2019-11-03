package com.jse.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * Leer y escribir tipos primitivos
 * 
 * En el código siguiente se muestra un ejemplo en el que se escriben 
 * unos valores de tipos primitivos en un fichero,
 *  después se leen esos alores del fichero y se muestran en pantalla
 *  
 *  @see <a href="https://www.javatpoint.com/java-fileoutputstream-class"> FileOutputStream</a>
 */
public class Files6 {

	public static void main(String[] args) {

		Random aleatorio = new Random();
		boolean b = aleatorio.nextBoolean();
		int n = aleatorio.nextInt();
		long l = aleatorio.nextInt() * 10L;
		float f = aleatorio.nextFloat();

		// escribir datos binarios
		DataOutputStream escribir = null;
		try {
			escribir = new DataOutputStream(new FileOutputStream("/home/alan/ted/files/binarydata.txt"));
			escribir.writeBoolean(b);
			escribir.writeInt(n);
			escribir.writeLong(l);
			escribir.writeFloat(f);
			escribir.close();
		} catch (IOException ioex) {
			System.out.println(ioex.getMessage());
		} 

		// leer datos binarios
		DataInputStream leer = null;
		try {
			leer = new DataInputStream(new FileInputStream("/home/alan/ted/files/binarydata.txt"));
			System.out.println("Booleano: " + leer.readBoolean());
			System.out.println("Entero: " + leer.readInt());
			System.out.println("Long: " + leer.readLong());
			escribir.writeLong(l);
			escribir.writeFloat(f);
			escribir.close();
		} catch (IOException ioex) {
			System.out.println(ioex.getMessage());
		}
	}

}
