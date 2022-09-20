package ch3;

import java.util.Scanner;

public class ForExSol {
    public static void main(String[] args) {
        // 문제 1 - 아래의 while 문을 for 문으로 변환하여 출력하세요.
        System.out.println("\n ----- 문제 1 -----\n");

        /*
        hit = 0;

        while(hit < 5) {
            //hit++;
            System.out.println("나무를 " + hit + "번 찍었습니다.");

            if(hit == 5) {
                System.out.println("나무가 넘어갑니다.");
            }

            hit++;
        }
        */

        for (int i = 1; i <= 5; i++) {
            System.out.println("나무를 " + i + "번 찍었습니다.");

            if(i == 5) {
                System.out.println("나무가 넘어갑니다.");
            }
        }

        System.out.println();

        // 문제 2 - 원하는 단수의 구구단을 출력하는 프로그램을 for 문을 사용하여 출력하세요.
        System.out.println("\n ----- 문제 2 -----\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("단수를 입력하세요 : ");
        int dan = scanner.nextInt();

        for (int i = 2; i < 10; i++) {
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }

        // 문제 3 - 사용자 입력을 통해서 데이터를 5개 입력받고 입력받은 값의 총합을 구하는 프로그램을 for 문을 사용하여
        // 작성하세요.
        System.out.println("\n ----- 문제 3 -----\n");
        int arr[] = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("num" + i + "번째 값을 입력하세요 : ");
            arr[i] = scanner.nextInt();
            total += arr[i];
            System.out.println();
        }
        System.out.println("총합 : " + total);

        // 문제 4 - for 문을 사용하여 아래의 모양과 동일한 모양이 출력되도록 프로그래밍을 하세요.
        System.out.println("\n ----- 문제 4 -----\n");

        /**
         *  *
         *  **
         *  ***
         *  ****
         *  *****
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 문제 5 - 구구단 전체를 출력하는 프로그램을 작성하세요.
        // 조건1) 2 ~ 9까지 숫자를 하나 입력받기
        // 조건2) 사용자 입력으로 입력 받은 단수에 break 와 continue 를 사용하는 구구단을 작성하세요.
        System.out.println("\n ----- 문제 5 -----\n");

        System.out.print("단수를 입력하세요 : ");
        int skipDan = scanner.nextInt();

        System.out.println("break 문 사용");
        for (int i = 2; i < 10; i++) {
            if(skipDan == i)
                break;

            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

        System.out.println();

        System.out.println("continue 사용");
        for (int i = 2; i < 10; i++) {
            if(skipDan == i)
                continue;

            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

        scanner.close();
    }
}
