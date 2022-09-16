package ch2;

import java.util.Scanner;

// 오픈 챌린지 84페이지
// 두 사람이 하는 가위바위보 게임을 만들어보자. 두 사람의 이름은 철수와 영희이다. 먼저 철수를 출력하고 가위 바위 보 중 하나를 문자열로
// 입력받는다. 영희에 대해서 마찬가지 방법으로 입력받는다. 두 사람으로부터 문자열을 입력받은 후 누가 이겼는지 판별하여 승자를 출력한다.
public class IfSol_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
        System.out.print("철수 >> ");
        String answer1 = scanner.next();
        System.out.print("영희 >> ");
        String answer2 = scanner.next();

        if(answer1 == answer2) {
            System.out.println("비겼습니다!");
        }
        else {
            if(answer1.equals("가위") && answer2.equals("바위")) {
                System.out.println("영희가 승리했습니다.");
            }
        }

    }
}
