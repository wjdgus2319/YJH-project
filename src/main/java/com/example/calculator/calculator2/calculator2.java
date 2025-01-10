package com.example.calculator.calculator2;

import java.util.ArrayList;
import java.util.List;

public class calculator2 {
    private List<Integer> results; // 연산 결과를 저장하는 필드

    public calculator2() {
        results = new ArrayList<>();
    }

    public int calculate(int num1, int num2, char operator) {
        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
        results.add(result); // 연산 결과를 리스트에 추가
        return result;
    }

    public List<Integer> getResults() {
        return new ArrayList<>(results); // 결과 리스트를 반환
    }

    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0); // 가장 먼저 저장된 결과를 삭제
        }
    }
}



