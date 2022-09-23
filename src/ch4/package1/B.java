package ch4.package1;

// 접근제한자 public 사용중
//public class B {
//    // A a;
//}

// 클래스 A를 사용하여 객체를 생성
//public class B {
//    // 클래스 A의 생성자 중 public을 사용한 생성자로 객체 생성
//    A a1 = new A(true);
//
//    // 클래스 A의 생성자 중에 defalut를 사용한 생성자로 객체를 생성
//    // default는 동일한 패키지 내에서는 사용 제한이 없다.
//    A a2 = new A(1);
//
//    // 클래스 A의 생성자 중에 private를 사용한 생성자로 객체 생성을 시도하여 오류가 발생
//    // private은 해당 클래스 내에서만 사용이 가능하다.
//    // A a3 = new A("문자열");
//}

public class B {
    public B() {
        A a = new A();
        // value1은 public로 설정되어 모두 접근이 가능
        a.value1 = 10;
        
        // value2는 defalut로 설정되어 동일한 패키지에서만 접근이 가능하다.
        a.value2 = 20;
        
        // value3은 private로 설정되어 외부에서는 접근이 불가
        // a.value3 = 30;

        a.method1();
        a.method2();
        
        // method3() 은 private로 설정되어 외부에서 접근이 불가능
        // a.method3();
    }
}