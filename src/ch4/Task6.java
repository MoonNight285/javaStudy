package ch4;

public class Task6 {
    public static void main(String[] args) {
        // 문제1 - 사칙연산을 할 수 있는 클래스 Calculator를 생성하고 정수 2개 입력받아 계산하는 프로그램을 작성하세요.
        // 맴버 변수 : int num1, num2, result
        // 맴버 메서드 : sum, sub, multi, div
        // 모든 결과는 int 데이터 타입으로 사용, 메서드의 4가지의 형태 중 아무거나 사용
        int num1 = 40;
        int num2 = 20;

        System.out.println("num1 과 num2의 합 : " + Calculator.sum(num1, num2));
        System.out.println("num1 과 num2의 차 : " + Calculator.sub(num1, num2));
        System.out.println("num1 과 num2의 곱 : " + Calculator.multi(num1, num2));
        System.out.println("num1 과 num2의 몫 : " + Calculator.div(num1, num2));
        System.out.println();

        // 문제2 - 1 ~ 45까지의 임의의 숫자 6개를 생성하여 그 결과를 출력하는 프로그램을 작성하세요.
        // 배열을 사용하여 랜덤으로 생성된 데이터를 저장
        int[] result1 = Lotto.createLotto();
        System.out.println("중복포함 랜덤 숫자 6개 생성");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();
        System.out.println();

        // 문제3 - 문제2에서 여러번 실행 시 배열에 저장되는 숫자가 중복되는 상황이 발생됨, 중복되는
        // 숫자를 제외하고 총 6개의 숫자를 저장하고 출력하는 프로그램을 작성하세요.
        int[] result2 = Lotto.createDistinctLotto();
        System.out.println("중복제거 랜덤 숫자 6개 생성");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }
        System.out.println();

    }
}
