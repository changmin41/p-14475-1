package com.ll;

public class Calc {
    public static int run(String expression) {
        // 공백 기준으로 분할
        String[] Blank = expression.split(" ");

        // 첫 번째 숫자로 시작
        int result = Integer.parseInt(Blank[0]);

        // 인덱스 1부터: 연산자, 숫자, 연산자, 숫자...
        for (int i = 1; i < Blank.length; i += 2) {
            String operator = Blank[i];
            int num = Integer.parseInt(Blank[i + 1]);

            if (operator.equals("+")) {
                result += num;
            } else if (operator.equals("-")) {
                result -= num;
            } else if (operator.equals("*")) {
                result *= num;
            }
        }

        return result;
    }
}
