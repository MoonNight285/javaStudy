package ch5.package2;

import ch5.package1.A;

public class C {

    public void method() {
        // A 클래스는 접근제한자가 public로 설정되어 A클래스 타입의 변수는 생성할 수 없음
        // A a = new A(); // A 클래스의 생성자에 접근제한자가 protected로 설정되어 생성자가 접근할 수 없음
        // a.value = "value"; // A 클래스의 맴버 변수에 접근제한자가 protected로 설정되어 맴버변수에 접근 할 수 없음
        // a.method(); // A 클래스의 맴버 메서드에 접근제한자가 protected로 설정되어 맴버 메서드에 접근 할 수 없음
    }
}
