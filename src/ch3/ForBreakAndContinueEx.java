package ch3;

public class ForBreakAndContinueEx {
    // break : 반복문 내에서 break 를 만나면 해당 반복문 즉시 중단
    // continue : 반복문 내에서 continue 를 만나면 해당 루프만 중단하고 다음 루프로 넘어감
    public static void main(String[] args) {
        System.out.println("\n ----- break -----\n");
        for (int i = 0; i < 10; i++) {
            if(i == 5) {
                break;
            }
            System.out.println("현재 i의 값 : " + i);
        }

        System.out.println("\n ----- continue -----\n");
        for (int i = 0; i < 10; i++) {
            if(i == 5)
                continue;
            System.out.println("while 문 사용시 현재 i의 값 : " + i);
        }
    }
}
