package ch3;

import java.util.Scanner;

public class WhileEx {
    // while 문 : 가장 기본적인 반복문
    // while 문 실행 시 while 문 밖에 초기화 변수를 선언하고, while 안에서 초기화 변수의 카운트가 필요함.
    public static void main(String[] args) {
        System.out.println("----- while 문 -----\n");

        int hit = 0;

        while(hit < 10) {
            hit++;
            System.out.println("나무를 " + hit + "번 찍었습니다.");

            if(hit == 10) {
                System.out.println("나무가 넘어갑니다.");
            }
        }

        // while 문 사용시 주의점
        // 1. 초기화 변수의 카운트 부분의 위치에 따라 결과가 달라짐
        // 프로그래밍이 익숙하지 않을 경우 변수의 카운트 부분을 고정해서 사용하는것이 좋음
        // 2. while 문을 탈출할 수 있는 조건을 반드시 명시해야한다.
        // break 문을 사용하여 탈출
        
        System.out.println();
        hit = 0;

        while(hit < 5) {
            //hit++;
            System.out.println("나무를 " + hit + "번 찍었습니다.");

            if(hit == 5) {
                System.out.println("나무가 넘어갑니다.");
            }

            hit++;
        }

        // 책 예제
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int n = 0;
        double sum = 0.0;

        System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");

        // while 문의 조건식에 탈출 조건까지 함께 지정
        // 키보드 입력을 통한 데이터가 0이 아닐경우 아래의 while 문 실행, 0이면 while 문 종료
        while((n = scanner.nextInt()) != 0) {
            sum = sum + n;
            count++;
        }

        System.out.println("수의 개수는 " + count + "개이며, ");
        // 총합이 저장된 변수 sum 은 double 형
        // 입력된 데이터의 수가 저장된 변수 count 는 int 형
        // double 형과 int 형의 연산이 수행되면 자동 형변환이 발생하여 double 형으로 데이터가 만들어짐
        System.out.println("평균은 " + sum / count + "입니다.");

        // 다중 while 문 : 하나의 while 문 안에 또 다른 while 문이 있는 형태의 while 문을 뜻함
        System.out.println("----- 다중 while 문 ----- \n");

        int i = 0;
        int j = 0;

        while(i < 10) {
            while(j < 10) {
                System.out.println("i : " + i + "\tj : " + j);
                j++;
            }
            i++;
            j = 0;
        }
    }
}
