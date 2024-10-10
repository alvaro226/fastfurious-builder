package com.design.patterns.fastfurious.builder.domain.builder;

public class ConstructorManager {

    public void assembleToyota(IAutomobileAssembler assembler) {
        assembler
                .chasis("Toyota")
                .motor("V8")
                .tapiceria("Cuero")  // Cambiado de "upholstery" a "tapicería"
                .color("Rojo")  // Cambiado de "shade" a "color"
                .fechaEnsamblaje("2021-01-01")  // Cambiado de "assemblyDate" a "fechaEnsamblaje"
                .numeroEnsamblaje("123456");  // Cambiado de "assemblyNumber" a "númeroEnsamblaje"
    }

    public void assembleMazda(IAutomobileAssembler assembler) {
        assembler
                .chasis("Mazda")
                .motor("V6")
                .tapiceria("Tela")  // Cambiado de "upholstery" a "tapicería"
                .color("Azul")  // Cambiado de "shade" a "color"
                .fechaEnsamblaje("2021-01-02")  // Cambiado de "assemblyDate" a "fechaEnsamblaje"
                .numeroEnsamblaje("654321");  // Cambiado de "assemblyNumber" a "númeroEnsamblaje"
    }

    public void assembleFord(IAutomobileAssembler assembler) {
        assembler
                .chasis("Ford")
                .motor("V4")
                .tapiceria("Cuero")  // Cambiado de "upholstery" a "tapicería"
                .color("Negro")  // Cambiado de "shade" a "color"
                .fechaEnsamblaje("2021-01-03")  // Cambiado de "assemblyDate" a "fechaEnsamblaje"
                .numeroEnsamblaje("456123");  // Cambiado de "assemblyNumber" a "númeroEnsamblaje"
    }
}
