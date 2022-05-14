package com.example;

public class Calculator {
    
    
    protected static CalculatorHelper helper;

    public int sum(int a, int b) {
        if(!helper.checkIfArgsArePositive(a, b)) {
            throw new RuntimeException("Arguments must be positive");
        }
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int mod(int a, int b) {
        return a % b;
    }

    public int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public int fact(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        return result;
    }

    public void setHelper(CalculatorHelper calculatorHelper) {
    }




}
