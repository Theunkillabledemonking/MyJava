package src.specialLecture;

import java.util.Scanner;

public class j_241209 {
  public static void printMenu() {
    System.out.println("===== 빙고 게임 메뉴 =====");
    System.out.println("1. 빙고판 생성");
    System.out.println("2. 숫자별 발생 빈도 분석");
    System.out.println("3. 빙고판 출력");
    System.out.println("4. 종료");
    System.out.print("메뉴 선택: ");
  }

  public static void main(String[] args) {
    // 변수 선언
    Scanner sc = new Scanner(System.in);
    int case1[] = new int[4]; // 유저 입력 값
    int bingoTensor[][][] = null; // 3차원 빙고
    int bingoVector[] = null; // 1차원 빙고
    boolean check4 = true; // 프로그램 루프

    while (check4) {
      // 메뉴 출력
      printMenu();

      // 사용자로부터 값 입력 받기
      int userNum = sc.nextInt();
      switch (userNum) {
        // 1번: 빙고판 생성
        case 1:
          // N 값 입력받기
          while (true) {
            System.out.print("빙고 매트릭스의 N 값을 입력하세요 (3 이상 9 이하 홀수): ");
            int userN = sc.nextInt();
            if (userN < 3 || userN > 9 || userN % 2 == 0) {
              System.out.println("N 값은 3 이상 9 이하 정수 중 홀수 값만 입력 가능합니다.");
              continue;
            }
            case1[0] = userN;
            break;
          }

          // 시작값, 종료값 입력받기
          while (true) {
            System.out.print("난수 범위의 시작값을 입력하세요: ");
            int userFirst = sc.nextInt();
            System.out.print("난수 범위의 종료값을 입력하세요: ");
            int userLast = sc.nextInt();
            if (userLast - userFirst + 1 < case1[0] * case1[0]) {
              System.out.println("종료 값 - 시작 값이 N x N 보다 크거나 같아야 합니다.");
              continue;
            }
            case1[1] = userFirst;
            case1[2] = userLast;
            break;
          }

          // M 값 입력받기
          while (true) {
            System.out.print("작성할 빙고 매트릭스 수 M을 입력하세요 (1 이상 7 이하): ");
            int userM = sc.nextInt();
            if (userM < 1 && userM > 7) {
              System.out.println("M 값은 1 이상 7 이하 양수만 입력 가능합니다.");
              continue;
            }
            case1[3] = userM;
            break;
          }

          // 빙고판 생성
          int indexVector = 0;
          bingoVector = new int[case1[0] * case1[0] * case1[3]];
          bingoTensor = new int[case1[3]][case1[0]][case1[0]];

          // 중복 확인용 배열 초기화
          int totalNumbers = case1[2] - case1[1] + 1;
          boolean[] usedNumbers = new boolean[totalNumbers];

          for (int i = 0; i < case1[3]; i++) {
            for (int j = 0; j < case1[0]; j++) {
              for (int k = 0; k < case1[0]; k++) {
                int randomValue;
                do {
                  randomValue = (int) (Math.random() * totalNumbers) + case1[1];
                } while (usedNumbers[randomValue - case1[1]]); // 중복 확인

                usedNumbers[randomValue - case1[1]] = true; // 사용 처리
                bingoTensor[i][j][k] = randomValue;
                bingoVector[indexVector++] = randomValue;
              }
            }
          }

          System.out.println("빙고 매트릭스가 생성되었습니다.");
          break;

        // 2번: 숫자별 발생 빈도 분석
        case 2:
          if (bingoVector == null) {
            System.out.println("먼저 빙고판을 생성하세요.");
            break;
          }
          int checkNum[] = new int[case1[2] - case1[1] + 1];
          for (int value : bingoVector) {
            checkNum[value - case1[1]]++;
          }

          for (int i = 0; i < checkNum.length; i++) {
            float count = ((float) checkNum[i] / bingoVector.length) * 100;
            System.out.printf("%d: %d회 (%.2f%%) %s%n", case1[1] + i, checkNum[i], count, "*".repeat(checkNum[i]));
          }
          break;

        // 3번: 빙고판 출력
        case 3:
          if (bingoTensor == null) {
            System.out.println("먼저 빙고판을 생성하세요.");
            break;
          }
          for (int i = 0; i < case1[3]; i++) {
            System.out.println("빙고 매트릭스 #" + (i + 1));
            for (int j = 0; j < case1[0]; j++) {
              for (int k = 0; k < case1[0]; k++) {
                System.out.print(bingoTensor[i][j][k] + "\t");
              }
              System.out.println();
            }
            System.out.println();
          }
          break;

        // 4번: 종료
        case 4:
          System.out.println("프로그램을 종료합니다.");
          check4 = false;
          break;

        default:
          System.out.println("잘못된 메뉴 선택입니다.");
      }
    }
    sc.close();
  }
}



