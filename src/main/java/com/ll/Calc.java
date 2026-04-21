package com.ll;

public class Calc {
    public static int run(String expression) {

        /** 괄호 처리 방법
         *  while 루프를 돌면서 가장 안쪽 괄호를 찾는다.
         *  괄호 안에 식을 run()으로 재귀적으로 계산한다.
         *  괄호를 결과로 교체한다.
         *  괄호가 없을 때까지 반복한다.
         *  그 다음 곱셈, 덧셈/뺄셈을 계산한다.
         */
        // Step 1: 괄호가 남아있으면 제거
        while (expression.contains("(")) {
            // 가장 안쪽 괄호 찾기
            int closeIdx = expression.indexOf(")");
            int openIdx = expression.lastIndexOf("(", closeIdx);

            // 괄호 안의 식 계산 (재귀)
            String inner = expression.substring(openIdx + 1, closeIdx);
            int result = run(inner);

            // 괄호를 결과로 교체
            String before = expression.substring(0, openIdx);
            String after = expression.substring(closeIdx + 1);
            expression = before + result + after;
        }

        // Step 2: 공백 기준으로 분할
        String[] Blank = expression.split(" ");

        // Step 3: 곱셈 먼저 계산
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

        // Step 4: 덧셈과 뺄셈 계산
        int result = Integer.parseInt(Blank2[0]);

        for (int i = 1; i < Blank2.length; i += 2) {
            String operator = Blank2[i];
            int num = Integer.parseInt(Blank2[i + 1]);

            if (operator.equals("+")) {
                result += num;
            } else if (operator.equals("-")) {
                result -= num;
            }
        }

        return result;
    }
}