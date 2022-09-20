package ch3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // 실습문제2 - 126p
        // 정수를 10개 입력받아 배열에 저장한 후, 배열을 검색하여 3의 배수만 골라
        // 출력하는 프로그램을 작성하라.

        int arr[] = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 10개 입력 >>");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        scanner.close();
    }
}
