package src.OOP;

class Bar3 {
    int outerInstanceMember = 1;        // 외부 클래스의 인스턴스 멤버
    static int outerStaticMember = 2;   // 외부 클래스의 정적 멤버

    /**
     * 인스턴스 내부 클래스 (Instance Inner Class)
     * - Bar의 인스턴스가 있어야 생성 가능
     * - Bar의 모든 멤버 (인스턴스 + static)에 접근 가능
     */
    class Inner {
        void prt() {
            // 외부 클래스의 인스턴스 멤버 접근 (가능)
            System.out.println(outerInstanceMember);
            // 외부 클래스의 static 멤버 접근 (가능)
            System.out.println(outerStaticMember);
        }
    }

    /**
     * 정적 중첩 클래스 (Static Nested Class)
     * - 외부 클래스의 인스턴스 없이 생성 가능
     * - 외부 클래스의 static 멤버에만 접근 가능
     */
    static class Nested {
        void prt() {
            /**
             * 외부 클래스의 인스턴스 멤버에는 접근 불가 -> 컴파일 에러 발생
             * System.out.print(OuterInstanceMember); // 오류
             * 외부 클래스의 static 멤버 접근 (가능)
             */
            System.out.println(outerStaticMember);
        }
    }
}

public class OuterClassStaticMember {
    public static void main(String[] args) {
        Bar3 bar = new Bar3();
        Bar3.Inner inner1 = bar.new Inner();
        Bar3.Nested nest = new Bar3.Nested();
        inner1.prt();
        nest.prt();
    }
}
