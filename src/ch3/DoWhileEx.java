package ch3;

// do ~ while : 기본적으로 while 문과 동일한 반복문, 무조건 1번은 실행이 되는 while 문, 반복 조건을 나중에 확인
public class DoWhileEx {
    public static void main(String[] args) {
        System.out.println("----- while 문 ----- \n");
        int c1 = 10;

        while(c1 < 5) {
            System.out.println(c1);
            c1++;
        }

        System.out.println("\n ----- do while 문 ----- \n");
        int c2 = 10;

        do {
            System.out.println(c2);
            c2++;
        }
        while (c2 < 5);
    }
}
