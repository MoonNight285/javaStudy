package ch2;

import java.util.Scanner;

// 6번 문제 88페이지
// 돈의 액수를 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 10원짜리 동전, 1원짜리 동전 각 몇개로 변환되는지 출력하라.
public class IfSol_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("돈의 액수를 입력하세요 : ");
        int money = scanner.nextInt();

        int moneyCount50000 = 0;
        int moneyCount10000 = 0;
        int moneyCount1000 = 0;
        int moneyCount500 = 0;
        int moneyCount100 = 0;
        int moneyCount10 = 0;
        int moneyCount1 = 0;

        if(money >= 50000) {
            moneyCount50000 = money / 50000;
            money -= 50000 * moneyCount50000;
        }

        if(money >= 10000) {
            moneyCount10000 = money / 10000;
            money -= 10000 * moneyCount10000;
        }

        if(money >= 1000) {
            moneyCount1000 = money / 1000;
            money -= 1000 * moneyCount1000;
        }

        if(money >= 500) {
            moneyCount500 = money / 500;
            money -= 500 * moneyCount500;
        }

        if(money >= 100) {
            moneyCount100 = money / 100;
            money -= 100 * moneyCount100;
        }

        if(money >= 10) {
            moneyCount10 = money / 10;
            money -= 10 * moneyCount10;
        }

        if(money >= 1){
            moneyCount1 = money / 1;
            money -= 1 * moneyCount1;
        }

        System.out.println("오만원 " + moneyCount50000 + "개, " + "만원 " + moneyCount10000 + "개, " +
                "천원 " + moneyCount1000 + "개, " + "500원 " + moneyCount500 + "개, " +
                "100원 " + moneyCount100 + "개, " + "10원 " + moneyCount10 + "개, " + "1원 " + moneyCount1 + "개");

        scanner.close();
    }
}
