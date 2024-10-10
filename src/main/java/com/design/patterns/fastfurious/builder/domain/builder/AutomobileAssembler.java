package com.design.patterns.fastfurious.builder.domain.builder;

public class AutomobileAssembler {
    private String chasis;
    private String motor;
    private String tapiceria;  // Cambiado de "upholstery" a "tapicería"
    private String color;  // Cambiado de "shade" a "color"
    private String fechaEnsamblaje;  // Cambiado de "assemblyDate" a "fechaEnsamblaje"
    private String numeroEnsamblaje;  // Cambiado de "assemblyNumber" a "númeroEnsamblaje"

    // Constructor con parámetros
    private AutomobileAssembler(
            String chasis,
            String motor,
            String tapiceria,
            String color,
            String fechaEnsamblaje,
            String numeroEnsamblaje) {
        this.chasis = chasis;
        this.motor = motor;
        this.tapiceria = tapiceria;
        this.color = color;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    // Constructor sin color
    private AutomobileAssembler(
            String chasis,
            String motor,
            String tapiceria,
            String fechaEnsamblaje,
            String numeroEnsamblaje) {
        this.chasis = chasis;
        this.motor = motor;
        this.tapiceria = tapiceria;
        this.fechaEnsamblaje = fechaEnsamblaje;
        this.numeroEnsamblaje = numeroEnsamblaje;
    }

    // Métodos setter
    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setTapiceria(String tapiceria) {
        this.tapiceria = tapiceria;
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

    // Métodos getter
    public String getChasis() {
        return chasis;
    }

    public String getMotor() {
        return motor;
    }

    public String getTapiceria() {
        return tapiceria;
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

    // Método para construir el objeto
    @Override
    public String toString() {
        return "AutomobileAssembler{" +
                "chasis='" + chasis + '\'' +
                ", motor='" + motor + '\'' +
                ", tapicería='" + tapiceria + '\'' +
                ", color='" + color + '\'' +
                ", fechaEnsamblaje='" + fechaEnsamblaje + '\'' +
                ", númeroEnsamblaje='" + numeroEnsamblaje + '\'' +
                '}';
    }

    // Clase concreta (builder)
    public static class AutomobileConcreteAssembler implements IAutomobileAssembler {
        private String chasis;
        private String motor;
        private String tapiceria;
        private String color;
        private String fechaEnsamblaje;
        private String numeroEnsamblaje;

        public AutomobileConcreteAssembler() {
        }

        @Override
        public IAutomobileAssembler color(String color) {  // Cambiado de "shade" a "color"
            this.color = color;
            return this;
        }

        @Override
        public IAutomobileAssembler chasis(String chasis) {
            this.chasis = chasis;
            return this;
        }

        @Override
        public IAutomobileAssembler motor(String motor) {
            this.motor = motor;
            return this;
        }

        @Override
        public IAutomobileAssembler tapiceria(String tapiceria) {  // Cambiado de "upholstery" a "tapicería"
            this.tapiceria = tapiceria;
            return this;
        }

        @Override
        public IAutomobileAssembler fechaEnsamblaje(String fechaEnsamblaje) {  // Cambiado de "assemblyDate" a "fechaEnsamblaje"
            this.fechaEnsamblaje = fechaEnsamblaje;
            return this;
        }

        @Override
        public IAutomobileAssembler numeroEnsamblaje(String numeroEnsamblaje) {  // Cambiado de "assemblyNumber" a "númeroEnsamblaje"
            this.numeroEnsamblaje = numeroEnsamblaje;
            return this;
        }

        @Override
        public AutomobileAssembler build() {
            return new AutomobileAssembler(
                    this.chasis,
                    this.motor,
                    this.tapiceria,
                    this.color,
                    this.fechaEnsamblaje,
                    this.numeroEnsamblaje);
        }
    }
}
