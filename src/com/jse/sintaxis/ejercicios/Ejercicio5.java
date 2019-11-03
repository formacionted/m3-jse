package com.jse.sintaxis.ejercicios;

import javax.swing.JOptionPane;

/**
 * 4) Modifica la aplicación anterior, para que nos pida el nombre que queremos
 * introducir (recuerda usar JOptionPane).
 */
public class Ejercicio5 {

    public static void main(String[] args) throws Exception {

        //Nos aparece un cuadro de dialogo
        String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
 
        System.out.println("Bienvenido "+nombre);
    }
}