package com.senai.br;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void testarSoma() {

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.somar(2, 2);

        assertEquals(4, resultado);

       
    }

    @Test 
    void testarMultiplicacao() {

        Calculadora calculadora = new Calculadora();

        int res = calculadora.mult(5, 2);

        assertEquals(10, res);

    }
}