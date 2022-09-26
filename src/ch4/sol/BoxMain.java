package ch4.sol;

// 실습문제6 - 187p
public class BoxMain {
    public static void main(String[] args) {
        Box a = new Box();
        Box b = new Box(20,3);
        a.file('*');
        b.file('%');
        a.draw();
        b.draw();
    }
}
