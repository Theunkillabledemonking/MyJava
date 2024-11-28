package specialLecture;

import java.util.Scanner;

public class j_241125 {
  static void printArray(float[][] argMartrix, int student) {
    for (int i = 0; i < student; i++) {
      System.out.print("[학번: " + (int) argMartrix[i][0] + "] " +
              "국어: " + argMartrix[i][1] + ", " +
              "영어: " + argMartrix[i][2] + ", " +
              "수학: " + argMartrix[i][3] + ", " +
              "합계: " + argMartrix[i][4] + ", "+
              "평균: " + argMartrix[i][5]);
      System.out.println(" ");
    }
  }

  public static void main(String[] args) {
    final int ROW = 3;
    final int COL = 6;
    Scanner sc = new Scanner(System.in);

<<<<<<< HEAD
    int userNum = 0;
    float gradeNum = 0;
    float krNum = 0;
    float engNum = 0;
    float mathNum = 0;
    float sum = 0;
    int student = 0;
    float deleteStudent = 0;
=======
    int numOfStudent = 0;
    int delStdId = 0;
>>>>>>> 3f480c2b04159a79b55e1202d582908a9a798196

    // 3 reference 생성
    float[][] stdMatrix = new float[ROW][];

    while (true) {
      // 메뉴 출력
      System.out.println("메뉴");
      System.out.println("1. 학생 성적 입력");
      System.out.println("2. 입력된 학생 목록 출력");
      System.out.println("3. 학생 삭제하기");
      System.out.println("4. 종료");
      System.out.println("선택 :");
      int userInput = sc.nextInt();

      switch (userInput) {
        // 1. 학생 성적 입력
        case 1:
          if (numOfStudent >= ROW) {
            System.out.println("학생 수가 꽉 찼습니다.");
            break;
          }

          stdMatrix[numOfStudent] = new float[COL];
          System.out.print("학번을 입력하세요.");
          stdMatrix[numOfStudent][0] = sc.nextFloat();
          System.out.print("\n국어 성적: ");
          stdMatrix[numOfStudent][1] = sc.nextFloat();
          System.out.print("\n영어 성적: ");
          stdMatrix[numOfStudent][2] = sc.nextFloat();
          System.out.print("\n수학 성적: ");
<<<<<<< HEAD
          mathNum = sc.nextFloat();
          array[student][0] = gradeNum;
          array[student][1] = krNum;
          array[student][2] = engNum;
          array[student][3] = mathNum;
=======
          stdMatrix[numOfStudent][3] = sc.nextFloat();
          System.out.println("입력이 완료되었습니다!");
>>>>>>> 3f480c2b04159a79b55e1202d582908a9a798196

          // 합계값 평균값 계산
          stdMatrix[numOfStudent][4] += stdMatrix[numOfStudent][1] + stdMatrix[numOfStudent][2]
                  + stdMatrix[numOfStudent][3];
          stdMatrix[numOfStudent][5] += stdMatrix[numOfStudent][4] / 3;

          // 학생 수 추가
          numOfStudent++;
          break;

        // 2. 입력된 학생 목록 출력
        case 2:
          // 학생이 없을 시에
          if (numOfStudent == 0) {
            System.out.println("불러 올 수 있는 학생이 없습니다.");
            break;
          }

          System.out.println("학생 목록:");
          printArray(stdMatrix, numOfStudent);
          break;

        // 3. 학생 삭제
        case 3:
          // 삭제할 학생이 없을 시에
          if (numOfStudent == 0) {
            System.out.println("삭제를 할 수 있는 학생이 없습니다.");
            break;
          }

          System.out.println("학생 목록");
          printArray(stdMatrix, numOfStudent);
          System.out.println("삭제할 학생의 학번을 입력하세요 (-1: 이전 메뉴로)");
<<<<<<< HEAD
          deleteStudent = sc.nextFloat();
          if (deleteStudent == -1) {
            break;
          }
          boolean found = false;
          // 삭제할 입력값 같을 때 삭제
          for (int i = 0; i < student; i++) {
            if (array[i][0] == deleteStudent) {
              found = true;
              for (int j = i; j < student - 1; j++) {
                array[j] = array[j + 1];
              }
              //마지막 학생 데이터 초기화
              array[student - 1] = new float[COL];
              student --;
              System.out.println("학생이 삭제되었습니다.");
=======

          while (true) {
            delStdId = sc.nextInt();
            if (delStdId == -1) {
              System.out.println("메뉴로 돌아갑니다.");
>>>>>>> 3f480c2b04159a79b55e1202d582908a9a798196
              break;
            }

            boolean isCount = false;
            for (int i = 0; i < numOfStudent; i++) {
              if (stdMatrix[i][0] == delStdId) {
                isCount = true;
                // 해당 i 크기만큼 학생 수 -1 만큼 반복
                for (int j = i; j < numOfStudent - 1; j++) {
                  // 옆으로 한 칸씩 가져오기
                  stdMatrix[j] = stdMatrix[j + 1];
                }
                // 마지막 칸 null
                stdMatrix[numOfStudent - 1] = null;
                numOfStudent--;
              }
            }

            // 학생 번호 맞을 시 탈출
            if (isCount) {
              System.out.println("삭제가 완료되었습니다.");
              break;
            } else { // 아닐시에 무한 반복
              System.out.println("값이 없다");
            }
          }
          break;

        // 4. 종료
        case 4:
          // 시스템 종료
          System.out.println("시스템을 종료합니다.");
          return;

        default:
          System.out.println("잘못된 입력입니다. 다시 선택해주세요");

      }

    }
  }
}
