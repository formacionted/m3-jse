package com.jse.sintaxis.ejercicios;

import javax.swing.JOptionPane;

/**
 * Lee un número por teclado y muestra por consola, el carácter al que pertenece
 * en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.
 * 
 * American Standard Code for Information Interchange (Código Normalizado Americano para el Intercambio de Información)
 * 
 * @see https://ascii.cl/es/
 */
public class Ejercicio8 {

    public static void main(String[] args) throws Exception {

        String texto = JOptionPane.showInputDialog("Introduce un codigo de la tabla ASCII");
        // Pasamos el String a int
        int codigo = Integer.parseInt(texto);

        // Pasamos el codigo a caracter
        char caracter = (char) codigo;

        System.out.println(caracter);
    }
}