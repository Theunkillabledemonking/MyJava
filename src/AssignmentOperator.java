public class AssignmentOperator {
  public static void main(String[] args) {
    // 기본 대입 연산자 사용
    int a = 5; // 'a'에 5 대입
    System.out.println("a =" + a); // 출력 : a = 5

    // 대입 연산자는 연산 우선순위에서 가장 낮음
    // 우변의 계산이 먼저 처리되고 그 결과가 좌변에 대입된다.
    int b = 10;
    int c = 20;
    int d = b + c; // b + c 먼저 계산 (결과는 30), 그 후 d에 30 대입
    System.out.println("d = " + d); // 출력: d = 30

    // 이향 연산으로 좌변과 우변이 존재해야 함
    int x = 50;
    int y = 100;
    x = y; // x에 y의 값을 대입 (x는 100이 됨)
    System.out.println("x = " + x); // 출력: x = 100

    // 자료형이 일치하지 않을 때, 자동 형 변환이 발생
    double pi = 3.14159;
    int truncatedPi = (int)pi; // 실수 pi를 정수로 변환 후 truncatedPi에 대입
    System.out.println("truncatedPi = " + truncatedPi);

    // 암시적 형 변환 예시
    double result = a + pi; // a는 정수, pi는 정수 -> 정수가 실수로 변환된 후 더해짐
    System.out.println("result = " + result); // 출력: result = 8.14159

  }
}
