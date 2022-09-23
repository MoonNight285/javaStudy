package ch4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // 실습 문제2 184p
        // 다음은 이름(name 필드)과 전화번호(tel 필드)를 가진 Phone 클래스이다. 이름과 전화번호를
        // 입력받아 2개의 Phone 객체를 생성하고, 출력하는 main() 메소드를 작성하라.

        Scanner scanner = new Scanner(System.in);

        System.out.print("이름과 전화번호를 입력 >>");
        String name1 = scanner.next();
        String tel1 = scanner.next();

        System.out.println("이름과 전화번호를 입력 >>");
        String name2 = scanner.next();
        String tel2 = scanner.next();

        Phone phone1 = new Phone(name1, tel1);
        Phone phone2 = new Phone(name2, tel2);

        System.out.println(phone1.getName() + "의 번호 : " + phone1.getTel());
        System.out.println(phone2.getName() + "의 번호 : " + phone2.getTel());

        scanner.close();
    }
}
