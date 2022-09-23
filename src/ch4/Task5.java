package ch4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // 실습문제4 - 185p
        // 이름(name)과 전화번호(tel) 필드, 생성자 및 필요한 메소드를 가진 Phone 클래스를 작성하고
        // 다음 실행 사례와 같이 작동하도록 main()을 가진 PhoneManager 클래스를 작성하라.
        // 한 사람의 전화번호는 하나의 Phone 객체로 다룬다.

        Phone2 phone2s[];
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");
        int number = scanner.nextInt();

        if(number <= 10) {
            phone2s = new Phone2[10];
        }
        else if(number <= 50) {
            phone2s = new Phone2[50];
        }
        else if(number <= 100) {
            phone2s = new Phone2[100];
        }
        else {
            System.out.println("인원이 너무 많습니다.");
            return;
        }

        for (int i = 0; i < number; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력)>>");
            String name = scanner.next();
            String tel = scanner.next();

            phone2s[i] = new Phone2(name, tel);
        }
        System.out.println("저장되었습니다...");

        while(true) {
            System.out.print("검색할 이름>>");
            String targetName = scanner.next();

            if(targetName.equals("exit") == true) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }

            boolean flag = false;
            for (int i = 0; i < number; i++) {
                if(phone2s[i].getName().equals(targetName) == true) {
                    System.out.println(targetName + "의 번호는 " + phone2s[i].getTel() + " 입니다.");
                    flag = true;
                    break;
                }
            }

            if(flag == false) {
                System.out.println(targetName + " 이 없습니다.");
            }
        }
    }
}
