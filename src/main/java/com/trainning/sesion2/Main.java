package com.trainning.sesion2;

public class Main {

    private static final int edadPerrosAdmitidos = 3;
    private String nombre = "";
    private char n = 'a';

    public static String name = "Juan"; //Global
    // Definicion Variable
    // {Metodo de acceso = private, protected, public, default} {(static= reservar espacio ram(start), final=)} {Tipo de dato(primitivo objeto)} NOMBREDEVARIBALE;
    // {Metodo de acceso = private, protected, public, default} {(static= reservar espacio ram(start), final=)} {Tipo de dato(primitivo objeto)} NOMBREDEVARIBALE = VALOR;

    // Definicion Metodos-funciones
    // {Metodo de acceso = private, protected, public, default} {(static= reservar espacio ram(start) OPCIONAL} {Tipo de dato(primitivo datoObjeto)} NOMBREDEMETODO (PARAMETROS --- Tipo nombre) {INSTRUCCIONES}

    public static void saludar(String nombre) {
        //Ejecuta las instrucciones pero no devuelve nada
        System.out.println("Hola " + name);
        System.out.println("Hola " + nombre);

    }





    //Dato objeto
    Coche c = new Coche();

    public static void main(String[] args) {
        //Cambiar valor variable final=error
        //edadPerrosAdmitidos =2;
        //Sin instancia
        System.out.println(Coche.name + " " + name);

        String t = "";

        saludar("Aleja");
        Coche c = new Coche();

        c.saludar("Ale");

    }
}
