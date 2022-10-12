package ch6;

public class DriverEx {
    public static void main(String[] args) {
        System.out.println("\n ----- 각각 객체를 생성해서 실행 -----\n");
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        bus.run();
        taxi.run();

        System.out.println("\n ----- 익명 객체를 통한 구현 -----\n");
        Vehicle vehicle = new Vehicle() {
            @Override
            public void run() {
                System.out.println("탈것이 달립니다.");
            }
        };
        vehicle.run();

        System.out.println("\n ----- 부모 인터페이스 타입의 변수에 자식 객체를 대입 -----\n");
        vehicle = bus;
        vehicle.run();
        vehicle = taxi;
        vehicle.run();

        System.out.println("\n ----- 인터페이스 변수를 매개변수로 사용시 -----\n");
        Driver driver = new Driver();
        driver.drive(bus);
        driver.drive(taxi);

        System.out.println("\n ----- 자동 타입변환, 강제 타입변환, instanceof -----\n");
        // 자동 타입 변환, 부모인 Vehicle 인터페이스 타입의 변수에 자식인 Bus 클래스 타입의 객체를 대입
        Vehicle vehicle2 = new Bus();
        vehicle2.run();

        // 데이터 타입이 다르므로 강제 타입 변환을 시도해야 한다.
        // 강제 타입 변환의 조건이 원본이 자식 클래스 타입의 객체일때 해당 클래스 타입으로 변환 시 가능
        // 원본 클래스 객체 타입이 맞는지 확인을 하기 위해서는 instanceof 연산자를 사용해야 함
        Bus bus2 = (Bus)vehicle2;
        bus.run();

        Vehicle vehicle3 = new Bus();
        vehicle3.run();

        if(vehicle3 instanceof Taxi) {
            Taxi taxi2 = (Taxi) vehicle3;
            taxi2.run();
            System.out.println("정상적으로 Taxi 클래스 타입으로 변경했습니다.");
        } else {
            System.out.println("Taxi 클래스 타입으로 변경할수 없습니다.");
        }
    }
}
