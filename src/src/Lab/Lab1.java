package Lab;

import java.util.Scanner;

public class Lab1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // 첫번째 값 : 나이 (정수)
    System.out.print("나이를 입력하세요: ");
    int age = scanner.nextInt();

    // 두번째 값 : 키 (실수)
    System.out.print("키를 입력하세요: ");
    float height = scanner.nextFloat();

    // 세번째 값 : 신용점수 (정수)
    System.out.print("신용점수를 입력하세요: ");
    int creditScore = scanner.nextInt();

    System.out.println("합계: " + (age + height + creditScore));
    System.out.printf("평균: %.2f\n", (age + height + creditScore) / 3);

  }

}
