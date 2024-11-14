package src.Lab;

import java.util.Scanner;

public class middle_test {

  // 상수 생성
  public static final int WIN_SCORE = 5;
  public static final int LOSE_SCORE = -5;

  public static void main(String[] args) {
    // 스캐너 생성
    Scanner sc = new Scanner(System.in);

    // 연산자 배열 생성
    String[] operator = {"+", "-", "*"};
    String[] randOp = new String[3]; // 크기를 3으로 지정
    int gameCount = 1;
    int score = 0;

    while (true) {

      // 이벤트 출력
      System.out.println(gameCount + "번째 게임");
      System.out.println("게임을 시작하려면 아무 값이나 입력하세요:");
      String anyWay = sc.next();
      System.out.println("--------------------------------");

      // 랜덤 연산자 선택
      for (int i = 0; i < randOp.length; i++) {
        int randCom = (int) (Math.random() * 3);
        randOp[i] = operator[randCom];
      }

      // 선택된 배열을 출력
      for (String arrays : randOp) {
        System.out.print(arrays + "\t");
      }
      System.out.println();
      System.out.println("--------------------------------");

      // 콤보 점수 계산
      int comboCount = 1; // 연속된 연산자 수를 세기 위한 변수

      for (int i = 1; i < randOp.length; i++) {
        if (randOp[i].equals(randOp[i - 1])) {
          comboCount++; // 연속된 연산자 수 증가
        } else {
          // 연속되지 않으면 comboCount에 따라 점수 추가 후 초기화
          if (comboCount == 2) {
            if (randOp[i - 1].equals("+")) {
              score += 1;
              System.out.println("+ 연속 2번 - 1점 추가");
            } else if (randOp[i - 1].equals("-")) {
              score -= 1;
              System.out.println("- 연속 2번 - 1점 감소");
            } else if (randOp[i - 1].equals("*")) {
              score += 2;
              System.out.println("* 연속 2번 - 2점 추가");
            }
          } else if (comboCount == 3) {
            if (randOp[i - 1].equals("+")) {
              score += 3;
              System.out.println("+ 연속 3번 - 3점 추가");
            } else if (randOp[i - 1].equals("-")) {
              score -= 3;
              System.out.println("- 연속 3번 - 3점 감소");
            } else if (randOp[i - 1].equals("*")) {
              score += 5;
              System.out.println("* 연속 3번 - 5점 추가");
            }
          }
          comboCount = 1; // 연속되지 않으면 초기화
        }
      }

      // 마지막 연속된 연산자에 대한 점수 추가
      if (comboCount == 2) {
        if (randOp[randOp.length - 1].equals("+")) {
          score += 1;
          System.out.println("+ 연속 2번 - 1점 추가");
        } else if (randOp[randOp.length - 1].equals("-")) {
          score -= 1;
          System.out.println("- 연속 2번 - 1점 감소");
        } else if (randOp[randOp.length - 1].equals("*")) {
          score += 2;
          System.out.println("* 연속 2번 - 2점 추가");
        }
      } else if (comboCount == 3) {
        if (randOp[randOp.length - 1].equals("+")) {
          score += 3;
          System.out.println("+ 연속 3번 - 3점 추가");
        } else if (randOp[randOp.length - 1].equals("-")) {
          score -= 3;
          System.out.println("- 연속 3번 - 3점 감소");
        } else if (randOp[randOp.length - 1].equals("*")) {
          score += 5;
          System.out.println("* 연속 3번 - 5점 추가");
        }
      }

      // 게임 스코어 출력
      System.out.println("현재 점수 : " + score);
      gameCount++;

      // 게임 종료 조건 5점 이상 ~ -5점 이하
      if (score >= WIN_SCORE) {
        System.out.println("승리! 최종 점수 : " + score);
        break;
      } else if (score <= LOSE_SCORE) {
        System.out.println("패배! 최종 점수 : " + score);
        break;
      }

    }
  }
}
