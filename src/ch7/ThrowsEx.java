package ch7;

public class ThrowsEx {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        try {
            cal.sum("10a", "20");
            cal.sub("10a", "20");
        } catch(Exception ex) {
            System.out.println("실행 시 오류가 발생했습니다.");
        }
    }
}
