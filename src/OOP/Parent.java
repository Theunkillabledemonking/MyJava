package src.OOP;

// Inheritance(상속)
// 부모 클래스로부터 멤버들을 물려 받는다.

class Std {
    int id = 2;
    String name = "std";
    static String university = "YJU";
    int age = 14;
    String major;
}

class GscStd extends Std {
    int id = 20;
    String name = "GscStd";
    GscStd() {
        System.out.println("id: " + this.id + " name: " + super.name + " age: " + age );
    }
}

public class Parent {
    public static void main(String[] args) {
        GscStd s = new GscStd();
    }
}
