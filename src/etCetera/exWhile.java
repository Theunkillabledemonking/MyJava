package src.etCetera;

import java.util.Scanner;

public class exWhile {
  public static void main(String[] args){

    int targetNumber = 7; // 정답 숫자
    int guess = -1;

    Scanner scanner = new Scanner(System.in);

    System.out.println("숫자를 맞춰보세요! (1부터 10부터 사이)");

    while (guess != targetNumber) { // 정답을 맞출 때까지 반복
      System.out.println("추측한 숫자: ");
      guess = scanner.nextInt();

      if (guess != targetNumber) {
        System.out.println("틀렸습니다. 다시 시도해보세요");
      }
    }

    System.out.println("정답입니다!");
    scanner.close();
  }


}
