package etCetera;

public class AssignmentOperator2 {
  public static void main(String[] args) {
    // 초기 변수 설정
    int a = 10;
    int b = 5;

    // += 복합 대입 연산자: a에 5를 더한 후 다시 a에 저장
    a += b; // a = a + b; 와 동일 (10 + 5 = 15)
    System.out.println("a += b -> a = " + a); // 출력: a = 15

    // -= 복합 대입 연산자: a에서 3를 뺀 후 다시 a에 저장
    a -= 3; // a = a - 3; 와 동일 (15 - 3 = 12)
    System.out.println("a -= 3 -> a = " + a); // 출력: a = 12

    // *= 복합 대입 연산자: a에 2를 곱한 후 다시 a에 저장
    a *= 2; // a = a * 2; 와 동일 (12 * 2 = 24)
    System.out.println("a *= 2 -> a = " + a); // 출력: a = 24

    // /= 복합 대입 연산자: a를 4로 나눈 후 다시 a에 저장
    a /= 4; // a = a / 4; 와 동일 (24 / 4 = 6)
    System.out.println("a /= 4 -> a = " + a); // 출력: a = 6

    // %= 복합 대입 연산자: a를 5로 나눈 나머지를 a에 저장
    a %= 5; // a = a % 5; 와 동일 (6 % 5 = 1)
    System.out.println("a %= 5 -> a = " + a); // 출력: a = 1

  }
}
