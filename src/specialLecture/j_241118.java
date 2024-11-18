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

      System.out.print("Result:");
      // 배열 출력
      for (char value : randOper) {
        System.out.print(value + "\t");
      }

      // 0으로 초기화
      char overlapping = 0;
      int count = 0;
      int reverseCount = 0;
      char reverseLapping = 0;

      int start = 0;
      int end = userInput - 1;

      while (start <= end) {
        if (randOper[start] == randOper[start + 1]) {
          overlapping = randOper[start];
          count++;

          if (count == 2) {
            break;
          }
        }start++;
      }
      System.out.println(count);

      start = 0;
      end = userInput - 1;
      while (end >= start) {
        if (randOper[end] == randOper[end - 1]) {
          reverseLapping = randOper[end];
          reverseCount++;

          if (reverseCount == 2) {
            break;
          }
        }end--;
      }


//      }
      // 배열을 역순을 돌면서 확인
//         for (int j = end; j < randOper.length; j--) {
//            if (randOper[j] == randOper[j - 1]) {
//               reverseCount++;
//               reverseLapping = randOper[j];
//            }
//         }
////
//         // 같은 배열에 같은 문자가 있을시에 카운트 증가
//         for (int i = 1; i < randOper.length; i++) {
//            if (randOper[i] == randOper[i - 1]) {
//               count++;
//               overlapping = randOper[i];
//            }
//         }

      // 랜덤 슬롯 결과 생성
      // 2개가 겹침
//         if (count == 1) {
//            switch (overlapping) {
//            case '+':
//               System.out.println("+ 2 Combo - 보너스 점수 1점 증가");
//               score += 1;
//               break;
//            case '-':
//               System.out.println("- 2 Combo - 보너스 점수 2점 감소");
//               score -= 1;
//               break;
//            case '*':
//               System.out.println("* 2 Combo - 보너스 점수 3점 증가");
//               score += 3;
//               break;
//
//            }
//         } else if (count == 2) { // 3개가 겹침
//            switch (overlapping) {
//            case '+':
//               System.out.println("+ 3 Combo - 보너스 점수 3점 증가");
//               score += 3;
//               break;
//            case '-':
//               System.out.println("- 3 Combo - 보너스 점수 3점 감소");
//               score -= 3;
//               break;
//            case '*':
//               System.out.println("* 3 Combo - 보너스 점수 5점 증가");
//               score += 5;
//               break;
//            }
//         }

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
