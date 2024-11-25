package src.specialLecture;
import java.io.FileOutputStream;
import java.util.Scanner;

public class j_241125 {
  static void printArray(float[][] argMartrix, int student) {
    for (int i = 0; i < student; i++) {
      System.out.print("[학번: " + (int) argMartrix[i][0] + "] " +
          "국어: " + argMartrix[i][1] + ", " +
          "영어: " + argMartrix[i][2] + ", " +
          "수학: " + argMartrix[i][3] + ", " +
          "합계: " + argMartrix[i][4] + ", " +
          "평균: " + argMartrix[i][5]);
      System.out.println(" ");
    }
  }
  public static void main(String[] args) {
    final int ROW = 3;
    final int COL = 6;
    Scanner sc = new Scanner(System.in);

    int userNum = 0;
    float gradeNum = 0;
    float krNum = 0;
    float engNum = 0;
    float mathNum = 0;
    float sum = 0;
    int student = 0;
    int deleteStudent = 0;

    float[][] array = new float[ROW][COL];
    // 3X6 2차원 배열 생성

    // 합계 : 인덱스 1~3

    //
    while(true) {
      // 메뉴 출력
      System.out.println("메뉴");
      System.out.println("1. 학생 성적 입력");
      System.out.println("2. 입력된 학생 목록 출력");
      System.out.println("3. 학생 삭제하기");
      System.out.println("4. 종료");
      System.out.println("선택 :");
      int userInput = sc.nextInt();

      switch(userInput) {
        // 1. 학생 성적 입력
        case 1:

          if (student >= ROW) {
            System.out.println("더 이상 학생을 입력할 수 없습니다.");
            break;
          }

          System.out.print("학번을 입력하세요.");
          gradeNum = sc.nextFloat();
          System.out.print("\n국어 성적: ");
          krNum = sc.nextFloat();
          System.out.print("\n영어 성적: ");
          engNum = sc.nextFloat();
          System.out.print("\n수학 성적: ");
          mathNum = sc.nextFloat();
          System.out.println("입력이 완료되었습니다!");
          array[student][0] = gradeNum;
          array[student][1] = krNum;
          array[student][2] = engNum;
          array[student][3] = mathNum;

          // 합계값 평균값 계산
          array[student][4] += krNum + engNum + mathNum;
          array[student][5] += array[student][4] / 3;

          // 학생 수 추가
          student ++;
          System.out.println("입력이 완료되었습니다!");
          break;

        // 2. 입력된 학생 목록 출력
        case 2:
          if (student == 0) {
            System.out.println("입력된 학생이 없습니다.");
          } else {
            System.out.println("학생 목록:");
            printArray(array, student);
          }
          break;

        // 3. 학생 삭제
        case 3:
          if (student == 0) {
            System.out.println("삭제할 학생이 없습니다.");
            break;
          }

          System.out.println("학생 목록");
          printArray(array, student);

          System.out.println("삭제할 학생의 학번을 입력하세요 (-1: 이전 메뉴로)");
          deleteStudent = sc.nextInt();
          if (deleteStudent == -1) {
            break;
          }
          boolean found = false;
          // 삭제할 입력값 같을 때 삭제
          for (int i = 0; i < array.length - 1; i++) {
            if (array[i][0] == deleteStudent) {
              found = true;
              for (int j = i; j < student; j++) {
                array[j] = array[j + 1];
              }
              student --;
              System.out.println("학생이 삭제되었습니다.");
              break;
              }
            }

          if (!found) {
            System.out.println("해당 학번을 가진 학생이 없습니다.");
          }
          break;

        // 4. 종료
        case 4:
          // 시스템 종료
          System.out.println("시스템을 종료합니다.");
          return;

        default :
          System.out.println("잘못된 입력입니다. 다시 선택해주세요");



      }

    }
  }
}

