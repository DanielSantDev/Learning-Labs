package br.com.danielsantdev.lambdas;

import java.util.function.IntBinaryOperator;


public class IntBinaryOperatorClass implements IntBinaryOperator {
    @Override
    public int applyAsInt(int a, int b) {
        return a + b;
    }
}
