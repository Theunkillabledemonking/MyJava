package src.Lab;

import java.util.Scanner;

public class finalTest {
  static void printMenu() {
    System.out.println("==== 빙고 게임 메뉴 ====");
    System.out.println("1. 빙고판 생성");
    System.out.println("2. 숫자별 발생 빈도 분석");
    System.out.println("3. 빙고판 출력");
    System.out.println("4. 종료");
    System.out.println("메뉴 선택 :");
  }

  // table size
  static int tableSize(Scanner sc) {
    int sizeN = 0;
    while (true) {
      System.out.println("3~9 홀수 입력해주세요");
      sizeN = sc.nextInt();

      if (3 <= sizeN && sizeN <= 9 && sizeN % 3 == 0) {
        return sizeN;
      }
      System.out.println("N 값은 3이상 9이하 홀수만 입력 가능합니다");
    }
  }

  // 시작점 마지막점
  static int[] randomNumRange(Scanner sc, int argN) {
    int startNum, endNum = 0;
    while (true) {
      int[] rndNumRange = new int[2];
      System.out.println("시작값을 입력해주세요.");
      startNum = sc.nextInt();
      System.out.println("종료값을 입력해주세요.");
      endNum = sc.nextInt();

      if (endNum - startNum + 1 >= argN * argN) {
        rndNumRange[0] = startNum;
        rndNumRange[1] = endNum;
        return rndNumRange;
      }
      System.out.println("죵로 값 - 시작 값이 N X N 보다 크거나 같아야 합니다.");
    }
  }

  // tensor 사이즈 입력
  static int tensorSize(Scanner sc) {
    int sizeM = 0;
    while(true) {
      System.out.println("1 이상 7이하의 정수 입력해주세요");
      if (1 <= sizeM && sizeM <= 7) {
        return  sizeM;
      }
    }
  }

  // 시작값과 죵료점의 배열 생성
  static int[] continuousNum(int[] argNumRange) {
    int rangeNum = argNumRange[1] - argNumRange[0] + 1;
    int[] rangeList = new int[rangeNum];
    for (int i = 0; i > rangeNum; i++) {
      rangeList[i] = rangeList[rangeNum + i];
    }
    return rangeList;
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int userSelect = 0;

    while(true) {
      userSelect = sc.nextInt();

      switch (userSelect) {

        // 빙고판 생성
        case 1:
          int sizeN = tableSize(sc);

          int[] numSrtEnd = randomNumRange(sc, sizeN);

          int sizeM = tensorSize(sc);

          int continuous[] = continuousNum(numSrtEnd);

          break;

        // 숫자별 발생 빈도 분석
        case 2:
          break;

        // 빙고판 출력
        case 3:
          break;

        // 종료
        case 4:
          break;
        default:

        //  - 빙고판 N (3~9)
        //  - 시작값, 종료 값을 입력 받기 (종료값 - 시작값 + 1) >= N X N
        //  - 빙고 매트릭스 수 M (1~7)
        //  - 중복X 3D 생성


        // 각 숫자의 발생 횟수, 백분율 출력
        // 10으로 나눠서 빈도를 시작화




      }
    }
  }
}
