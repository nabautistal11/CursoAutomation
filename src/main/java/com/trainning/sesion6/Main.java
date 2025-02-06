package com.trainning.sesion6;

public class Main {
    public static void main(String[] args) {
        Auto a = new Auto();
        a.setColor("Blanco");

        Vehiculo v = new Vehiculo();

        Moto m = new Moto();
        boolean encender = m.encender();
        System.out.println(encender);


    }

}
