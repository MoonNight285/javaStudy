package ch2;

import java.util.Scanner;

// 9번 문제
// 369 게임의 임무를 작성해보자. 1 ~ 99까지의 정수를 입력받고 수에 3,6,9 중 하나가 있는 경우는 "박수짝", 두 개 있는 경우에는 "박수짝짝"
// 하나도 없으면 "짝수없음" 을 출력하는 프로그램을 작성하라. 예를 들면 13인 경우 "박수짝", 36인 경우 "박수짝짝", 5인경우 "박수없음"을 출력하면 된다.
public class IfSol_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 ~ 99까지중 정수 하나를 입력하세요 : ");
        int target = scanner.nextInt();

        if(target >= 10) {
            int afterNumber = target / 10;
            int beforeNumber = target % 10;

            if((afterNumber % 3 == 0) && (beforeNumber % 3 == 0)) {
                System.out.println("박수짝짝");
            }
            else if ((afterNumber % 3 == 0) || (beforeNumber % 3 == 0)) {
                System.out.println("박수짝");
            }
            else {
                System.out.println("박수없음");
            }
        }
        else {
            if(target % 3 == 0) {
                System.out.println("박수짝짝");
            }
            else {
                System.out.println("박수없음");
            }
        }

        scanner.close();
    }
}
