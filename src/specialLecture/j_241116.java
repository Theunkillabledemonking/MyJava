package src.specialLecture;

import java.util.Scanner;

public class j_241116 {
  // 점수 계산 메서드
  public static int scriptGameScore(int argCombo, int argGameScore, char nnt) {
    int bonus = 0;
    if (argCombo == 1) {
      bonus = switch (nnt) {
        case '+' -> 1;
        case '-' -> -1;
        case '*' -> 3;
        default -> 0;
      };
    } else if (argCombo == 2) {
      bonus = switch (nnt) {
        case '+' -> 3;
        case '-' -> -3;
        case '*' -> 5;
        default -> 0;
      };
    }
    return bonus + argGameScore;
  }

  // 메시지 출력 메서드
  public static void printGameMessage(int argCombo, char nnt) {
    if (argCombo == 1) {
      switch (nnt) {
        case '+': System.out.println("+ 2 Combo : 보너스 점수 1점 증가"); break;
        case '-': System.out.println("- 2 Combo : 보너스 점수 1점 감소"); break;
        case '*': System.out.println("* 2 Combo : 보너스 점수 3점 증가"); break;
      }
    } else if (argCombo == 2) {
      switch (nnt) {
        case '+': System.out.println("+ 3 Combo : 보너스 점수 3점 증가"); break;
        case '-': System.out.println("- 3 Combo : 보너스 점수 3점 감소"); break;
        case '*': System.out.println("* 3 Combo : 보너스 점수 5점 증가"); break;
      }
    }
  }


  public static void main(String[] args) {
    final int MATH = 3;

    // scanner api
    Scanner sc = new Scanner(System.in);

    // 연산자 +, -, * 포함하는 char type 1차원 배열 생성
    char[] operator = {'+', '-', '*'};
    char[] randOperator = new char[MATH];

    int gameCount = 1;
    int gameScore = 0;
    char nnt = 0;

    while (true) {
      System.out.println(gameCount + "번째 게임");
      System.out.print("게임을 시작하려면 아무 값이나 입력하세요: ");
      sc.next();
      System.out.println("----------------------------------------------");
      // 각 라운드마다 슬롯머신을 돌릴떄 마다 +, -, * 문자 중 3개가 무작위 선택
      for (int i = 0; i < randOperator.length; i++) {
        int randValue = (int) (Math.random() * 3);
        // 선택된 3개의 연산자를 1차원 Array에 저장
        randOperator[i] = operator[randValue];
      }

      // 출력
      for (char value : randOperator) {
        System.out.print(value + "\t");
      }
      System.out.println("\n----------------------------------------------");

      int combo = 0;
      // 콤보 점수 계산
      for (int i = 0; i < randOperator.length - 1; i++) {
        if (randOperator[i] == randOperator[i + 1]){
          combo++;
          nnt = randOperator[i];
        }
      }

      // 점수 계산 및 반영
      gameScore = scriptGameScore(combo, gameScore, nnt);
      System.out.println("현재 점수 : " + gameScore);
      // 메세지 출력
      printGameMessage(combo, nnt);

      // 게임 종료 조건
      // 점수가 5점 이상일시 승리 메세지 출력 후 종료
      // 점수가 -5점 이하일시 패배 메세지 출력 후 종료
      if (gameScore >= 5) {
          System.out.println("게임 승리!");
          break;
        } else if (gameScore <= -5) {
          System.out.println("게임 패배!");
          break;
        }
      gameCount++;

      // 각 라운드 시작 시 게임 라운드 번호를 표시하고, 사용자가 아무 값이나 입력하면 라운드를 시작
      // 매 라운드가 끝나면 현재 점수를 출력
    }

  }
}
