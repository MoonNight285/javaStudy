package ch4;

import java.util.Scanner;

public class MethodExSol {
    private static Scanner scanner = new Scanner(System.in);

    public static void sum1() {
        int num1 = 10;
        int num2 = 20;
        int result = num1 + num2;
        System.out.println("sum1의 메소드 호출 => num1(10) + num2(20) : " + result);
    }

    public static void sum2(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("sum2의 메소드 호출 => num1(" + num1 + ")" + " + " + "num2(" + num2 + ") : " + result);
    }

    public static int sum3() {
        int num1 = 10;
        int num2 = 20;
        int result = num1 + num2;
        return result;
    }

    public static int sum4(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static void sub1() {
        int num1 = 10;
        int num2 = 20;
        int result = num1 - num2;
        System.out.println("sub1 메소드 호출 => num1(10) - num2(20) : " + result);
    }

    public static void sub2(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("sub2의 메소드 호출 => num1(" + num1 + ")" + " - " + "num2(" + num2 + ") : " + result);
    }

    public static int sub3() {
        int num1 = 10;
        int num2 = 20;
        int result = num1 - num2;
        return result;
    }

    public static int sub4(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public static void multi1() {
        int num1 = 10;
        int num2 = 20;
        int result = num1 * num2;
        System.out.println("multi1 메소드 호출 => num1(10) * num2(20) : " + result);
    }

    public static void multi2(int num1, int num2) {
        int result = num1 * num2;
        System.out.println("multi2의 메소드 호출 => num1(" + num1 + ")" + " * " + "num2(" + num2 + ") : " + result);
    }

    public static int multi3() {
        int num1 = 10;
        int num2 = 20;
        int result = num1 * num2;
        return result;
    }

    public static int multi4(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public static void div1() {
        int num1 = 10;
        int num2 = 20;
        int result = num1 / num2;
        System.out.println("div1 메소드 호출 => num1(10) / num2(20) : " + result);
    }

    public static void div2(int num1, int num2) {
        int result = num1 / num2;
        System.out.println("div2의 메소드 호출 => num1(" + num1 + ")" + " / " + "num2(" + num2 + ") : " + result);
    }

    public static int div3() {
        int num1 = 10;
        int num2 = 20;
        int result = num1 / num2;
        return result;
    }

    public static int div4(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }

    public static void gugudan(int targetDan) {
        for (int i = 2; i < 10; i++) {
            System.out.println(targetDan + " * " + i + " = " + (targetDan * i));
        }
    }

    public static void scores(String subjectName, int score) {
        if(score >= 90) {
            System.out.println(subjectName + "의 점수 등급은 A입니다.");
        }
        else if(score >= 80) {
            System.out.println(subjectName + "의 점수 등급은 B입니다.");
        }
        else if(score >= 70) {
            System.out.println(subjectName + "의 점수 등급은 C입니다.");
        }
        else if(score >= 60) {
            System.out.println(subjectName + "의 점수 등급은 D입니다.");
        }
        else {
            System.out.println(subjectName + "의 점수 등급은 F입니다.");
        }
    }

    public static void average(int[] subjectScores) {
        int total = 0;
        double avg = 0;

        for (int i = 0; i < subjectScores.length; i++) {
            total += subjectScores[i];
        }

        System.out.println("세 과목의 총점은 " + total + "입니다.");
        avg = (double)total / 3;
        String avgTemp = String.format("%.2f", avg);
        avg = Double.parseDouble(avgTemp);
        System.out.println("세 과목의 평균은 " + avg + "입니다.");
    }

    public static void main(String[] args) {
        // 문제1 - 사칙연산을 하기 위한 메서드를 메서드의 4가지 형태로 각각 생성하여
        // 실행하는 프로그램을 작성하세요.
        // 더하기, 빼기, 곱하기, 나누기를 각각 4가지 형태로 생성
        // 1번 타입(매개변수 x, 리턴타입 x)의 함수 이름 : sum1, sub1, multi1, div1
        // 2번 타입(매개변수 o, 리턴타입 x)의 함수 이름 : sum2, sub2, multi2, div2
        // 3번 타입(매개변수 x, 리턴타입 o)의 함수 이름 : sum3, sub3. multi3, div3
        // 4번 타입(매개변수 o, 리턴타입 o)의 함수 이름 : sum4, sub4, multi4, div4
        // 각각의 함수를 모두 실행하여 결과를 확인

        System.out.print("num1의 값을 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("num2의 값을 입력하세요 : ");
        int num2 = scanner.nextInt();

        sum1();
        sum2(num1, num2);
        int result = sum3();
        System.out.println("sum3의 메소드 호출 => num1(10) + num2(20) : " + result);
        result = sum4(num1, num2);
        System.out.println("sum4의 메소드 호출 => num1(" + num1 + ")" + " + " + "num2(" + num2 + ") : " + result);
        System.out.println();

        sub1();
        sub2(num1, num2);
        result = sub3();
        System.out.println("sub3의 메소드 호출 => num1(10) - num2(20) : " + result);
        result = sub4(num1, num2);
        System.out.println("sub4의 메소드 호출 => num1(" + num1 + ")" + " - " + "num2(" + num2 + ") : " + result);
        System.out.println();

        multi1();
        multi2(num1, num2);
        result = multi3();
        System.out.println("multi3의 메소드 호출 => num1(10) * num2(20) : " + result);
        result = multi4(num1, num2);
        System.out.println("multi4의 메소드 호출 => num1(" + num1 + ")" + " * " + "num2(" + num2 + ") : " + result);
        System.out.println();

        div1();
        div2(num1, num2);
        result = div3();
        System.out.println("div3의 메소드 호출 => num1(10) / num2(20) : " + result);
        result = div4(num1, num2);
        System.out.println("div4의 메소드 호출 => num1(" + num1 + ")" + " / " + "num2(" + num2 + ") : " + result);
        System.out.println();

        // 문제2 - 사용자 입력을 통해서 2 ~ 9까지의 숫자를 입력받아 해당하는 단수의
        // 구구단을 출력하는 프로그램을 작성하세요.
        // 구구단을 출력하는 부분을 함수로 구현(함수명 : gugudan)
        // 사용자 입력 부분은 함수로 구현해도 되고 안해도 된다.

        System.out.print("출력할 구구단의 단을 입력하세요 : ");
        int dan = scanner.nextInt();
        gugudan(dan);

        System.out.println();

        // 문제3 - 사용자 입력을 통해서 국어, 영어, 수학의 점수를 3개를 입력받고
        // 총점과 평균, 등급을 출력하는 프로그램을 작성하세요.
        // 등급 계산 부분을 함수로 구현 (함수명 : scores)
        // 총점과 평균 계산 부분을 함수로 구현 (함수명 : average)
        // 사용자 입력 부분은 함수로 구현해도 되고 안해도 된다.

        System.out.println("국어, 영어, 수학의 점수를 순서대로 입력하세요");
        String[] subjectNames = new String[] {"국어", "영어", "수학"};
        int[] subjectScores = new int[3];

        for(int i = 0; i < subjectNames.length; ++i) {
            System.out.println(subjectNames[i] + "의 점수를 입력하세요");
            subjectScores[i] = scanner.nextInt();
        }

        for(int i = 0; i < subjectNames.length; ++i) {
            scores(subjectNames[i], subjectScores[i]);
        }

        average(subjectScores);

        scanner.close();
    }
}
