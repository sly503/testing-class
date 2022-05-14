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



}
