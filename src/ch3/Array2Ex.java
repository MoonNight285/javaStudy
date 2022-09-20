package ch3;

public class Array2Ex {
    public static void main(String[] args) {
        System.out.println("\n ----- 다차원 배열 -----\n");
        
        // 1차원 배열 : 기본 배열, 배열의 요소로 데이터를 가지는 배열
        // 2차원 배열 : 배열의 요소로 1차원 배열을 가지는 배열
        // 3차원 배열 : 배열의 요소로 2차원 배열을 가지는 배열

        // 1차원 배열 선언
        int arr1[] = new int[] {1, 2, 3, 4, 5};

        // 2차원 배열 선언
        int arr2[][] = {
                {1, 2, 3}, {4, 5, 6}
        };

        // 3차원 배열 선언
        int arr3[][][] = {
                {{1, 2, 3}, {4, 5, 6}},
                {{7, 8, 9}, {10, 11, 12}}
        };

        // 2차원 배열에서 크기를 확인하기 위한 속성인 length 를 사용시 해당 배열의 라인수를 출력합니다.
        int numArr[][] = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        System.out.println("numArr[4][1] : " + numArr[4][1]);
        System.out.println("numArr[4][1] : " + numArr[1][4]);

        // 2차원 배열의 요소가 1차원 배열이므로 새로운 1차원 배열 형식의 변수에 2차원 배열의 요소를 대입하면
        // 1차원 배열을 얻을 수 있음
        int test[] = numArr[2];
        System.out.println(test[0] + " " + test[1] + " " + test[2] + " " + test[3] + " " + test[4]);

        // 반복문을 사용하여 2차원 배열의 데이터를 출력하려면 2중 반복문을 사용해야 함.
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(numArr[i][j]);
            }
        }

        for (int item[] : numArr) {
            for (int i : item) {
                System.out.println(i);
            }
        }

        for (int i = 0; i < numArr.length; i++) {
            for (int item : numArr[i]) {
                System.out.println(item);
            }
        }
    }
}
