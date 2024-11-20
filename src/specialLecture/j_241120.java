package src.specialLecture;
import java.util.*;

public class j_241120 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    char[] defaultOperator = { '+', '-', '*' };
    int userInput = 0;
    int game = 1;
    int resultScore = 0;
    // 유저에게 3 ~ 7 정수를 입력받아 슬롯 개수 설정

    while (true) {
      System.out.println("Enter the number of slots (3~7): ");
      userInput = sc.nextInt();
      if (3 <= userInput && userInput <= 7) {
        break;
      }
      // 입력값이 유효하지 않으면 오류 메시지를 출력하고 재입력 요구
      System.out.println("에러 다시 입력");
    }

    char[] operator = new char[userInput];

    while (true) {
      // 연산자 배열 생성
      int score = 0;
      int countingousCounts = 1;

      for (int i = 0; i < operator.length; i++) {
        int randValue = (int) (Math.random() * 3);
        operator[i] = defaultOperator[randValue];
      }

      System.out.println("\n--- Round " + game + " ---");
      System.out.println("Press Enter to spin th the slot machine:");

      sc.next();
      // 랜덤 슬롯 결과 생성
      for (char item : operator) {
        System.out.print(item + "\t");
      }

      // 점수 규칙
      for (int i = 0; i < operator.length; i++) {
        if (i < operator.length - 1 && operator[i] == operator[i + 1]) {
          countingousCounts++;
        } else {
          if (countingousCounts == 2) {// 연속된 문자 2개
            switch (operator[i]) {
              case '+':
                score += 1;
                break;
              case '-':
                score -= 1;
                break;
              case '*':
                score += 3;
                break;
            }
          } else if (countingousCounts >= 3) { // 연속된 문자 3개
            switch (operator[i]) {
              case '+':
                score += 3;
                break;
              case '-':
                score -= 3;
                break;
              case '*':
                score += 5;
                break;
            }
          }
          countingousCounts = 1; // 카운팅 1로 초기화
        }
      }
      resultScore += score;
      System.out.println("\nGroup Scores: " + score);
      System.out.println("Total Score: " + resultScore);

      // 각 그룹별 점수를 합산해서 라운드 점수를 계산

      // 승리 +5 패배 -5 게임 종료
      if (resultScore >= 5) {
        System.out.println("승리");
        break;
      } else if (resultScore <= -5) {
        System.out.println("패배");
        break;
      }
      game++;

    }

  }
}
