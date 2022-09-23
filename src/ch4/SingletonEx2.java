package ch4;

public class SingletonEx2 {
    public static void main(String[] args) {
        // SingletonEx singletonEx1 = new SingletonEx();
        // SingletonEx singletonEx2 = new SingletonEx();

        // 싱글톤 디자인 패턴 방식을 사용하여 객체를 생성
        SingletonEx singletonEx1 = SingletonEx.getInstance();
        SingletonEx singletonEx2 = SingletonEx.getInstance();

        System.out.println(singletonEx1);
        System.out.println(singletonEx2);
        if(singletonEx1 == singletonEx2) {
            System.out.println("두 객체가 같다");
        }
        else {
            System.out.println("두 객체가 다르다.");
        }
    }
}
