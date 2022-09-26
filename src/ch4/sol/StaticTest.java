package ch4.sol;

// 실습문제 5 - 186p
public class StaticTest {
    public static void main(String[] args) {
        Circle pizza = new Circle(5);
        Circle waffle = new Circle(1);

        boolean res = CircleManager.equals(pizza, waffle);
        if(res) {
            System.out.println("pizza와 waffle 크기 같음");
        }
        else {
            System.out.println("pizza와 waffle 크기 다름");
        }

        CircleManager.copy(pizza, waffle);
        res = CircleManager.equals(pizza, waffle);
        if(res) {
            System.out.println("pizza와 waffle 크기 같음");
        }
        else {
            System.out.println("pizza와 waffle 크기 다름");
        }
    }


}
