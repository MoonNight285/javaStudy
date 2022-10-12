package ch6;

public class ImplC implements InterfaceC {
    @Override
    public void methodA() {
        System.out.println("구현 클래스C - 메서드A 실행");
    }

    @Override
    public void methodB() {
        System.out.println("구현 클래스C - 메서드B 실행");
    }

    @Override
    public void methodC() {
        System.out.println("구현 클래스C - 메서드C 실행");
    }
}
