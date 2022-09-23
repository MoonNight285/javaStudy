package ch4;

import java.security.PublicKey;

public class StaticClassEx {
    public String name;
    public int age;

    public static String job;

    public StaticClassEx() {
        this("아이유");
    }

    public StaticClassEx(String name) {
        this(name, 30);
    }

    public StaticClassEx(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void getJob() {
        System.out.println("직업 : " + job);
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("이름 : " + this.name + "\n" + "나이 : " + this.age);
    }
}
