package src.OOP;

interface Test1 { void prt(); }

class Outer3 {
    int outer_val = 2;

    Test1 prt() {
        // Effectively constant
        int local_val = 2; // 변경 없이 선언

        class Inner3 implements Test1 {
            public void prt() {
                System.out.println(outer_val); // 참조
                System.out.println(local_val); // 캡처링 발생
            }
        }
        return new Inner3();
    }
}


public class prt250604 {
    public static void main(String[] args) {

        Outer3 outer = new Outer3();
        Test1 test = outer.prt();
        test.prt();
    }
}
