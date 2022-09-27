package ch5.package2;

import ch5.package1.A;

public class D extends A {
    public D() {
        // A 클래스를 상속하여 사용
        // 부모 클래스 A의 생성자 호출
        super();

        // 부모 클래스 A가 상속해준 맴버 변수를 사용
        this.value = "value";
        // 부모 클래스 A가 상속해준 맴버 메서드를 사용
        this.method();
    }

    public void method2() {
        // A 클래스와 사용관계로 동작함
        // A a = new A();
        // a.value = "value";
        // a.method();
    }
}
