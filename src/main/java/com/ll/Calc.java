package com.ll;

public class Calc {
    public static int run(String expression) {

        if (expression.contains("+")) {
            String[] bits = expression.split(" \\+ ");
            return Integer.parseInt(bits[0]) + Integer.parseInt(bits[1]);
        }

        // 뺄셈 처리
        if (expression.contains("-")) {
            String[] bits = expression.split(" - ");
            return Integer.parseInt(bits[0]) - Integer.parseInt(bits[1]);
        }

    return 0;
    }

}
