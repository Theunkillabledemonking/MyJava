public class Lab3 {
  public static void main(String[] args) {
    // 원의 반지름을 double 타입 변수 선언 후 값을 5.0으로 초기화
    double radius = 5.0;
    // 원주율을 상수로 선언 후 값을 3.14159로 초기화
    final double pi = 3.14159;
    // 반지름과 원쥬율 사용하여 원의 면적
    System.out.printf("원의 면적: %.2f", pi * (radius * radius));
  }
}
