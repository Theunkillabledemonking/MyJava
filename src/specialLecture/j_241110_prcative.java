package src.specialLecture;

import java.util.Scanner;

public class j_241110_prcative {
  public static final int WIN_RESULT = 7;
  public static final int LOSE_RESULT = -7;
  public static final String[] RESULT = {"가위", "바위", "보"};

  public static void main(String[] args) {

    // 스캐너 메서드
    Scanner sc = new Scanner(System.in);
    String userInput;
    int score = 0;
    int winStreak = 0;

    while (true) {
      // 1. 사용자의 입력 받기
      System.out.println("가위 바위 보 게임 시작! 종료하려면 quit를 입력하세요");

      userInput = sc.nextLine().toUpperCase();

      // INDEX 메서드 호출
      int userIndex = agUserIndex(userInput, RESULT);

      // QUIT 입력시 종료
      if (userInput.equals("QUIT")) {
        System.out.println("종료합니다.");
        break;
      }

      // 해당되지 않는 값이면 값을 재입력 받기
      if (userIndex == -1) {
        System.out.println("다시 입력하세용");
        continue;
      }

      // 컴퓨터의 선택 생성
      int comIndex = (int)(Math.random() * 3);
      System.out.println("컴퓨터의 선택" + RESULT[comIndex]);

      // 가위 바위 보 값을 비교
      String result = agResult(userIndex, comIndex);
      System.out.println(result + "입니다!");

      score = agCalculate(score, winStreak, result);
      winStreak = result.equals("승리") ? 1 : 0;

//      // 무승부
//      // 승리 + 1점, 연속 승리시 +3점
//      // 패배
      System.out.println(score + "점");

      // 7점 이상이면 게임 승리, -7점 이하면 게임 패배
      if (score >= WIN_RESULT) {
        System.out.println("당신이 이겼습니다.");
        break;
      } else if (score <= LOSE_RESULT) {
         System.out.println("흠.. 아쉽네요");
         break;
      }
    }
  }
  public static int agUserIndex (String userInput, String[] RESULT) {
    for (int i = 0; i < RESULT.length ; i++) {
      if (userInput.equals(RESULT[i])) {
        return i;
      }
    }
    return -1;
  }

  public static String agResult (int userIndex, int comIndex) {
    if (userIndex == comIndex) {
      return "무승부";
    } else if ((userIndex == 0 && comIndex == 2) ||
        (userIndex == 1 && comIndex == 0) ||
        (userIndex == 2 && comIndex == 1)) {
      return "승리";
    } else {
      return "패배";
    }

  }

  public static int agCalculate(int score, int winStreak, String result) {
    if (result.equals("승리")) {
      return score += (winStreak > 1) ? 3 : 1;
    } else if(result.equals("패배")) {
      return score -1;
    } else {
      return score;
    }
  }
}
