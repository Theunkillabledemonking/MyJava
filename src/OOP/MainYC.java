package src.OOP;

class A {
    A() {
        super();
        System.out.println("A 생성자 호출");
    }
}

class B extends A {
    B(int b) {
        System.out.println("B 생성자 호출");
    }
    B() {};
}

class C extends B {
    C() {
        super();
        System.out.println("C () 생성자 호출");
    }

    C (int b) {
        // super();
        this();
        System.out.println("C (int m) 생성자 호출");
    }

    C (int b, int c) {
        this();
        System.out.println("C (int m, int n) 생성자 호출");
    }
}


public class MainYC {
    public static void main(String[] args) {
    }
}
