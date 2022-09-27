package ch5;

public class ExtendExSol {
    public static void main(String[] args) {
        // 문제1 - 클래스 SumSub와 MultiDiv를 생성하고, SumSub에는 맴버 변수 num1, num2를 가지고 맴버 메서드
        // sum(), sub()를 가지도록하며, MultiDiv에는 맴버변수 result, 맴버 메서드 multi(), div()를 가지도록 하고,
        // 마지막으로 Calculator 클래스를 생성하여 두 개의 클래스 모두 상속받아 모든 기능을 사용할 수 있는 클래스로 작성하고,
        // 각각 사칙연산을 수행하세요.
        // 1. SumSub > MultiDiv > Calculator 순서대로 상속받기
        // 2. Calculator클래스는 나머지 연산을 위한 맴버 메서드 other() 생성
        Calculator calculator = new Calculator();
        calculator.setNumbers(60, 20);
        System.out.println("합 : " + calculator.sum());
        System.out.println("곱 : " + calculator.multi());
        System.out.println("차 : " + calculator.sub());
        System.out.println("몫 : " + calculator.div());
        System.out.println("나머지 : " + calculator.other());

        System.out.println();
    }
}
