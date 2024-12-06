package src.specialLecture;

import java.util.Scanner;

public class j_241206 {
  // 메뉴 출력 메서드
  static void printMenu(){
    System.out.println("메뉴");
    System.out.println("1. 학생 성적 입력");
    System.out.println("2. 입력된 학생 목록 출력");
    System.out.println("3, 학생 삭제하기");
    System.out.println("4. 종료");
    System.out.print("선택: ");
  }

  // 배열 확장 메서드
  static float[][] createMatrix(float[][] argMatrix, int argStudent) {
    if (argStudent >= argMatrix.length) {
      System.out.println("확장되었습니다");
      float[][] newMatrix = new float[argMatrix.length * 2][argMatrix[0].length];

      // 기존데이터를 새 배열에 복사
      for (int i = 0; i <argMatrix.length; i++) {
        for (int j = 0; j < argMatrix[i].length; j++) {
          newMatrix[i][j] = argMatrix[i][j];
        }
      }
      return newMatrix;
    }
    return argMatrix;
  }

  // 학점 중복 여부 체크
  static boolean isDuplicateID(float[][] argMatrix, int studentCount, float newID) {
    for (int i = 0; i < studentCount; i++) {
      if (argMatrix[i][0] == newID) {
        return true; //중복 학번 존재
      }
    }
    return false; //중복아님
  }

  // 학생 출력 메서드
  static void printStudentList(float[][] argMatrix, int argStudent, String[] argTitles){
    for (int i = 0; i < argStudent; i++) {
      for (int j = 0; j < argMatrix[i].length; j++) {
        System.out.print(argTitles[j] + ": " + argMatrix[i][j] + ", ");
      }
      System.out.println();
    }
  }

  // 학생 입력 메서드
  static int inputStudent(Scanner sc, float[][] argMatrix, int argStudent, String[] argTitles) {
    // 배열 확장
    argMatrix = createMatrix(argMatrix, argStudent);

    System.out.println("학번을 입력해주세요: ");
    float newID = sc.nextFloat();

    if (isDuplicateID(argMatrix, argStudent, newID)) {
      System.out.println("중복된 학번이 존재합니다. 다시 입력해주세요");
      return argStudent;
    }

    for (int i = 1; i < argTitles.length - 2; i++) {
      System.out.print(argTitles[i] + "성적: ");
      argMatrix[argStudent][i] = sc.nextFloat();
    }
    argMatrix[argStudent][4] = argMatrix[argStudent][1] + argMatrix[argStudent][2] + argMatrix[argStudent][3];
    argMatrix[argStudent][5] = argMatrix[argStudent][4] / 3.0f;

    System.out.println("입력이 완료되었습니다.");

    return argStudent+=1;
  }

  // 학생 삭제 메서드
  public static int deleteStudent(float[][] argMatrix, int argStudent, float argNum) {

    // 학번 탐색
    for (int i = 0; i < argMatrix.length; i++) {
      if (argMatrix[i][0] == argNum) {
        for (int j = i; j < argStudent - 1; j++) {
          argMatrix[j] = argMatrix[j + 1];
        }
        argMatrix[argStudent - 1] = null;

        System.out.println("삭제가 완료되었습니다.");
        return argStudent - 1;
      }
    }
    System.out.println("해당 학번이 존재 하지 않습니다. 다시 입력해주세요");
    return argStudent;

  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int ROW = 3;
    final int COL = 6;
    int studentCount = 0;
    float[][] stdMatrix = new float[ROW][COL];
    String[] stdTitles = {"학번", "국어", "영어", "수학", "합계", "평균"};
    int userSelect = 0;

    while(true) {
      printMenu();
      userSelect = sc.nextInt();
      int result = 0;
      switch (userSelect){
        case 1: // 학생 입력
          studentCount = inputStudent(sc, stdMatrix, studentCount, stdTitles);
            break;

        case 2:
          // 학생 출력
          if (studentCount <= 0) {
            System.out.println("출력할 학생이 없습니다.");
            break;
          } else {
            printStudentList(stdMatrix, studentCount, stdTitles);
          }

          break;

        case 3:
          // 학생 삭제
          float deleteNum = 0;
          if (studentCount <= 0) {
            System.out.println("삭제할 학생이 없습니다.");
            break;
          } else {
            printStudentList(stdMatrix, studentCount, stdTitles);
            float deleteID = sc.nextFloat();
            if (deleteID != -1) {
              studentCount = deleteStudent(stdMatrix, studentCount, deleteID);
            }
          }
          break;

        case 4:
          System.out.println("시스템을 종료합니다");
          sc.close();
          return;

        default:
          System.out.println("잘못된 입력값입니다.");

      }


    }
  }
}
