package org.example.Tarea6.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    static Scanner teclado = new Scanner(System.in);
    static Scanner teclado2 = new Scanner(System.in);

    public static void programa() {

        int[] tabla = new int[10];

        System.out.println("Introduce el valor mínimo: ");
        int min = teclado.nextInt();
        System.out.println("Introduce el valor máximo: ");
        int max = teclado2.nextInt();
        int mayor = 0;

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * (max - min + 1) + min);
            System.out.println(tabla[i]);
        }
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > mayor) {
                mayor = tabla[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
    }



}
