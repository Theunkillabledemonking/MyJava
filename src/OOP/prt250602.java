package src.OOP;

class Outer1 {
    int outer_val = 1;  // 외부 클래스 필드

    void prt(){
        System.out.println(outer_val); // 외부 클래스의 필드 출력
    }

    // 내부 클래스 (인스턴스 클래스)
    class Inner {
        int inner_val = 2; // 내부 클래스의 필드

        void prt() {
            System.out.println(outer_val); // 외부 클래스의 필드에 접근 가능
        }

        void set_val(int val) {
            Outer1.this.outer_val = val; // 외부 클래스의 outer_Val 값을 변경
        }
    }

    // 정적 중첩 클래스 (static nested class)
    static class Nested {
        // 정적 중첩 클래스는 외부 클래스의 인스턴스 변수에 직접 접근할 수 없음
    }
}


public class prt250602 {
    public static void main(String[] args) {
        // 정적 중첩 클래스는 외부 인스턴스 없이 생성 가능
        Outer1.Nested nested = new Outer1.Nested();

        // 외부 클래스 인스턴스 생성
        Outer1 outer1 = new Outer1();

        // 내부 클래스 인스턴스는 외부 인스턴스를 통해 생성
        Outer1.Inner inner1 = outer1.new Inner();
        Outer1.Inner inner2 = outer1.new Inner();

        inner1.set_val(3); // outer_val 값을 3으로 변경
        inner2.prt();      // 변경된 outer_val(3)을 출력
        outer1.prt();      // 역시 outer_val(3)을 출력


    }
}
