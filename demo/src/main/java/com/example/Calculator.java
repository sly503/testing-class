package com.example;

public class Calculator {
    
    public int sum(int a, int b) {
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

    public int fib(int a) {
        int result = 0;
        int prev = 0;
        int next = 1;
        for (int i = 0; i < a; i++) {
            result = prev + next;
            prev = next;
            next = result;
        }
        return result;
    }


    

}
