package com.trainning.sesion4.tarea;

public class OperacionMatematica {

    double numero1;
    double numero2;

    public OperacionMatematica(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double sumar(){
        return numero1 + numero2;
    }

    public double restar(){
        return numero1 - numero2;
    }

    public double multiplicar(){
        return numero1 * numero2;
    }

    public double dividir(){
        if(numero2!=0){
            return numero1 / numero2;
        }else {
            throw new ArithmeticException("No se puede dividir entre cero");
        }

    }
}
