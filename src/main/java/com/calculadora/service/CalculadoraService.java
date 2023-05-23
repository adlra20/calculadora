package com.calculadora.service;

import io.corp.calculator.TracerAPI;
import io.corp.calculator.TracerImpl;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public int sumar(int a, int b) {
        int resultado = a + b;
        // Invocar API de traceo de operaciones para registrar el resultado
        TracerImpl tracerAPI = new TracerImpl();
        tracerAPI.trace(resultado);
        return resultado;
    }

    public int restar(int a, int b) {
        int resultado = a - b;
        // Invocar API de traceo de operaciones para registrar el resultado
        TracerImpl tracerAPI = new TracerImpl();
        tracerAPI.trace(resultado);
        return resultado;
    }
}
