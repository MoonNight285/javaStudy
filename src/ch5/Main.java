package ch5;

public class Main {
    public static void main(String[] args) {
        // 2022-09-27
        System.out.println("\n ----- 상속 -----\n");

        Point p = new Point();
        p.set(1, 2);
        p.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3, 4);
        cp.setColor("red");
        cp.showColorPoint();
    }
}
