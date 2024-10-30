package etCetera;

public class Arithmetic {
  public static void main(String[] args) {
    // 1. 기본 사칙연산
    // a) +, -의 경우 음수화, 양수화 포함
    int a = 10;
    int b = -5;
    System.out.println("기본 사칙연산 예제:");
    System.out.println("a + b = " + (a + b)); // 10 + (-5) = 5
    System.out.println("a - b = " + (a - b)); // 10 - (-5) = 15
    System.out.println("a * b = " + (a * b)); // 10 * (-5) = -50
    System.out.println("a / b = " + (a / b)); // 10 / (-5) = -2

    // 음수화, 양수화 예제
    int positive = +a; // 양수화 ,변동 없음
    int negative = -a; // 음수화
    System.out.println("양수화: +" + a + " = " + positive); // 양수화: +10
    System.out.println("음수화: -" + a + " = " + negative); // 음스화 -10

    System.out.println();

    // 2. 나눗셈
    // a) 정수형 나눗셈 - 몫
    int x = 7;
    int y = 3;
    System.out.println("정수 나눗셈 (몫):");
    System.out.println("x / y = " + (x / y)); // 몫: 7 / 3 = 2

    // b) 실수형 나눗셈 - 몫
    double xDouble = 7.0;
    double yDouble = 3.0;
    System.out.println("실수 나눗셈 (몫):");
    System.out.println("xDouble / yDouble = " + (xDouble / yDouble)); // 7.0 / 3.0 == 2.3333...

    // 2. 나머지 연산자
    // 나머지 연산자 동작 원리 설명
    System.out.println("나머지 연산자 (%):");
    System.out.println("x % y= " + (x % y)); // 7 % 3 = 1
    System.out.println("나머지 연산자의 원리: x % y는 x를 y로 나누고 남은 나머지를 반환합니다.");
    System.out.println("따라서, 7을 3으로 나누면 몫은 2, 나머지는 1입니다.");

  }


}
