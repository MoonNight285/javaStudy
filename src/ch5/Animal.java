package ch5;

// 추상 클래스 : 추상 메서드를 1개 이상 가지고 있는 클래스 추상 클래스라고 한다.
// 추상 클래스는 객체를 생성할 수 없음
// 반드시 자식 클래스가 추상 클래스를 상속 받았을 경우 반드시 추상 메서드를 오버라이딩 해야한다.
// 만약 오버라이딩 하지않을경우 자식 클래스도 추상클래스로 선언해야 함
// 추상 클래스는 자식 클래스를 규격화하기 위해 사용함
public abstract class Animal {
    public String kind;

    public Animal(String kind) {
        this.kind = kind;
    }

    public void breathe() {
        System.out.println(this.kind + "가 숨을 쉽니다.");
    }

    public abstract void sound();
}
