package com.trainning.sesion6;

public class Moto extends Vehiculo{
    private String maletero;

    public String getMaletero() {
        return maletero;
    }

    public void setMaletero(String maletero) {
        this.maletero = maletero;
    }

    @Override
    public boolean encender() {
        // Implementación del encendido del vehículo
        return false;
    }
}
