package src.OOP;

// 인터페이스 생성
interface myInterface { void prt(); }

class Outer2 {
    int outer_val = 1;  // 외부 크래스 필드

    // 지역 클래스: 메서드 내부에 선언된 클래스
    myInterface prtSomething() {
        class test implements myInterface {

            public void prt() {
                int local_val = 1; // 지역 변수: Java 8 이후로 effectively final 조건 만족하면 캡처링
                System.out.println(outer_val + local_val); // 외부 클래스의 필드+ 지역 변 수사용
            }
        }

        return new test();  // 지역 클래스의 인스턴스를 반환
    }
}

public class prt250602V2 {
    public static void main(String[] args) {
       myInterface ifs = new Outer2().prtSomething(); // 인스페이스 타입으로 지역 클래스 인스턴스
       ifs.prt(); // outer_val(1) + local_val(1) = 2 출력
    }
}
