package com.design.patterns.fastfurious.builder.domain.builder;

public interface IAutomobileAssembler {
    IAutomobileAssembler color(String color);  // Cambiado de "shade" a "color"

    IAutomobileAssembler fechaEnsamblaje(String fechaEnsamblaje);  // Cambiado de "assemblyDate" a "fechaEnsamblaje"

    IAutomobileAssembler numeroEnsamblaje(String numeroEnsamblaje);  // Cambiado de "assemblyNumber" a "númeroEnsamblaje"

    IAutomobileAssembler chasis(String chasis);

    IAutomobileAssembler motor(String motor);

    IAutomobileAssembler tapiceria(String tapiceria);  // Cambiado de "upholstery" a "tapicería"

    AutomobileAssembler build();
}
