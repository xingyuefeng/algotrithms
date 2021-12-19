package com.company;

import java.util.*;


public class Calculate {
    public static void main(String str) {
        Stack<Character> ops = new Stack<Character>();
        Stack<Double> vals = new Stack<Double>();
        for (Integer i = 0; i < str.length(); i++) {
            char currentStr = str.charAt(i);
//           如果是符号放入符号栈
            if (currentStr == '+' || currentStr == '-' || currentStr == '/' || currentStr == '*')  {
                ops.push(currentStr);
            } else if (currentStr == '(' ) {

            } else if (currentStr == ')') {
                char op = ops.pop();
                double v = vals.pop();
                if (op == '+') {
                    v =  vals.pop() + v;
                } else if (op == '-') {
                    v =  vals.pop() - v;
                } else if (op == '/') {
                    v =  vals.pop() / v;
                } else if (op == '*') {
                    v =  vals.pop() * v;
                }
                vals.push(v);

            } else {
                // 值存值栈
                vals.push(Double.parseDouble(String.valueOf(currentStr)));
            }
        }
        System.out.print("Calculate------>" + vals.pop());
    }
}
