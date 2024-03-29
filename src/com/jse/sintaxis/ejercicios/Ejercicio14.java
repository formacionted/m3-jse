package com.jse.sintaxis.ejercicios;

import java.util.Scanner;

/**
 * Lee un número por teclado y comprueba que este numero es mayor o igual que
 * cero, si no lo es lo volverá a pedir (do while), después muestra ese número
 * por consola.
 */
public class Ejercicio14 {

    public static void main(String[] args) throws Exception {

        /*
         * Declaramos la varible ya que sino no podemos usarla en el while por el tema
         * de ámbito
         */
        int codigo;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Introduce un numero mayor que 0");
            codigo = teclado.nextInt();
        } while (codigo <= 0);

        System.out.println(codigo);
        teclado.close();
    }
}