package com.calculadora.controller;

import com.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    private final CalculadoraService calculadoraService;

    @Autowired
    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @GetMapping("/sumar")
    public int sumar(@RequestParam int a, @RequestParam int b) {
        return calculadoraService.sumar(a, b);
    }

    @GetMapping("/restar")
    public int restar(@RequestParam int a, @RequestParam int b) {
        return calculadoraService.restar(a, b);
    }
}
