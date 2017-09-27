package com.andrestan1995gmail.celulares;

/**
 * Created by android on 26/09/2017.
 */

public class Celular {
    private String marca;
    private String capacidad;
    private String color;
    private int precio;

    public Celular(String marca, String capacidad, String color, int precio) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void guardar(){
        Datos.guardar(this);
    }
}

