package com.design.patterns.fastfurious.builder.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.design.patterns.fastfurious.builder.domain.builder.ConstructorManager;
import com.design.patterns.fastfurious.builder.domain.builder.IAutomobileAssembler;
import com.design.patterns.fastfurious.builder.domain.builder.AutomobileAssembler;

@RestController
@RequestMapping("/")
public class AutoControllerManager {

    @GetMapping("list/")
    public List<AutomobileAssembler> getAutomobiles() {
        ConstructorManager manager = new ConstructorManager();
        IAutomobileAssembler assembler = new AutomobileAssembler.AutomobileConcreteAssembler();
        List<AutomobileAssembler> automobiles = new ArrayList<>();

        manager.assembleToyota(assembler);

        AutomobileAssembler autoA = assembler.color("Rojo")  
                .motor("Version 2.0")
                .chasis("Toyota")
                .tapiceria("Cuero")  
                .fechaEnsamblaje("1999-01-01")  
                .numeroEnsamblaje("12345456")  
                .build();
        automobiles.add(autoA);

        manager.assembleMazda(assembler);

        AutomobileAssembler autoB = assembler.color("Negro")  
                .motor("Version 1.6")
                .chasis("Mazda")
                .tapiceria("Cuero")  
                .fechaEnsamblaje("2015-01-02")  
                .numeroEnsamblaje("43654321")  
                .build();
        automobiles.add(autoB);

        manager.assembleFord(assembler);

        AutomobileAssembler autoC = assembler.color("Blanco")  
                .motor("Version 2.7")
                .chasis("Ford")
                .tapiceria("Cuero") 
                .fechaEnsamblaje("2000-01-03")  
                .numeroEnsamblaje("98456123") 
                .build();

        automobiles.add(autoC);

        return automobiles;
    }
}
