package ch4;

public class StaticMemberEx {
    public static void main(String[] args) {
        // 객체 생성 후 객체의 맴버를 사용
        StaticClassEx sc1 = new StaticClassEx();
        sc1.getInfo();
        System.out.println("나이 : " + sc1.age);
        System.out.println("이름 : " + sc1.name);

        StaticClassEx.job = "가수";
        System.out.println("직업 : " + StaticClassEx.job);
        StaticClassEx.getJob();

        System.out.println("\n -----  -----\n");

        // Calc 클래스의 맴버 메서드인 abs, max, min 이 모두 정적 맴버이기 때문에 객체 생성없이 클래스
        // 이름으로 직접 접근이 가능함
        // 정적 맴버는 해당 클래스를 객체화하여 사용 시 객체화된 모든 객체들과 함께 메모리 공간을 공유함
        System.out.println(CalcEx.abs(-5));
        System.out.println(CalcEx.max(10, 8));
        System.out.println(CalcEx.min(-3,-8));
        
        // 정적 맴버도 객체 생성 후 사용이 가능함
        CalcEx c = new CalcEx();
        System.out.println(c.abs(-5));
        System.out.println(c.max(10, 8));
        System.out.println(c.min(10, 8));

        // 일반 맴버를 사용한 연산
        CalcEx c1 = new CalcEx();
        CalcEx c2 = new CalcEx();

        c1.iNum1 = 10;
        c1.iNum2 = 20;
        c1.iResult = c1.iNum1 + c1.iNum2;
        System.out.println("객체 c1의 iResult : " + c1.iResult);

        c2.iNum2 = 100;
        c2.iNum1 = 200;
        c2.iResult = c2.iNum1 + c2.iNum2;
        System.out.println("객체 c2의 iResult : " + c2.iResult);
        System.out.println("객체 c1의 iResult : " + c1.iResult);

        // 정적 맴버를 사용한 연산
        c1.sNum1 = 10;
        c1.sNum2 = 20;
        c1.sResult = c1.sNum1 + c1.sNum2;
        System.out.println("객체 c1의 sResult : " + c1.sResult);

        c2.sNum1 = 100;
        c2.sNum2 = 200;
        c2.sResult = c2.sNum1 + c2.sNum2;
        System.out.println("객체 c2의 sResult : " + c2.sResult);
        System.out.println("객체 c1의 sResult : " + c1.sResult);
        System.out.println("클래스의 sResult : " + CalcEx.sResult);

        System.out.println("\n -----  -----\n");

        System.out.println(Tv.info);
    }
}
