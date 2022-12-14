package ch3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // 실습문제6 - 127p
        // 다음과 같이 영어와 한글의 짝을 이루는 2개의 배열을 만들고, 사용자로부터 영어 단어를
        // 입력 받아 한글을 출력하는 프로그램을 작성하라. "exit"을 입력하면 프로그램을 종료하라.

        Scanner scanner = new Scanner(System.in);
        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};

        while(true) {
            System.out.print("영어 단어를 입력하세요>>");
            String target = scanner.next();

            if (target.equals("exit") == true) {
                System.out.println("종료합니다...");
                break;
            }

            boolean flag = false;
            for (int i = 0; i < eng.length; i++) {
                if (eng[i].equals(target) == true) {
                    System.out.println(kor[i]);
                    flag = true;
                    break;
                }
            }

            if(flag == false) {
                System.out.println("그런 영어 단어가 없습니다.");
            }
        }

        scanner.close();
    }
}
