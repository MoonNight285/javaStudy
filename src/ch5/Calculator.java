package ch5;

public class Calculator extends MultiDiv{
    public int other() {
        return this.num1 % this.num2;
    }

    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
