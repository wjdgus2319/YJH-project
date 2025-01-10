package com.example.calculator.calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        calculator2 calculator = new calculator2();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            try {
                int result = calculator.calculate(num1, num2, operator);
                System.out.println("결과: " + result);
            } catch (Exception e) {
                System.out.println("오류: " + e.getMessage());
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            if (sc.next().equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("가장 먼저 저장된 결과를 삭제하시겠습니까? (yes 입력 시 삭제): ");
            if (sc.next().equalsIgnoreCase("yes")) {
                calculator.removeFirstResult();
            }
        }

        // 연산 결과 출력
        System.out.println("모든 연산 결과: " + calculator.getResults());
    }
}
