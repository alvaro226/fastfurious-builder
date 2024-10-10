package com.design.patterns.fastfurious.builder.domain;

public class Automobile {
    private String color;  // Cambiado de "shade" a "color"
    private String fechaEnsamblaje;  // Cambiado de "assemblyDate" a "fechaEnsamblaje"
    private String numeroEnsamblaje;  // Cambiado de "assemblyNumber" a "númeroEnsamblaje"

    public Automobile(String color, String fechaEnsamblaje, String numeroEnsamblaje) {
        this.color = color;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    public String getColor() {
        return color;
    }

    public String getFechaEnsamblaje() {
        return fechaEnsamblaje;
    }

    public String getNumeroEnsamblaje() {
        return numeroEnsamblaje;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFechaEnsamblaje(String fechaEnsamblaje) {
        this.fechaEnsamblaje = fechaEnsamblaje;
    }

    public void setNumeroEnsamblaje(String numeroEnsamblaje) {
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "color='" + color + '\'' +
                ", fechaEnsamblaje='" + fechaEnsamblaje + '\'' +
                ", númeroEnsamblaje='" + numeroEnsamblaje + '\'' +
                '}';
    }
}
