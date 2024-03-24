package org.example.calculator;

import org.example.calculator.ArithmeticOperator;

public class Calculator {
    public static int calculate(int operand1, String operator, int operand2) {
        return ArithmeticOperator.calculate(operand1, operator, operand2);
    }
}
