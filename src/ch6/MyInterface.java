package ch6;

public interface MyInterface {
    public void method1();

    default void method2() {
        System.out.println("dMyInterface의 method2() 실행");
    }
}
