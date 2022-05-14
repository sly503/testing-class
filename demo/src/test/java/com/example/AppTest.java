package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */

public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Calculator calc = new Calculator();
        assertTrue( calc.sum(1, 2) == 3 );
    }

    @Test
    public void shouldAnswerWithFalse()
    {
        Calculator calc = new Calculator();
        assertFalse( calc.sum(1, 2) == 4 );
    }

    @Test
    public void shouldAnswerWithTrue2()
    {
        Calculator calc = new Calculator();
        assertTrue( calc.sub(1, 2) == -1 );
    }

    @Test
    public void shouldAnswerWithFalse2()
    {
        Calculator calc = new Calculator();
        assertFalse( calc.sub(1, 2) == 0 );
    }

    @Test
    public void shouldAnswerWithTrue3()
    {
        Calculator calc = new Calculator();
        assertTrue( calc.mul(1, 2) == 2 );
    }

    @Test
    public void shouldAnswerWithFalse3()
    {
        Calculator calc = new Calculator();
        assertFalse( calc.mul(1, 2) == 3 );
    }


    @Test
    public void shouldAnswerWithTrue4()
    {
        Calculator calc = new Calculator();
        assertTrue( calc.div(1, 2) == 0 );
    }

    @Test
    public void shouldAnswerWithFalse4()
    {
        Calculator calc = new Calculator();
        assertFalse( calc.div(1, 2) == 1 );
    }

    @Test
    public void shouldAnswerWithTrue5()
    {
        Calculator calc = new Calculator();
        assertTrue( calc.mod(1, 2) == 1 );
    }

    @Test
    public void shouldAnswerWithFalse5()
    {
        Calculator calc = new Calculator();
        assertFalse( calc.mod(1, 2) == 0 );
    }

    @Test
    public void shouldAnswerWithTrue6()
    {
        Calculator calc = new Calculator();
        assertTrue( calc.pow(1, 2) == 1 );
    }

    @Test
    public void shouldAnswerWithFalse6()
    {
        Calculator calc = new Calculator();
        assertFalse( calc.pow(1, 2) == 0 );
    }

    @Test
    public void shouldAnswerWithTrue7()
    {
        Calculator calc = new Calculator();
        assertTrue( calc.fact(1) == 1 );
    }

    @Test
    public void shouldAnswerWithFalse7()
    {
        Calculator calc = new Calculator();
        assertFalse( calc.fact(1) == 0 );
    }

    @Test
    public void shouldAnswerWithTrue8()
    {
        Calculator calc = new Calculator();
        assertTrue( calc.fib(1) == 1 );
    }

    @Test
    public void shouldAnswerWithFalse8()
    {
        Calculator calc = new Calculator();
        assertFalse( calc.fib(1) == 0 );
    }





}
