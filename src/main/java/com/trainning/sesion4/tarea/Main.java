package com.trainning.sesion4.tarea;

public class Main {

    public static void main(String[] args) {

        OperacionMatematica op = new OperacionMatematica(1,2);

        System.out.println("Suma: " + op.sumar());
        System.out.println("Resta: " + op.restar());
        System.out.println("Multiplicacion: " + op.multiplicar());
        System.out.println("Division: " + op.dividir());

    }
}
