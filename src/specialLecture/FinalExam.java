package src.specialLecture;
import java.util.*;

public class FinalExam {
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int tensor = 2;
    int userInput = 0;
    // 초기값 배열
    int[][][] tensorArray = new int[tensor][0][0];
    int[][] numCase = new int[tensor][4];
    int id = 0;
    int row = 0;
    int col = 0;
    int count = 0;
    int delSelectNum = 0;

    while (true) {

      // 메뉴 출력 (1 이상 5 이하 값)
      System.out.println("==== 메뉴 ====");
      System.out.println("현재 매트릭스 수 ");
      System.out.println("1. 매트릭스 생성");
      System.out.println("2. 생성된 매트릭스 출력");
      System.out.println("3. 2차원 배열로 변환 후 출력");
      System.out.println("4. 매트릭스 삭제");
      System.out.println("5. 종료");
      System.out.println("메뉴 선택: ");
      userInput = sc.nextInt();

      switch (userInput) {
        // 1. 매트릭스 생성
        case 1:
          while (true) {

            // 카운트 수가 길이보다 길 경우 두배로 늘림
            if (count >= tensorArray.length) {
              int[][][] tensorNew = new int[tensorArray.length * 2][][];

              // 배열 복사
              for (int i = 0; i < tensorArray.length; i++) {
                for (int j = 0; j < tensorArray[i].length; j++) {
                  for (int k = 0; k < tensorArray[i][j].length; k++) {
                    tensorNew[i] = new int[tensorArray[i].length][tensorArray[i][j].length];
                  }
                }
              }

              // 데이터 덮어쒸우기
              for (int i = 0; i < tensorArray.length; i++) {
                for (int j = 0; j < tensorArray[i].length; j++) {
                  for (int k = 0; k < tensorArray[i][j].length; k++) {
                    tensorNew[i][j][k] = tensorArray[i][j][k];
                  }
                }
              }

              // 참조로 연결시키기
              tensorArray = tensorNew;

              // caseNum 2배로 늘리기
              if (count >= numCase.length) {
                int[][] numCaseNew = new int[numCase.length * 2][4];

                // 데이터 덮어 쒸우기
                for (int i = 0; i < numCase.length; i++) {
                  for (int j = 0; j < numCase[i].length; j++) {
                    numCaseNew[i][j] = numCase[i][j];
                  }
                }
                // 참조시키기
                numCase = numCaseNew;
              }

            }

            // row, col 수 입력 (1 이상 10 이하 값)
            System.out.print("매트릭스의 행(row) 수를 입력하세요. (1~10)");
            row = sc.nextInt();
            System.out.print("매트릭스의 열(col) 수를 입력하세요. (1~10)");
            col = sc.nextInt();
            if (1 <= row && row <= 10 && 1 <= col && col <= 10) {
              break;
            }
            System.out.println("행과 열 값을 다시 입력해주세요");
          }

          tensorArray[id] = new int[row][col];
          // 추가 설정 숫자
          int totalNum = (id + 1) * 10;

          int numConut = 0;
          for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
              tensorArray[id][i][j] = totalNum++;
              numConut++;
            }
          }
          tensorArray[id][0][0] = id + 1;
          System.out.println("매트릭스 (ID: " + (id + 1) + ")가 생성되었습니다");

          // 2차원 배열에 id, row, col, 원소 개수 정보 set
          numCase[id][0] = (id + 1);
          numCase[id][1] = row;
          numCase[id][2] = col;
          numCase[id][3] = numConut;

          count++;
          id++;
          break;

        // 2. 생성된 매트릭스 출력
        case 2:
          if (tensorArray != null) {
            for (int i = 0; i < count; i++) {
              System.out.println("매트릭스 (ID:" + (i + 1) + "): ");
              for (int j = 0; j < tensorArray[i].length; j++) {
                for (int k = 0; k < tensorArray[i][j].length; k++) {
                  System.out.print(tensorArray[i][j][k] + " ");
                }
                System.out.println();
              }
              System.out.println();
            }
          } else {
            System.out.println("배열이 생성이 되지 않았습니다.");
          }
          break;
        // ID를 이용해서 출력

        // 3. 2차원 배열로 변환 후 출력
        case 3:
          // 2차원 배열을 이용해서 카피

          // 행 + 열 총합 변수
          int rowCount = 0;
          int colCount = 0;

          for (int i = 0; i < tensorArray.length; i++) {
            for (int j = 0; j < tensorArray[i].length; j++) {
              rowCount++;
              for (int k = 0; k < tensorArray[i][j].length; k++) {
                colCount++;
              }
            }
          }

          // 행에 맞는 변수 생성
          int[][] totalArray = new int[rowCount][colCount];
          // 문제점 3차원을 2차원으로 옮길려하니까 k의 값이 변경됨에 따라 값이 달라짐
          // k 값마다 다르게 출력되게 변경
          System.out.println("2차원으로 변환된 매트릭스 :");
          for (int k = 0; k < tensorArray.length; k++) {
            for (int i = 0; i < tensorArray[k].length; i++) {
              for (int j = 0; j < tensorArray[k][i].length; j++) {
                totalArray[i][j] = tensorArray[k][i][j];
                System.out.print(totalArray[i][j] + " ");
              }
              System.out.println();
            }
          }
          break;

        // 4. 매트릭스 삭제
        case 4:
          // 전체 목록 불러오기
          System.out.println("현재 생성된 매트릭스 목록");
          for (int i = 0; i < count; i++) {
            System.out.printf("매트릭스 ID:%d , 행(row): %d, 열(col): %d, 총 원소 개수: %d", numCase[i][0], numCase[i][1],
                numCase[i][2], numCase[i][3]);
            System.out.println();

          }

          // 매트릭스 삭제 입력
          System.out.print("삭제할 매트릭스의 ID를 입력하세요:");

          while (true) {
            delSelectNum = sc.nextInt();
            for (int i = 0; i < numCase.length; i++) {
              if (numCase[i][0] != delSelectNum) {
                System.out.println("잘못된 매트릭스 ID입니다. 다시 입력하세요");
              }
            }
            break;
          }

          // 삭제한 기준 배열으로 한칸씩 가져오기
          for (int i = delSelectNum - 1; i < tensorArray.length - 1; i++) {
            tensorArray[i] = tensorArray[i + 1];
          }

          // 남은 뒷칸 지우기
          tensorArray[count - 1] = null;

          // case도 정리
          for (int i = delSelectNum - 1; i < numCase.length - 1; i++) {
            numCase[i] = numCase[i + 1];
          }

          // 남은 뒷칸 지우기
          numCase[count - 1] = null;
          count--;
          break;

        // 5. 종료
        case 5:
          System.out.println("종료합니다");
          return;

        // 예외 처리
        default:
          System.out.println("잘못된 입력값입니다.");
      }
    }
  }
}
