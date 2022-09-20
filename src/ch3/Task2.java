package ch3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // 실습문제1 125p
        // 영문 소문자를 하나 입력받고 그 문자보다 알파벳 순위가 낮은 모든 문자를 출력하는
        // 프로그램을 작성하라.

        Scanner scanner = new Scanner(System.in);
        System.out.print("알파벳 한 문자를 입력하세요 >>");
        String target = scanner.next();

        for (int i = 97; i <= target.charAt(0); i++) {
            for (int j = i; j <= target.charAt(0); j++) {
                System.out.print((char)(j));
            }
            System.out.println();
        }

        scanner.close();
    }
}
