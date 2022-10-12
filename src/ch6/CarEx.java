package ch6;

public class CarEx {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        System.out.println("\n");

        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRightTire = new KumhoTire();

        myCar.run();

        System.out.println("\n");

        Car2 car2  = new Car2();
        car2.run();

        System.out.println("\n");

        car2.tireis[2] = new KumhoTire();
        car2.tireis[3] = new KumhoTire();

        car2.run();
    }
}
