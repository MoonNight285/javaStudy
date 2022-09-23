package ch4;

public class Rect {
    private int width, height;

    public Rect(int width, int hegiht) {
        this.width = width;
        this.height = hegiht;
    }

    public int getArea() {
        return width * height;
    }
}
