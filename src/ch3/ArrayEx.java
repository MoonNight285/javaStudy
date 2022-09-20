package ch3;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        // 배열 : 하나의 이름으로 여러개의 데이터를 저장하기 위한 데이터 타입
        // 자바의 배열은 동일한 데이터 타입의 데이터만 저장할 수 있음
        // 배열은 index 를 가지고 있으며 데이터를 index 를 통해서 구분한다
        // index 는 0부터 시작
        // new 키워드를 사용해서 배열을 초기화 시 해당 데이터 타입의 초기값으로 초기화됨
        // 지정된 크기 이상의 index 에 접근 시 오류가 발생한다.

        // 선언1 : 데이터 타입 배열명 [] = new 데
        // 사용법이터 타입 [크기];
        // 선언2 : 데이터 타입 배열명 []; 배열명 = new 데이터타입[크기];
        // 선언3 : 데이터 타입 배열명[] = {데이터1, 데이터2, 데이터3, ...};
        // 사용1 : 배열명[index]; 지정한 index 에 있는 데이터를 가져온다.
        // 사용2 : 배열명[index] = 데이터; 지정한 index 에 데이터를 저장
        // 빈 배열 선언, 메모리 상에 array1 이라는 빈 배열을 등록, 해당 배열 사용시 반드시 초기화 작업이 필요하다.
        System.out.println("\n ----- 배열 사용하기 -----\n");
        int array1[];
        array1 = new int[5];
        System.out.println("배열 array1의 메모리 주소 : " + array1);
        System.out.println("배열 array1의 index 0의 값 : " + array1[0]);
        array1[2] = 10;
        System.out.println("배열 array1의 index 2의 값 : " + array1[2]);
        System.out.println("배열 array1의 index 4의 값 : " + array1[4]);
        System.out.println("배열 array1의 길이 : " + array1.length);

        System.out.println();

        int array2[] = new int[5];
        System.out.println("배열 array2의 메모리 주소 : " + array2);
        System.out.println("배열 array2의 index 0의 값 : " + array2[0]);
        array2[2] = 20;
        System.out.println("배열 array2의 index 2의 값 : " + array2[2]);
        System.out.println("배열 array2의 index 4의 값 : " + array2[4]);
        System.out.println("배열 array2의 길이 : " + array2.length);

        System.out.println();

        int array3[] = {10, 20, 30, 40, 50};
        System.out.println("배열 array3의 메모리 주소 : " + array3);
        System.out.println("배열 array3의 index 0의 값 : " + array3[0]);
        array3[2] = 300;
        System.out.println("배열 array3의 index 2의 값 : " + array3[2]);
        System.out.println("배열 array3의 index 4의 값 : " + array3[4]);
        System.out.println("배열 array3의 길이 : " + array3.length);

        // 배열을 먼저 선언하고 나중에 입력하는 1번 형식으로 배열을 선언 시 3번 형식의
        // 데이터 입력은 불가능 하다.
        // int array4[];
        // array4 = {10, 20, 30, 40, 50} => 오류가 발생, 무조건 new 를 사용해야 한다.

        System.out.println("\n ----- 기본 타입과 래퍼런스 타입 -----\n");
        int a = 10;
        int b = 20;

        System.out.println("변수 a의 값 : " + a + "\t 변수 b의 값 : " + b);
        // 변수 a의 값을 변수 b에 복사해서 넘겨줌
        b = a;

        System.out.println("변수 a의 값 : " + a + "\t 변수 b의 값 : " + b);

        // 변수 a의 값을 변경하면 변수 b의 값은 그대로 남아있음, 값을 복사해서 넘겨줬기 때문
        a = 100;

        System.out.println("변수 a의 값 : " + a + "\t 변수 b의 값 : " + b);

        int arr1[] = {100};
        int arr2[] = {200};
        System.out.println("배열 arr1의 주소 : " + arr1 + "\t 배열 arr2의 주소 : " + arr2);
        System.out.println("배열 arr1[0]의 값 : " + arr1[0] + "\t 배열 arr2의 값 : " + arr2[0]);

        arr2 = arr1;

        System.out.println("배열 arr1의 주소 : " + arr1 + "\t 배열 arr2의 주소 : " + arr2);
        System.out.println("배열 arr1[0]의 값 : " + arr1[0] + "\t 배열 arr2의 값 : " + arr2[0]);

        arr1[0] = 2000;
        System.out.println("배열 arr1의 주소 : " + arr1 + "\t 배열 arr2의 주소 : " + arr2);
        System.out.println("배열 arr1[0]의 값 : " + arr1[0] + "\t 배열 arr2의 값 : " + arr2[0]);

        System.out.println();

        // 배열 선언 시 배열의 크기를 설정하는 부분에 변수 사용 금지
        // 변수는 변경되는 값이기 때문에 배열의 크기가 어떻게 될지 알 수 없음
        // 배열의 index 접근에는 변수를 사용하는 것이 가능하다.
        int arrayInt[];
        arrayInt = new int[5];
        int max = 0;
        System.out.println("양수 5개를 입력하세요");

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            // 사용자 입력을 통해 얻은 데이터를 배열에 저장
            arrayInt[i] = scanner.nextInt();
            // 배열에 저장된 데이터를 max 와 비교
            if (arrayInt[i] > max) {
                // max 에 배열에 저장된 값을 저장
                max = arrayInt[i];
            }
        }
        scanner.close();

        System.out.println("가장 큰 수는 " + max + "입니다.");
    }
}
