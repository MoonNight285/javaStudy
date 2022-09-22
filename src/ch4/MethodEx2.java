package ch4;

// 실행용 클래스
public class MethodEx2 {
    public static void inCall() {
        System.out.println("MethodEx2 클래스의 맴버 메서드");
    }

    public static void main(String[] args) {
        // 메서드 호출하기
        // 1. 클래스 내부 호출
        // 동일한 클래스의 맴버끼리 호출하는 것
        inCall();

        // 2. 클래스 외부 호출
        // 다른 클래스의 객체를 생성하고 해당 객체의 맴버를 호출
        
        // Car2 클래스 타입의 변수 avante를 선언
        // new => 메모리 공간에 생성자를 통해 생성된 객체를 등록, 등록된 메모리 주소를 반환
        // 생성자 : 지정한 클래스를 기반으로 객체를 생성
        Car2 avante = new Car2(); // Car2 클래스 객체가 생성되고 클래스 타입의 변수 대입되어 사용 준비가 완료 됨
        
        // 클래스 외부 호출, 객체의 맴버 호출
        avante.name = "아반떼";
        avante.run();
        avante.stop();
        avante.sound();

        // Car2 클래스 타입의 객체 생성
        Car2 sonata = new Car2();
        sonata.name = "소나타";
        sonata.run();
        sonata.stop();
        sonata.sound();

        Car3 car = new Car3();
        car.info();
    }
}
