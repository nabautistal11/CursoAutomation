package com.trainning.sesion4;

public class Coche {

    //Construtor por defecto
    public Coche(){
        String saludo = Main.crearSaludo("aleja");
        System.out.println(saludo);
    }

    public Coche(String saludo){
        Main.saludar(Main.crearSaludo(saludo));
    }

}
