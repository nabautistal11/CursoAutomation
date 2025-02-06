package com.trainning.sesion6;

public class Vehiculo {
    private String modelo;
    private String color;
    private String marca;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean encender() {
        // Implementación del encendido del vehículo
        return true;
    }
}
