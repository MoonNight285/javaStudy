package ch4.package1;

// 접근제한자가 default 사용중
// 접근제한자 표시가 없으면 default 접근제한자를 사용함
// default 접근제한자는 동일한 패키지 내에서는 사용 가능, 그러나 다른 패키지에서는 사용 불가
//class A {
//    // B b = new B();
//
//    public A(boolean b) {
//
//    }
//
//    A(int b) {
//
//    }
//
//    private A(String s) {
//
//    }
//}

// 생성자 접근 제한
//public class A {
//    // 맴버변수
//    // 클래스의 객체를 생성하기 위해서 생성자를 호출
//    // 접근제한자가 public인 생성자를 사용하여 객체를 생성
//    A a1 = new A(true);
//
//    // 접근제한자가 default인 생성자를 사용하여 객체를 생성
//    A a2 = new A(1);
//
//    // 접근제한자가 private인 생성자를 사용하여 객체를 생성
//    A a3 = new A("문자열");
//
//    // 생성자
//    // 접근제한자가 public인 생성자
//    public A(boolean b) {
//
//    }
//
//    // 접근제한자가 default인 생성자
//    A(int b) {
//
//    }
//
//    // 접근제한자가 private인 생성자
//    private A(String s) {
//
//    }
//}

// 맴버 변수와 메서드의 접근제한자
public class A {
    // public을 사용하여 외부에서 모두 접근 가능
    public int value1;

    // default를 사용하여 동일한 패키지 내에서만 접근이 가능
    int value2;

    // private를 사용하여 해당 클래스 내에서만 사용가능
    private int value3;

    public A() {
        // 생성자는 해당 클래스 내에서만 동작
        // 접근제한자에 상관없이 모든 맴버 변수에 접근이 가능
        value1 = 1;
        value2 = 1;
        value3 = 1;
    }

    public void method1() {

    }

    void method2() {

    }

    private void method3() {
        
    }
}