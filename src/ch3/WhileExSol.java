package ch3;

import java.util.Scanner;

public class WhileExSol {
    public static void main(String[] args) {
        // 문제 1 - while 문을 사용하여 1 ~ 10 까지 화면에 출력하는 프로그램을 작성하세요.
        int count = 1;

        while(count <= 10) {
            System.out.println("숫자 : " + count);
            count++;
        }

        System.out.println();

        // 문제 2 - while 문을 사용하여 1 ~ 10 까지의 총합을 구하는 프로그램을 작성하세요.
        int count2 = 1;
        int total = 0;

        while(count2 <= 10) {
            total += count2;
            count2++;
        }

        System.out.println("1 ~ 10 까지의 총합 : " + total);

        System.out.println();

        // 문제 3 - while 문을 사용해서 지정한 구구단을 출력하세요.
        Scanner scanner = new Scanner(System.in);
        System.out.print("출력을 원하는 단을 입력하세요 : ");
        int target = scanner.nextInt();
        int count3 = 1;

        while(count3 < 10) {
            System.out.println(target + " * " + count3 + " = " + (target * count3));
            count3++;
        }
        scanner.close();

        System.out.println();
        System.out.println("----- 문제4 -----\n");

        // 문제 4 - while 문을 사용하여 2 ~ 9단까지 구구단을 모두 출력하는 프로그램을 작성하라.
        // 다중 while 문을 사용

        int x = 2;

        while(x < 10) {
            int y = 1;
            while(y < 10) {
                System.out.println(x + " * " + y + " = " + (x * y));
                y++;
            }
            System.out.println();
            x++;
        }
    }
}
