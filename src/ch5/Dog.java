package ch5;

public class Dog extends Animal {
    public Dog(String kind) {
        // this.kind = "포유류";
        super(kind);
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
