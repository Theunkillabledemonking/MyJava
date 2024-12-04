package specialLecture;

import java.util.*;

public class j_241204 {


  static float[][] newMatrix(float[][] argMatrix) {
    if (argMatrix.length >= 3) {
      System.out.println("새로운 배열 생성");
      float[][] newMatrix = new float[6][6];
      for (int i = 0; i < argMatrix.length; i++) {
        for (int j = 0; j < argMatrix[i].length; j++) {
          newMatrix[i][j] = argMatrix[i][j];
        }
      }
      return newMatrix;
    }
    return argMatrix;
  }


  static void printMenu() { // 메뉴 출력 함수
    System.out.println("메뉴");
    System.out.println("1. 학생 성적 입력");
    System.out.println("2. 입력된 학생 목록 출력");
    System.out.println("3. 학생 삭제하기");
    System.out.println("4. 종료");
    System.out.println("선택 :");
  }

  static void printStd(float[][] argArrays, int argStdNum, String[] argTitles) {
    Scanner sc = new Scanner(System.in);

    if (argStdNum == 0) {
      System.out.println("출력할 수 있는 학생이 없습니다.");
      return;
    }

    for (int i = 0; i < argStdNum; i++) {
      for (int j = 0; j < argArrays[i].length; j++) {
        System.out.print("[" + argTitles[j] + "]:" + argArrays[i][j] + "\t");
      }
      System.out.println();
    }
  }

  static int stdInput(Scanner sc, float[][] argArrays, int argStdNum, String[] schTitles) {
    if (argStdNum >= argArrays.length) {
      argArrays = newMatrix(argArrays);
    }

    for (int i = 0; i < argArrays[argStdNum].length - 2; i++) {
      System.out.print(schTitles[i] + " 입력하세요");
      argArrays[argStdNum][i] = sc.nextInt();
    }
    argArrays[argStdNum][4] = argArrays[argStdNum][1] + argArrays[argStdNum][2] + argArrays[argStdNum][3];
    argArrays[argStdNum][5] = argArrays[argStdNum][4] / 3.0f;

    return ++argStdNum;
  }

  static boolean stdDuplicate(Scanner sc, float[][] argArrays, int argStdNum) {
    System.out.println("덮어쓰기를 희망하십니까? (Y: 덮어쓰기 진행, q: 메뉴로 돌아가기): ");

    while (true) {
      char stdCheck = sc.next().charAt(0);
      if (stdCheck == 'Y') {
        return true;
      } else if (stdCheck == 'q') {
        return false;
      }
      System.out.println("올바른 값 입력해주세요");
    }

  }

  static int deleteFromMatrix(float[][] argMatrix, int argStudent, float studentId) {
    int delIndex = -1;

    for (int i = 0; i < argStudent; i++) {
      if (argMatrix[i][0] == studentId) {
        delIndex = i;
        break;
      }
    }

    if (delIndex == -1) {
      return -1;
    }

    for (int i = delIndex; i < argStudent - 1; i++) {
      for (int j = 0; j < argMatrix[i].length; j++)
        argMatrix[i][j] = argMatrix[i + 1][j];
    }

    // 마지막줄 초기화
    for (int i = 0 ; i < argMatrix[0].length ; i++) {
      argMatrix[argStudent - 1][i] = 0;
    }

    return --argStudent;
  }

  public static void main(String[] args) {
    final int ROW = 3;
    final int COL = 6;
    float[][] stdMatrix = new float[ROW][COL];
    int stdCounts = 0;
    String[] schTitles = { "학번", "국어", "영어", "수학", "합계", "평균" };

    Scanner sc = new Scanner(System.in);

    while (true) {
      printMenu();
      int userSelect = sc.nextInt();
      int result = -1;
      switch (userSelect) {
        case 1:
          result = stdInput(sc, stdMatrix, stdCounts, schTitles);
          if (result > 0) {
            stdCounts = result;
            stdMatrix = newMatrix(stdMatrix);
          }
          break;
        case 2: // 학생 출력
          printStd(stdMatrix, stdCounts, schTitles);
          break;
        case 3: // 학생 삭제
          printStd(stdMatrix, stdCounts, schTitles);
          System.out.println("삭제하려는 학생을 적어주세요. 이전 메뉴 -1 입력");
          while (true) {
            boolean isCheck = false;
            float dltStudent = sc.nextInt();
            result = deleteFromMatrix(stdMatrix, stdCounts, dltStudent);
            if (result > 0) {
              isCheck = true;
              stdCounts = result;
            } else if (result == -1) {
              System.out.println("메뉴로 갑니다");
              break;
            }

            if (isCheck) {
              System.out.println("입력이 완료되었습니다");
              break;
            } else {
              System.out.println("잘못된 입력값입니다.");
            }
          }
          break;


        case 4: // 종료
          System.out.println("시스템을 종료합니다!");
          return;

        default: // 예외처리
          System.out.println("잘못된 입력값입니다.");
      }
    }

  }
}
