package ch3;

public class ArrayExSol {
    public static void main(String[] args) {
        // 문제 1 - int 타입의 변수 intArray 를 생성하고 크기를 10으로 설정한 후 각 index 에
        // 1 ~ 10까지의 데이터를 입력하고 저장된 데이터를 출력하세요.
        int array[] = new int[] {1,2,3,4,5,6,7,8,9,10};

        System.out.println("array[0] :" + array[0]);
        System.out.println("array[1] :" + array[1]);
        System.out.println("array[2] :" + array[2]);
        System.out.println("array[3] :" + array[3]);
        System.out.println("array[4] :" + array[4]);
        System.out.println("array[5] :" + array[5]);
        System.out.println("array[6] :" + array[6]);
        System.out.println("array[7] :" + array[7]);
        System.out.println("array[8] :" + array[8]);
        System.out.println("array[9] :" + array[9]);

//        for (int i = 0; i < array.length; i++) {
//            System.out.println("array[" + i + "]의 값 : " + array[i]);
//        }

        System.out.println();

        // 문제 2 - 문제 1의 intArray 에 저장된 값을 모두 합치는 프로그램을 작성하세요.
        int total = 0;

        total = array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6] + array[7] + array[8] + array[9];

//        for (int i = 0; i < array.length; i++) {
//            total += array[i];
//        }

        System.out.println("array 의 총합 : " + total);
    }
}
