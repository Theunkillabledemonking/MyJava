package src.OOP;

class X {
    void prt() {
        System.out.println("안녕하세요");
    }
}

class Y extends X {
    @Override
    void prt() {
        super.prt(); // 부모 호출
        System.out.println("Hello"); // 재정립
    }
}


public class abc {
    public static void main(String[] args) {
        new Y().prt();
    }
}
