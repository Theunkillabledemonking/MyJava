package src.specialLecture;

import java.util.Scanner;

public class j_241104_2 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    // 가위바위보 배열, 기본 초기값 생성
    String[] sciRockPaper = {"SCISSORS", "ROCK", "PAPER"};
    String userInput = " ";
    int userIndex = 0;
    int computerInput = 0;

    while(true){
      System.out.println("Scissors, Rock, Paper 중 하나를 입력하세요 :");
      // 사용자에게 입력받기
      userInput = sc.nextLine().toUpperCase();

      // 입력 예외처리
      // user 인덱스로 저장
      userIndex = - 1;
      for (int i = 0; i < sciRockPaper.length; i++){
        if (userInput.equals(sciRockPaper[i])) {
          userIndex = i;
          break;
        }
      }

      // 1. quit 이면 -> 프로그램 종료 --> break
      if (userInput.equals("QUIT")){
        System.out.println("프로그램을 종료합니다");
        break;
      }

      // 2. 잘못된 입력 -> 재입력 -> continue
      if (userIndex == -1) {
        System.out.println("잘못된 입력 값 입니다. Scissors, Rock, Paper 중 하나를 입력하세요 :");
        continue;
      }

      // 컴퓨터 선택 : 가위, 바위 보 중 하나 선택
      // 난수 이용 : 0 ~ 2 사이 난수 발생 후 "가위, 바위, 보"에 매칭
      computerInput = (int) (Math.random() * 3);
      System.out.println("컴퓨터는 " + sciRockPaper[computerInput]);

      // 승패 계산
      // 결과를 출력
      // - 예 1) 승리 : 사용자 - 가위, 컴퓨터-보
      // - 예 2) 패배 : 시용자 - 가위 , 컴퓨터-바위
      // - 예 3) 무승부 : 사용자 - 가위, 컴퓨터- 가위
      if (userIndex == computerInput) {
        System.out.println("무승부입니다.");
      } else if ((userIndex == 0 && computerInput == 2)     // 유저 : 가위 컴퓨터 : 보
                || (userIndex == 1 && computerInput == 0)   // 유저 : 바위 컴퓨터 : 가위
                || (userIndex == 2 && computerInput == 1) ) // 유저 : 보 : 컴퓨터 : 바위
        {
        System.out.println("유저가 이겼습니다.");
      } else {
        System.out.println("컴퓨터에게 졌습니다");
      }
    }

  }
}
