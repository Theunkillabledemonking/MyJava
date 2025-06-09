package src.OOP;
class OuterClass {
    // 외부 클래스의 인스턴스 변수
    private int outerVal = 20; // LocalInner 클래스에서 이 변수에도 접근 가능

    // 외부 클래스의 메서드
    void outerMethod(final int methodParam) {
        // 외부 메서드의 지역 변수
        final int localVar = 10; // LocalInner에서 사용되므로 final (또는 effectively final)

        // -- 지역 내부 클래스 (Local Inner class) 선언 --
        class LocalInner {
            // 지역 내부 클래스의 인스턴스 변수
            private String innerVal = "내부 변수";

            // 지역 내부 클래스의 메서드
            void display() {
                System.out.println("---- LocalInner.display() 호출 -----");

                //  1. 외부 클래스의 멤버 접근
                System.out.println("OuterClass의 outerVar: " + outerVal);
                System.out.println("OuterClass의 THIS 참조: " + OuterClass.this.outerVal);

                // 2. 자신을 감싸는 메서드의 매개변수 및 지역 변수 접근 (캡처)
                // 해당 변수들을 final 또는 effectively final 이어야 함.
                System.out.println("외부 메서드의 파라미터 (methodParam): " + methodParam);
                System.out.println("외부 메서드의 지역 변수 (localVar): " + localVar);

                // 3. 지역 내부 클래스 자신의 멤버 접근
                System.out.println("내부 클래스의 변수 (innerVar): " + innerVal);
                System.out.println("내부 클래스의 this 참조: " + this.innerVal);
            }
        }
        // 지역 내부 클래스 선언 끝=

        // 지역 내부 클래스의 인스턴스 생성
        // outerMethod 내에서만 LocalInner 타입으로 선언하고 생성할 수 있습니다.
        System.out.println("LocalInner 인스턴스 생성 직전");
        LocalInner li = new LocalInner();

        // 지역 내부 클래스의 메서드 호출
        li.display();

        System.out.println("outerMethod 실행 완료");
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {

    }
}
