package com.ll;

public class Calc {
    public static int run(String expression) {
        // 공백 기준으로 분할
        String[] Blank = expression.split(" ");

        //곱셈 먼저 계산한다. 돌면서 곱셈을 먼저 찾는다
        String[] afterMulti = new String[Blank.length];
        int count = 0;

        for (int i = 0; i < Blank.length; i++) {
            if (i + 2 < Blank.length && Blank[i + 1].equals("*")) {

                int product = Integer.parseInt(Blank[i]) * Integer.parseInt(Blank[i + 2]);
                afterMulti[count++] = String.valueOf(product);
                i += 2;
            } else {
                afterMulti[count++] = Blank[i];
            }
        }
        String[] Blank2 = new String[count];
        System.arraycopy(afterMulti, 0, Blank2, 0, count);

        // 첫 번째 숫자로 시작
        int result = Integer.parseInt(Blank2[0]);

        // 연산자랑 합쳐서 계산하기
        for (int i = 1; i < Blank2.length; i += 2) {
            String operator = Blank2[i];
            int num = Integer.parseInt(Blank2[i + 1]);

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