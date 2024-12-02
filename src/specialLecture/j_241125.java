package specialLecture;

import java.util.ArrayList;
import java.util.Scanner;

public class j_241125 {
  static void printArray(ArrayList<float[]> stdMatrix) {
    for (float[] student : stdMatrix) {
      System.out.printf("[학번: %d] 국어: %.1f, 영어: %.1f, 수학: %.1f, 합계: %.1f, 평균: %.1f%n",
          (int) student[0], student[1], student[2], student[3], student[4], student[5]);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<float[]> stdMatrix = new ArrayList<>();

    while (true) {
      System.out.println("\n메뉴");
      System.out.println("1. 학생 성적 입력");
      System.out.println("2. 입력된 학생 목록 출력");
      System.out.println("3. 학생 삭제하기");
      System.out.println("4. 종료");
      System.out.print("선택: ");
      int userInput = sc.nextInt();

      switch (userInput) {
        case 1: // 학생 성적 입력
          float[] student = new float[6];
          System.out.print("학번을 입력하세요: ");
          student[0] = sc.nextFloat();
          System.out.print("국어 성적: ");
          student[1] = sc.nextFloat();
          System.out.print("영어 성적: ");
          student[2] = sc.nextFloat();
          System.out.print("수학 성적: ");
          student[3] = sc.nextFloat();

          // 합계 및 평균 계산
          student[4] = student[1] + student[2] + student[3];
          student[5] = student[4] / 3;

          stdMatrix.add(student);
          System.out.println("학생 성적이 입력되었습니다!");
          break;

        case 2: // 입력된 학생 목록 출력
          if (stdMatrix.isEmpty()) {
            System.out.println("입력된 학생이 없습니다.");
          } else {
            System.out.println("\n학생 목록:");
            printArray(stdMatrix);
          }
          break;

        case 3: // 학생 삭제
          if (stdMatrix.isEmpty()) {
            System.out.println("삭제할 학생이 없습니다.");
            break;
          }

          System.out.println("\n학생 목록:");
          printArray(stdMatrix);
          System.out.print("삭제할 학생의 학번을 입력하세요 (-1: 이전 메뉴로): ");
          int delStdId = sc.nextInt();

          if (delStdId == -1) {
            System.out.println("이전 메뉴로 돌아갑니다.");
            break;
          }

          boolean found = false;
          for (int i = 0; i < stdMatrix.size(); i++) {
            if ((int) stdMatrix.get(i)[0] == delStdId) {
              stdMatrix.remove(i);
              found = true;
              System.out.println("학생이 삭제되었습니다.");
              break;
            }
          }

          if (!found) {
            System.out.println("해당 학번의 학생이 없습니다.");
          }
          break;

        case 4: // 종료
          System.out.println("시스템을 종료합니다.");
          sc.close();
          return;

        default:
          System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
      }
    }
  }
}
