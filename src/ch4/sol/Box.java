package ch4.sol;

// 실습문제6 - 187p
public class Box {
    private int width, height;
    private char fillChar;

    public Box() {
        this.width = 10;
        this.height = 1;
    }

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(fillChar);
            }
            System.out.println();
        }
    }

    public void file(char c) {
        this.fillChar = c;
    }
}
