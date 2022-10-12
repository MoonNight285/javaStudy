package ch6;

public interface RemoteControl {
    // 인터페이스의 맴버는 상수, 정적 맴버 메서드, 추상 메서드, 디폴트 메서드만 사용이 가능함
    // 인터페이스에서 사용할 수 있는 맴버는 일반 맴버 변수와 메서드는 불가능하기 때문에
    // static 및 abstract 를 생략할 수 있다.
    // 인터페이스는 객체 사용 설명서이기 때문에 상수, 정적 맴버 메서드, 추상 메서드, 디폴트 메서드만 사용 가능함
    // 정적 메서드 및 디폴트 메서드는 자바 버전 8부터 사용이 가능하다.
    // 상수
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;
    
    // 추상 메서드(abstract 생략됨)
    void turnOn();
    void turnOff();
    void setVolume(int volume);
    
    // 디폴트 메서드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }
    
    // 정적 메서드
    static void changeBattery() {
        System.out.println("건전지를 교환합니다.");
    }
}
