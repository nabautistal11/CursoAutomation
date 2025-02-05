package com.trainning.sesion4;

public class Main {

    public static void saludar(String saludo){
        System.out.println(saludo);
    }

    public static String crearSaludo(String nombre){
        String saludo = ""; //inicializacion
        //System.out.println("Hola " + nombre);
        //Instrucciones

        saludo = "hola " + nombre;
        return saludo;

    }


    public static void main(String[] args) {
        saludar("Aleja");
        System.out.println(crearSaludo("Ale"));
        Coche c = new Coche();
        Coche c1 = new Coche("Bienvenido");
        Alumno a = new Alumno("Pepe", "Lopez", 23);

        saludar(crearSaludo(a.getNombre()));
    }
}
