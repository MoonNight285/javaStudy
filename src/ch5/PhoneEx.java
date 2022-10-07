package ch5;

public class PhoneEx {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

        // Phone 클래스는 추상 클래스이기때문에 new 키워드를 통해 객체를 생성할수 없다.
        // Phone phone = new Phone("홍길동");

        // 클래스 타입의 변수 생성까지는 유효하다.
        Phone phone;
    }
}
