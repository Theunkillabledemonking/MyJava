package src.specialLecture;

import java.util.*;
public class j_241118 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // 초기화
    char[] operator = {'+', '-', '*'};
    int userInput = 0;

    while (true) {
      // 사용자로부터 3~7 사이의 정수를 입력 받기
      System.out.println("Enter the number of slots (3~7)");
      userInput = sc.nextInt();
      // 입력값이 유효하지 않을시 오류 메시지를 출력 재입력 요구
      if (3 <= userInput && userInput <= 7) {
        break;
      }
      System.out.println("Invalid input. Please enter a number between 3 and 7");
    }
    // 슬롯 개수 입력 연산자
    char[] randOper = new char[userInput];

    int score = 0;
    int gameCount = 0;
    while (true) {
      System.out.println(gameCount + "번째 게임");
      sc.next();
      System.out.println("--- Round " +gameCount + " ---" );

      // 랜덤된 연산자 배열 생성
      for (int i = 0; i < randOper.length; i++) {
        int randValue = (int)(Math.random() * 3);
        randOper[i] = operator[randValue];
      }

      System.out.print("Result: ");
      // 배열 출력
      for (char value : randOper) {
        System.out.print(value + "\t");
      }
      System.out.println();

      // 0으로 초기화
      char overlapping = 0;
      char reverseLapping = 0;
      int count = 1;
      int reverseCount = 1;
      boolean forwardFount = false;
      boolean reverseFount = false;
      int maxForwardCount = 1;
      int maxReverseCount = 1;

         // 같은 배열에 같은 문자가 있을시에 카운트 증가
         for (int i = 1; i < randOper.length - 1; i++) {
            if (randOper[i] == randOper[i - 1]) {
               count++;
               if (count > maxForwardCount) {
                 maxForwardCount = count;
                 overlapping = randOper[i];
                 forwardFount = true;
               }
            } else {
              count = 1;
            }
         }

       // 배열을 역순을 돌면서 확인
         for (int j = randOper.length - 2; j >= 0; j--) {
            if (randOper[j] == randOper[j + 1]) {
               reverseCount++;
               if (reverseCount > maxReverseCount) {
                 maxReverseCount = reverseCount;
                 reverseLapping = randOper[j];
                 reverseFount = true;
               }
            } else {
              reverseCount = 1;
            }
         }


         int roundScore = 0;
      // 랜덤 슬롯 결과 생성
        if (forwardFount) {
            switch (overlapping) {
              case '+':
                if (maxForwardCount == 2) {
                  System.out.println("+ 2 Combo - 보너스 점수 1점 증가");
                  roundScore += 1;
                } else if (maxForwardCount >= 3) {
                  System.out.println("+ 3 Combo - 보너스 점수 3점 증가");
                  roundScore += 3;
                }
                break;
              case '-':
                if (maxForwardCount == 2) {
                  System.out.println("- 2 Combo - 보너스 점수 1점 감소");
                  roundScore -= 1;
                } else if (maxForwardCount >= 3) {
                  System.out.println("- 3 Combo - 보너스 점수 3점 감소");
                  roundScore -= 3;
                }
                break;
              case '*':
                if (maxForwardCount == 2) {
                  System.out.println("* 2 Combo - 보너스 점수 3점 증가");
                  roundScore += 3;
                } else if (maxForwardCount >= 3) {
                  System.out.println("* 3 Combo - 보너스 점수 5점 증가");
                  roundScore += 5;
                }
                break;
            }
        }

      if (reverseFount && (!forwardFount || overlapping != reverseLapping)) {
        switch (reverseLapping) {
          case '+':
            if (maxReverseCount == 2) {
              System.out.println("+ 2 Combo - 보너스 점수 1점 증가");
              roundScore += 1;
            } else if (maxReverseCount >= 3) {
              System.out.println("+ 3 Combo - 보너스 점수 3점 증가");
              roundScore += 3;
            }
            break;
          case '-':
            if (maxReverseCount == 2) {
              System.out.println("- 2 Combo - 보너스 점수 1점 감소");
              roundScore -= 1;
            } else if (maxReverseCount >= 3) {
              System.out.println("- 3 Combo - 보너스 점수 3점 감소");
              roundScore -= 3;
            }
            break;
          case '*':
            if (maxReverseCount == 2) {
              System.out.println("* 2 Combo - 보너스 점수 3점 증가");
              roundScore += 3;
            } else if (maxReverseCount >= 3) {
              System.out.println("* 3 Combo - 보너스 점수 5점 증가");
              roundScore += 5;
            }
            break;
        }
      }
      score += roundScore;
      System.out.println("현재 점수 :" + score);
      gameCount++;

      // 승리 5점 or 패배 -5점
      if (score >= 5) {
        System.out.println("승리임다!");
        break;
      } else if (score <= -5) {
        System.out.println("패배임다!");
        break;
      }
    }
  }
}
