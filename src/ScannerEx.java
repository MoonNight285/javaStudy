import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("nextLine()를 사용해서 한번에 키보드 입력 가져오기");
        String data = scanner.nextLine();
        System.out.println(data);

        String name = scanner.next();
        System.out.println("당신의 이름은 " + name + "입니다.");

        String city = scanner.next();
        System.out.println("당신이 사는 도시는 " + city + "입니다.");

        int age = scanner.nextInt();
        System.out.println("당신의 나이는 " + age + "입니다.");

        double height = scanner.nextDouble();
        System.out.println("당신의 체중은 " + height + "입니다.");

        boolean single = scanner.nextBoolean();
        System.out.println("당신의 독신 여부는 " + single + "입니다.");

        scanner.close();
    }
}
