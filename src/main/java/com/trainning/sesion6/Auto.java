package com.trainning.sesion6;

public class Auto extends Vehiculo {
    /*
    Padre-----------Vehiculo
    Hijo-------------------------Auto
    Hijo-------------------------Barco
    Hijo-------------------------Moto
     */

    private int capacidad;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}


