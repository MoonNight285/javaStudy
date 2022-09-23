package ch4;

public class GetterSetterEx {
    public static void main(String[] args) {
        BMI gildong = new BMI();
        gildong.name = "홍길동";
        gildong.height = 180;
        gildong.weight = 75;

        // bmi는 private로 설정되어있어서 외부 접근이 불가능하다.
        // gildong.bmi = 22;

        System.out.println(gildong.name + "의 키는 " + gildong.height + "cm\n" + gildong.name + "의 몸무게는 " +
                gildong.weight + "kg");

        gildong.setMyInfo(180, 75);
        System.out.println(gildong.name + "의 bmi는 " + gildong.getBmi());

        GetSet gs = new GetSet();
        gs.value1 = "public 맴버 변수";
        System.out.println(gs.value1);
        gs.setValue2("private 맴버 변수");
        System.out.println(gs.getValue2());
    }
}
