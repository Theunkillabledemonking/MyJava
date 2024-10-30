package Lab;

import java.util.Scanner;

public class Lab4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 나이 입력, int 저장
    System.out.print("나이를 입력하세요: ");
    int age = sc.nextInt();

    // 몸무게를 입력받고, double 형 변수 저장
    System.out.print("몸무게를 입력하세요: ");
    double kg = sc.nextDouble();

    // 나이를 double로 명시적 형변환하여 몸무게와 더한 결과 출력
    System.out.printf("나이를 double로 변환한 후 몸무게와 더한 결과 :%.2f\n" , (double)(age) + kg);

    // 몸무게를 int로 명시적 형변환하여 나이와 더한 결과를 출력
    System.out.printf("몸무게를 int로 변환한 후 나이와 더한 결과 :%d\n" , (int)(kg) + age);
  }
}
