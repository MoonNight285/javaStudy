package ch4;

public class Main {
    public static void main(String[] args) {
        // Circle 클래스 타입의 변수 pizza 생성
        Circle pizza;
        // Circle 클래스 타입의 변수 pizza 에 Circle 클래스 객체의 주소를 저장
        // new : 힙 메모리 영역에 지정한 클래스의 객체 메모리 공간을 할당
        // Circle() : Circle 클래스 타입의 객체를 생성
        pizza = new Circle();

        // Circle 클래스는 설계도이기 때문에 혼자서는 어떠한 행동도 할 수 없음
        // 객체를 생성함으로써 Circle 클래스의 실체가 생성됨
        // 객체가 생성되면 해당 클래스에 포함된 맴버들을 사용할 수 있음
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);

//        Car car1 = new Car();
//        car1.stop();
//        System.out.println(car1.gas);
//        System.out.println(car1.name);

        Car car2 = new Car("토레스", "SUV", "가솔린", "준준형");
        System.out.println(car2.name);
        System.out.println(car2.type);
        System.out.println(car2.gas);
        System.out.println(car2.size);

        Car4 toress = new Car4("토레스", "SUV");
        toress.info();

        Car4 santefe = new Car4("싼타페", "SUV");
        santefe.info();

        Car4 canival = new Car4();
        canival.name = "카니발";
        canival.type = "SUV";
        canival.info();

        Car5 grander1 = new Car5();
        grander1.getInfo();

        Car5 k7 = new Car5("K7", "세단", "준대형");
        k7.getInfo();
        k7.getInfo("전기");
        k7.getInfo("가솔린", 4000);
        k7.getInfo("가솔린", "4000");
        k7.getInfo(4000, "경유");

        sum(10, 20);
        sum(3.14, 5.28);
    }

    public static void sum(int a, int b) {
        int result = a + b;
        System.out.println("두 수의 덧셈은 " + result + "입니다.");
    }

    public static void sum(double a, double b) {
        double result = a + b;
        System.out.println("두 수의 덧셈은 " + result + "입니다.");
    }

    public static void sum(int a, double b) {

    }

    public static void sum(double a, int b) {

    }
}
