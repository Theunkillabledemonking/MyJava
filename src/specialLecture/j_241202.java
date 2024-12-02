package src.specialLecture;

import java.util.*;

public class j_241202 {

  static void prtStudentList(int argStudent, String[] argSubject, float[][] argMatrix) {
    if (argStudent <= 0) {
      System.out.println("출력 할 학생이 없습니다.");
      return;
    }
    for (int i = 0 ; i < argStudent; i++) {
      for (int j = 0; j < argMatrix[i].length; j++) {
        System.out.print(argSubject[j] + ":" + argMatrix[i][j] + "\t");
      }
      System.out.println();
    }
  }

  static void printMenu() {
    System.out.println("메뉴");
    System.out.println("1. 학생 성적 입력");
    System.out.println("2. 입력된 학생 목록 출력");
    System.out.println("3. 학생 삭제하기");
    System.out.println("4. 종료");
    System.out.println("선택: ");
  }

static int addStudent(int argStudent, String[] argSubject, float[][] argMatrix) {
  Scanner sc = new Scanner(System.in);

  // 1. 배열 크기 확장
  if (argStudent >= argMatrix.length) {
    argMatrix = expandMatrix(argMatrix, 6);
  }

  // 2. 학번 입력 및 중복 처리
  System.out.print("학번을 입력하세요:");
  float studentId = sc.nextFloat();

  int existingIndex = findStudentById(studentId, argMatrix, argStudent);
  if (existingIndex != -1) { // 중복 학번 존재
    if (!handleOverwrite(sc, existingIndex, argSubject, argMatrix)) {
      return argStudent; // 덮어쓰지 않으면 학생 수 변화 없음
    }
  } else {
    argMatrix[argStudent][0] = studentId;
  }

  // 3. 성적 입력
  inputGrades(argMatrix, argStudent, argSubject, sc);

  return existingIndex == -1 ? ++argStudent : argStudent;
}

static float[][] expandMatrix(float[][] oldMatrix, int newSize) {
    System.out.println("배열이 확장되었습니다. 새로운 크기: " + newSize + "행");
    float[][] newMatirx = new float[newSize][6];
    for (int i = 0; i < oldMatrix.length; i++) {
      for (int j = 0; j < 6; j++) {
        newMatirx[i][j] = oldMatrix[i][j];
      }
    }
    return  newMatirx;
}

static int findStudentById(float studentId, float[][] argMatrix, int argStudent) {
    for (int i = 0; i < argStudent; i++) {
      if (argMatrix[i][0] == studentId) {
        return i; //중복 학번의 인덱스 반환
      }
    }
    return -1; // 중복 없음
}

static boolean handleOverwrite(Scanner sc, int index, String[] argSubject, float[][] argMatrix) {
    System.out.println("덮어쓰기를 희망합니까? (Y: 덮어쓰기 진행), q:메뉴로 가기): ");
    char overwriteChoice = sc.next().charAt(0);
    if (overwriteChoice == 'Y') {
      inputGrades(argMatrix, index, argSubject, sc);
      return true;
    } else if (overwriteChoice == 'Q') {
      System.out.println("입력이 취소되었습니다. 메뉴로 돌아갑니다.");
    }
    return false;
}

static void inputGrades(float[][] argMatrix, int studentIndex, String[] argSubject, Scanner sc) {
    for (int i = 1; i < argMatrix[studentIndex].length - 2; i++) {
      System.out.print(argSubject[i] + "입력하세요: ");
      argMatrix[studentIndex][i] = sc.nextFloat();
    }
  argMatrix[studentIndex][4] = argMatrix[studentIndex][1] + argMatrix[studentIndex][2] + argMatrix[studentIndex][3];
  argMatrix[studentIndex][5] = argMatrix[studentIndex][4] / 3.0f;
  System.out.println("입력이 완료되었습니다.");
}

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int ROW = 3;
    final int COL = 6;

    int stdCount = 0;
    int userInput = -1;
    float[][] stdMatrix = new float[ROW][COL];
    String[] stdSubject = {"학번", "국어", "영어", "수학", "합계", "평균"};

    while(true) {
      printMenu();
      userInput = sc.nextInt();
      int result = -1;
      switch(userInput) {

        // 1. 학생 성적 입력
        case 1:
          result = addStudent(stdCount, stdSubject, stdMatrix);
          if (result > 0) {
            stdCount = result;
          } else {
            System.out.println("학생 성적 오류");
          }
          break;
        // 초기 배열 필드는 3행 6열로 설정
        // 배열필드 학번, 국어, 영어, 수학, 합계, 평균

        // 입력 데이터 초과 시 배열 확장
        // 현재 배열 크기를 2배로 확장
        // 확장 시, 기존 데이터를 새 배열로 복사하여 유지
        // 확장이 완료되면, "배열이 확장되었습니다. 새로운 크기: xx행" 메세지 출력

        // 중복 학번이 검증 덮어쓰기 or 메뉴로 돌아가기


        // 2. 입력된 학생 목록 출력
        case 2:
          if (stdCount == 0) {
            System.out.println("입력된 학생 정보 없습니다.");
          } else {
            prtStudentList(stdCount, stdSubject, stdMatrix);
          }
          break;


        // 3. 학생 삭제
        case 3:
          if (stdCount == 0) {
            System.out.println("삭제할 학생 정보가 없습니다");
          } else {
            prtStudentList(stdCount, stdSubject, stdMatrix);
          }
          break;

        // 4. 종료
        case 4:
          return;

        default :
          System.out.println("잘못된 값입니다.");
      }


    }
  }
}

