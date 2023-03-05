package org.example.Tarea6.Ejercicio1;

public class Ejercicio1 {


    public static double funcion1(double a, double b){
        if(a > b){
            return a;
        }else{
            return b;
        }
    }

    public static String funcion2(double a, double b){
        if(a > b){
            return "1, el mayor es: " + a;
        }else if(a == b){
            return "0, son iguales";
        }else{
            return "-1, el mayor es: " + b;
        }
    }

    public void imprimir() {
        System.out.println("El numero mayor es: " + funcion1(73, 38));
        System.out.println("El resultado es: " + funcion2(91, 91));
    }
}

