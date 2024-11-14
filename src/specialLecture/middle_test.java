package src.specialLecture;

import java.util.Scanner;





public class middle_test {

  public static void printSpaceStar(int argRow, int argCol, boolean isTrue) {
    for (int i = 0, reverseIndex = argRow - 1; i < argRow; i++, reverseIndex--) {
      for (int j = 0; j < argCol; j++) {
        if (i == j || (j == reverseIndex && isTrue)) {
          System.out.print(' ');
        } else {
          System.out.print('*');
        }
      }
      System.out.println();
    }
  }

  public static void countingStar(int argRow, int argCol) {
    for (int i = 0; i < argRow; i++) {
      for (int j = 0; j < argCol; j++) {
        System.out.print('*');
      }
      System.out.println();
    }
  }
}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 초기값
    int userInput = 0;
    int count = 1;
    int m = 0;
    int n = 0;
    int result = 0;
    boolean check = true;
    
    while (true) {
      if (check) {
        System.out.println(count + "번째 실행");
        System.out.println("1, 2, 3번 게임 고르세요");
        System.out.println("종료하려면 4번 입력");
      }
      userInput = sc.nextInt();

      result = switch (userInput) {
        case 1 -> 1;
        case 2 -> 2;
        case 3 -> 3;
        case 4 -> 4;
        default -> -1;
      };

      if (result == 4) {
        System.out.println("게임 종료");
        break;
      }

      if (1 <= result || result >= 3) {
        break;
      }
      check = false;
      System.out.println("범위 외의 값");

    }

    while(true) {
      // 게임 m,n 값 입력받기


      System.out.println("m, n값을 입력해주세요");

      m = sc.nextInt();
      n = sc.nextInt();

      // 예외 처리
      if (m <= 0 || n <= 0) {
        System.out.println("다시입력");
        continue;
      }

      switch (result) {
        case 1:
          countingStar(m, n);
          break;
        case 2:
          printSpaceStar(m, n, false);
          break;
        case 3:
          printSpaceStar(m, n, true);
          break;
      }

      // 맞는 게임 출력

      // 횠수 체크


    }
}