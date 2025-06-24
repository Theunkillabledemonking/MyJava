package src.OOP;

class Outer_Test {
    static class Inner {
        void classPrint() {
            System.out.println("정적 내부");
        }
    }
}

class Outer_Test1 {
    class Inner2 {
        void memberPrint() {
            System.out.println("멤버 내부");
        }
    }
}

class printFinalTest {
    void display() {
        final int x = 10;
        class LocalInner {
            void show() { System.out.println(x); }
        }
        new LocalInner().show();
    }
}

public class prtFinalTest {
    public static void main(String[] args) {
        Outer_Test.Inner i = new Outer_Test.Inner();
        i.classPrint();

        Outer_Test1 i2 = new Outer_Test1();
        Outer_Test1.Inner2 i3 = i2.new Inner2();
        i3.memberPrint();



        Runnable r = new Runnable() {
            public void run() {
                System.out.println("실행하자");
            }
        };
        r.run();
    }
}
