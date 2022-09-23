package ch4;

public class SingletonEx {
    // private => 접근 제한자 : private로 지정된 맴버는 해당 클래스 내에서만 사용이 가능함
    private static SingletonEx singletonEx = new SingletonEx();

    // 생성자의 접근제한자에 private를 사용하면 객체 생성시 new 키워드를 사용할 수 없음
    // 객체 생성이 불가능
    private SingletonEx() {

    }

    public static SingletonEx getInstance() {
        return singletonEx;
    }
}
