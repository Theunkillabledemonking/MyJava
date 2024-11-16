package src.specialLecture;

import java.util.Scanner;

public class j_241117 {
  // 1번 : 사용자로부터 M, N 정수를 입력 받아, M X N Matrix를 출력하세요
  // 예) M : 3, N : 2
  //   * *
  //   * *
  //   * *
  //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력
  public static void printCountingStar(int m, int n) {
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // 2번: 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력
  // 예) M : 3, N : 3
  //     * *
  //   *   *
  //   * *
  //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력


  // 3번: 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력
  // 예) M : 3, N : 3
  //     *
  //   *   *
  //     *
  //  예외처리 : M과 N이 0 또는 음의 정수인 경우, 재입력
  public static void printCountingSpace(int m, int n, boolean isCheck) {
    for (int i = 0, reverseIndex = m - 1; i < m; i++, reverseIndex--) {
      for (int j = 0; j < n; j++) {
        if (i == j || (j == reverseIndex && isCheck)) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int m = 0;
    int n = 0;
    int menu = 0;

    System.out.println("메뉴를 선택하세요");
    System.out.println("1. M X N Matrix를 출력");
    System.out.println("2. 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력");
    System.out.println("3. 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력");
    System.out.println("4. 종료");

    // 메뉴를 입력 받아 해당 프로그램 실행 후 다시 메뉴 출력
    while (true){
      menu = sc.nextInt();
      if (1 <= menu && menu <= 3) {
        break;
      } else if (menu == 4) {
        return;
      } else {
        System.out.println("다시 입력해주세요");

      }

    }

    // row, col 입력 받기
    while(true) {
      System.out.println("M, N 정수를 입력 해주세요.");
      m = sc.nextInt();
      n = sc.nextInt();
      if (m <= 0 || n <= 0) {
        System.out.println("1이상 값 입력");
        continue;
      }

      // 별 출력
      switch(menu) {
        case 1: printCountingStar(m, n); break;
        case 2: printCountingSpace(m, n, false); break;
        case 3: printCountingSpace(m, n, true); break;
      }

    }
  }
}
