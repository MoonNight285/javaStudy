package ch2;

import java.util.Scanner;

// 7번 문제
// 학점이 A, B이면 Excellent 학점이 C, D이면 Good, 학점이 F이면 Bye 라고 출력하는 프로그램을 작성하라, switch 와 break 를 활용하라
public class IfSol_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학점을 입력하세요 : ");
        String grade = scanner.next();

        switch (grade) {
            case "A" :
            case "B":
                System.out.println("Excellent!");
                break;
            case "C":
            case "D":
                System.out.println("Good");
                break;
            case "F":
                System.out.println("Bye");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }

        scanner.close();
    }
}
