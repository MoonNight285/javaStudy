package ch3;

public class ForEx {
    public static void main(String[] args) {
        // for : 가장 많이 사용되는 반복문
        // while 문과 차이점
        // 1. 초기화 변수와 초기화 변수 카운트를 for 문의 설정 부분에 입력
        // 2. 초기화 변수가 for 문의 설정 부분에 입력되면서 for 문의 지역변수로 사용되어 같은 변수를
        // 계속 사용할수 있다.
        // 3. 초기화 변수 카운트가 항상 마지막에 동작함

        System.out.println("\n ----- for 문 ----- \n");
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n ----- while 문 ------ \n");

        // 동일한 이름의 변수를 선언할 수 없음
        // 기존의 변수를 재활용하고 저장된 값을 초기화하여 사용해야 함
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        System.out.println("\n ----- 중첩 for 문 -----\n");
        // for 문 안에 for 문이 존재하는 형태의 for 문
        // 2차원 배열의 내용을 출력할 때 많이 사용함

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i의 값 : " + i + "\tj의 값 : " + j);
            }
            System.out.println("----------");
        }

        // 변수의 카운트 부분을 ++를 사용한 단항 연산자가 아닌 산술 대입 연산자를 사용 시 원하는 크기만큼
        // 카운트 값을 변경할 수 있다.
        for (int i = 2; i < 10; i++) {
            System.out.println("----- " + i + "단 -----");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
