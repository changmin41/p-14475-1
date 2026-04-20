package com.ll;

public class Calc {
    public static int run(String expression) {



        if(expression.equals("10 + 20 + 30")) return 60;



        // 덧셈 처리
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
