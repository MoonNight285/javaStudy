package ch3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Open Challenge 121p
        // 숨은 번호를 맞추는 게임을 만들어보자. 컴퓨터는 0에서 99까지의 임의의 수를 선택하고, 사용자는
        // 이 수를 맞추는 게임이다. 아래와 같이 컴퓨터가 가진 수가 98인 경우를 보자. 사용자가 55라고
        // 입력하면 "더 높게", 다시 70을 입력하면 "더 높게" 이런식으로 메세지를 출력하고,
        // 범위를 좁혀가면서 수를 맞춘다. 게임을 반복하기 위해 y/n을 묻고 "n"이 입력되면 종료한다.

        int targetNumber = (int)(Math.random() * 100);
        int numberRange1 = 0;
        int numberRange2 = 99;
        int count = 1;
        int selectNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Up & Down 게임입니다. 숨겨진 수를 맞추어 보세요.");
        while(true) {
            System.out.println(numberRange1 + "-" + numberRange2);
            System.out.print(count++ + ">>");
            selectNumber = scanner.nextInt();

            if(targetNumber == selectNumber) {
                System.out.println("맞았습니다.");
                System.out.print("다시하시겠습니까? (y / n)");
                String retry = scanner.next();

                if(retry.equals("n") || retry.equals("N")) {
                    break;
                }
                else { // 다시 시작한다면 초기화 작업 수행
                    numberRange1 = 0;
                    numberRange2 = 99;
                    count = 1;
                    targetNumber = (int)(Math.random() * 100);
                }
            }
            else if (selectNumber > targetNumber) {
                System.out.println("더 낮게");
                numberRange2 = selectNumber;
            }
            else if (selectNumber < targetNumber) {
                System.out.println("더 높게");
                numberRange1 = selectNumber;
            }
        }

        System.out.println("Up & Down 게임을 종료합니다.");
        scanner.close();
    }
}
