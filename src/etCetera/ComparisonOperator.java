package etCetera;

public class ComparisonOperator {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    // 1. 같다 (==)
    System.out.println("a == b " + (a == b)); // false, a와 b는 다름

    // 2. 같지 않다 (!=)
    System.out.println("a != b " + (a != b)); // true, a와 b는 다름

    // 3. 크다 (>)
    System.out.println("a > b " + (a > b)); // false, a는 b보다 크지 않음

    //4. 작단 (<)
    System.out.println("a < b " + (a < b)); // true, a는 b보다 작지 않음

    // 5. 크거나 같다 (>=)
    System.out.println("a >= b " + (a >= b)); //false, a는 b보다 크지 않음

    // 6. 작거나 같다 (<=)
    System.out.println("a <= b " + (a <= b)); // ture, a는 b보다 작거나 같음

    // 7. 조건문에서 비교 연산자 사용
    if (a < b) {
      System.out.println("a는 b보다 작습니다.");
    } else {
      System.out.println("a는 b보다 크거나 같습니다.");
    }
  }
}
