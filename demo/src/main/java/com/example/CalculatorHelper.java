package com.example;

import java.util.stream.Stream;

public class CalculatorHelper {
    
    public Boolean checkIfArgsArePositive(int ... args){
        for (int arg : args) {
            if (arg < 0) {
                return false;
            }
        }
        return true;
    }

    public Boolean checkIfArgsArePositive(int arg1, int arg2){
        Stream<Integer> stream = Stream.of(arg1, arg2);
        return stream.allMatch(arg -> arg >= 0);
    }

}