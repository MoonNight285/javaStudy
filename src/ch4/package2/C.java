package ch4.package2;

// class A는 접근제한자를 default를 사용하고 있어서 다른 패키지에서 사용할 수 없음.
// import ch4.package1.A;

// class B는 접근제한자를 public로 사용하고 있어서 다른 패키지에서 사용할 수 있다.
//import ch4.package1.B;
//
//public class C {
//    // A a;
//    B b;
//}

import ch4.package1.A;

// 다른 패키지에서 있는 클래스 A를 사용하여 객체를 생성
//public class C {
//    // 클래스 A의 public을 사용한 생성자로 객체를 생성
//    // public을 사용하여 다른 패키지에서 사용해도 문제없다.
//    A a1 = new A(true);
//
//    // 클래스 A의 default를 사용한 생성자로 객체를 생성
//    // default는 동일한 패키지 내에서만 사용이 가능하다. 다른 패키지에서는 사용이 불가능하다.
//    // A a2 = new A(1);
//
//    // 클래스 A의 private를 사용한 생성자로 객체를 생성
//    // private은 해당 클래스 내에서만 사용이 가능하다.
//    // A a3 = new A("문자열");
//}

public class C {
    public C() {
        A a = new A();
        a.value1 = 1000;
        
        // 클래스 A의 value2는 default를 사용하여 다른 패키지에서 접근이 불가능
        // a.value2 = 2000;
        
        // 클래스 A의 value3는 private를 사용하여 클래스 외부에서 접근이 불가능
        // a.value3 = 3000;

        a.method1();

        // 클래스 A의 method2()는 default를 사용하여 다른 패키지에서 접근이 불가능하다.
        // a.method2();

        // 클래스 A의 method3()은 private를 사용하여 클래스 외부에서 접근이 불가능하다.
        // a.method3();
    }
}