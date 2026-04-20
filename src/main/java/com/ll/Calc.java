package com.ll;

public class Calc {
    public static int run(String expression) {

        String[] expressionBits = expression.split(" \\+ ");
        // 뺄셈 처리
        if (expression.contains("-")) {
            String[] bits = expression.split(" - ");
            return Integer.parseInt(bits[0]) - Integer.parseInt(bits[1]);
        }

            int num1 = Integer.parseInt(expressionBits[0]);
        int num2 = Integer.parseInt(expressionBits[1]);

        return num1 + num2;
    }

}
