package com.ll;

public class Calc {
    public static int run(String expression) {

        // 덧셈 처리
        if (expression.contains("+")) {
            int sum = 0;
            String[] bits = expression.split(" \\+ ");
            for(int i=0; i< bits.length;i++){
              sum += Integer.parseInt(bits[i]);
           }return sum;
        }

        // 뺄셈 처리
        if (expression.contains("-")) {
            String[] bits = expression.split(" - ");
            return Integer.parseInt(bits[0]) - Integer.parseInt(bits[1]);
        }


    return 0;
    }

}
