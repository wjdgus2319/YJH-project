package com.example.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false; // 반복 종료 여부를 결정하는 변수

        while (!exit) {
            try {
                // 첫 번째 정수 입력
                System.out.print("첫 번째 양의 정수를 입력하세요 (0 포함): ");
                int num1 = scanner.nextInt();

                // 두 번째 정수 입력
                System.out.print("두 번째 양의 정수를 입력하세요 (0 포함): ");
                int num2 = scanner.nextInt();

                // 사칙연산 기호 입력
                System.out.print("사칙연산 기호(+, -, *, /)를 입력하세요: ");
                char operator = scanner.next().charAt(0);

                // 계산 수행
                int result = 0;
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
                            System.out.println("나눗셈 연산에서 분모(두 번째 정수)가 0일 수 없습니다.");
                            continue; // 다음 반복으로 넘어감
                        }
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("잘못된 연산 기호입니다. 다시 입력하세요.");
                        continue; // 다음 반복으로 넘어감
                }

                // 결과 출력
                System.out.println("결과: " + result);

                // 종료 여부 확인
                System.out.print("계속하려면 아무 키나 입력하고, 종료하려면 'exit'을 입력하세요: ");
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    exit = true; // 종료 조건 설정
                }
            } catch (Exception e) {
                System.out.println("입력이 잘못되었습니다. 다시 시도하세요.");
                scanner.nextLine(); // 버퍼 비우기
            }
        }

        System.out.println("프로그램을 종료합니다.");
        scanner.close(); // Scanner 닫기
    }
}
