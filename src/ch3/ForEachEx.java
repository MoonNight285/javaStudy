package ch3;

public class ForEachEx {
    public static void main(String[] args) {
        System.out.println("\n ----- 기존 for 문을 사용 -----\n");
        int arrNum[] = {10, 20, 30, 40, 50};
        int total = 0;

        for (int i = 0; i < arrNum.length; i++) {
            System.out.println("arrNum[" + i + "] : " + arrNum[i]);
        }

        for (int i = 0; i < arrNum.length; i++) {
            total += arrNum[i];
        }
        System.out.println("total : " + total);

        System.out.println();

        System.out.println("\n ----- for ~ each -----\n");
        int arrNum2[] = {10, 20, 30, 40, 50};
        int total2 = 0;

        for (int num : arrNum2) {
            System.out.println("num : " + num);
        }

        for (int num: arrNum2) {
            total2 += num;
        }

        System.out.println("total2 : " + total2);
    }
}
