package ch5;

public class People {
    public String name;
    public String ssn;

    public People() {
        this.name = "홍길동";
        this.ssn = "123456-1234567";
    }

    public People(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
