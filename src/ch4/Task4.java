package ch4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // 실습문제3 185p
        // 사각형을 표현하는 다음 Rect 클래스를 활용하여 Rect 객체 배열을 생성하고, 사용자로부터 4개의 사각형을
        // 입력받아 배열에 저장한 뒤, 배열을 검색하여 사각형 면적의 합을 출력하는 main() 메소드를 가진
        // RectArray 클래스를 작성하라.

        Scanner scanner = new Scanner(System.in);
        Rect rects[] = new Rect[4];

        for (int i = 0; i < rects.length; i++) {
            System.out.print((i + 1) + " 너비와 높이 >>");
            int width = scanner.nextInt();
            int height = scanner.nextInt();

            rects[i] = new Rect(width, height);
        }
        System.out.println("저장하였습니다...");

        int sum = 0;
        for (int i = 0; i < rects.length; i++) {
            sum += rects[i].getArea();
        }

        System.out.println("사각형의 전체 합은 : " + sum);
    }
}
