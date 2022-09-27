package ch5;

import ch5.package1.B;

public class Main {
    public static void main(String[] args) {
        // 2022-09-27
        System.out.println("\n ----- 상속 -----\n");

        Point p = new Point();
        p.set(1, 2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3, 4);
        cp.setColor("red");
        cp.showColorPoint();

        System.out.println();

        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

        System.out.println("모델 : " + dmbCellPhone.model);
        System.out.println("색상 : " + dmbCellPhone.color);
        System.out.println("채널 : " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요 저는 홍길동인데요");
        dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
        dmbCellPhone.hangUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();

        Student std = new Student("홍길동", "123456-1234567", 1);

        System.out.println();
        System.out.println();

        int r = 10;

        Calculator1 calculator1 = new Calculator1();
        System.out.println("원면적 : " + calculator1.areaCircle(r));
        System.out.println("원면적 : " + calculator1.sum());
        System.out.println(calculator1.sub());
        System.out.println();

        Computer computer = new Computer();
        System.out.println("원면적 : " + computer.areaCircle(r));
        System.out.println(computer.sum());
        System.out.println(computer.sub());

        System.out.println("\n -----  -----\n");
        SupersonicAirplaneEx supersonicAirplaneEx = new SupersonicAirplaneEx();
        supersonicAirplaneEx.execute();

        System.out.println("\n -----  -----\n");
        B b = new B();
        b.method();
    }
}
