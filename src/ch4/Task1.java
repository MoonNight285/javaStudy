package ch4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    public static int[] dataInput() {
        int data[] = new int[10];

        System.out.print("정수 10개를 입력하세요 >>");
        for (int i = 0; i < data.length; i++) {
            data[i] = scanner.nextInt();
        }

        return data;
    }

    public static int[] dataSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if(data[i] >= data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

        return data;
    }

    public static int[] arraySort(int[] data) {
        Arrays.sort(data);
        return data;
    }

    public static void dataPrint(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 126p 실습문제 5 - 정수를 10개 입력받아 배열에 저장하고 증가 순으로 정렬하여 출력하라.

        // dataPrint(dataSort(dataInput()));

        // Arrays.sort() 사용
        dataPrint(arraySort(dataInput()));
        scanner.close();
    }
}
