package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Unit test for simple App.
 */

@ExtendWith(MockitoExtension.class)
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        Calculator calc = new Calculator();
        assertTrue(calc.sum(1, 2) == 3);
    }

    @Test
    public void shouldAnswerWithFalse() {
        Calculator calc = new Calculator();
        assertFalse(calc.sum(1, 2) == 4);
    }

    @Test
    public void shouldAnswerWithTrue2() {
        Calculator calc = new Calculator();
        assertTrue(calc.sub(1, 2) == -1);
    }

    @Test
    public void shouldAnswerWithFalse2() {
        Calculator calc = new Calculator();
        assertFalse(calc.sub(1, 2) == 0);
    }

    @Test
    public void shouldAnswerWithTrue3() {
        Calculator calc = new Calculator();
        assertTrue(calc.mul(1, 2) == 2);
    }

    @Test
    public void shouldAnswerWithFalse3() {
        Calculator calc = new Calculator();
        assertFalse(calc.mul(1, 2) == 3);
    }

    @Test
    public void shouldAnswerWithTrue4() {
        Calculator calc = new Calculator();
        assertTrue(calc.div(1, 2) == 0);
    }

    @Test
    public void shouldAnswerWithFalse4() {
        Calculator calc = new Calculator();
        assertFalse(calc.div(1, 2) == 1);
    }

    @Test
    public void shouldAnswerWithTrue5() {
        Calculator calc = new Calculator();
        assertTrue(calc.mod(1, 2) == 1);
    }

    @Test
    public void shouldAnswerWithFalse5() {
        Calculator calc = new Calculator();
        assertFalse(calc.mod(1, 2) == 0);
    }

    @Test
    public void shouldAnswerWithTrue6() {
        Calculator calc = new Calculator();
        assertTrue(calc.pow(1, 2) == 1);
    }

    @Test
    public void shouldAnswerWithFalse6() {
        Calculator calc = new Calculator();
        assertFalse(calc.pow(1, 2) == 0);
    }

    @Test
    public void shouldAnswerWithTrue7() {
        Calculator calc = new Calculator();
        assertTrue(calc.fact(1) == 1);
    }

    @Test
    public void shouldAnswerWithFalse7() {
        Calculator calc = new Calculator();
        assertFalse(calc.fact(1) == 0);
    }


    @Test
    public void test_one_plus_one(@Mock CalculatorHelper calculatorHelper){
        when (calculatorHelper.checkIfArgsArePositive(1, 1)).thenReturn(true);
        Calculator calc = new Calculator();
        calc.setHelper(calculatorHelper);
        assertTrue(calc.sum(1, 1) == 2);
        
        
    }

}
