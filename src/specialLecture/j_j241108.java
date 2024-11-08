package specialLecture;

import java.util.Scanner;

public class j_j241108 {
    public static void main(String[] args) {


        // 가위, 바위, 보 게임 만들기

        // 키보드로부터 scissors, rock, paper를 입력받아
        // 아래와같이 결과를출력
        // 예 1) 승리 - 사용자  : Scissors, 컴퓨터 : paper
        // 예 2) 패배 - 사용자 : Scissors, 컴퓨터 : Rock
        // 예 3) 무승부 - 사용자 : Scissors, 컴퓨터 : Rock

        // 고려사항
        // 1. 사용자로부터 입력 시 scissors, rock, paper 이외의 값은 재입력처리
        //      재입력처리
        // 2. "Quit" 입력 전까지 계속해서 게임 실행
        // 3. 승리시 보너스 포인트 1점 증가, 패배 시 보너스 포인트 1점 차감
        //   연속으로 승리 시 보너스 포인트 3점 추가
        // 4. 결과값 판별 후 현재 포인트 출력
        //    예) 현재포인트 : 1점
        // 5. 게임 종료 조건 추가
        // 사용자 포인트가 7점 이상 또는 -7점 이하이면 종료
        // 7점 이상이면 : "축하합니다. 승리"
        // -7점 이하이면 : "다음 기회에~~"
        
        // 스캐너 
        Scanner sc = new Scanner(System.in);

        // 가위바위보 배열
        String SciRockPaper[] = {"SCISSORS", "ROCK", "PAPER"};
        String userInput = "";
        String result = "";
        boolean flagWin = false;
        //점수
        int count = 0;
        while(true) {
            // 사용자에게 입력받기
            System.out.println("가위바위보 입력구다사이");
            userInput = sc.nextLine().toUpperCase();

            // userindex로 값이 0이면 가위, 1이면 바위, 2이면 보
            int userIndex = -1;
            for (int i = 0; i < SciRockPaper.length; i++) {
                if (userInput.equals(SciRockPaper[i])) {
                    userIndex = i;
                    break;
                }
            }

            // "quit" 입력시 게임 종료
            if (userInput.equals("QUIT")) {
                System.out.println("종료");
                break;
            }
            
            
            // index값이 -1이면 재입력 처리
            if (userIndex == -1) {
                System.out.println("다시 입력하세요");
                continue;
            }
            
            // 컴퓨터 난수 발생
            int computerIndex = (int)(Math.random() * 3);
            System.out.println("컴퓨터의 선택 " + SciRockPaper[computerIndex]);
            
            
            
            // 승리 판별을 위한 플래그 변수
            
            // 사용자 값, 컴퓨터 값 비교
            // 0 가위 1 묵 2 보자기
            if (computerIndex == userIndex) {
                result = "무승부";
                flagWin = false;
            } else if ((userIndex == 0 && computerIndex == 2)   // 유저가 가위, 컴퓨터가 보
                       || (userIndex == 1 && computerIndex == 0)  // 유저가 묵, 컴퓨터가 가위
                       || (userIndex == 2 && computerIndex == 1)) // 유저가 보, 컴퓨터가 묵
            {result = "승리";
                if (flagWin == false){
                    count += 1;
                }  else if (flagWin == true) {
                    count += 3;
                }
                flagWin = true;
            }// 그 이외 나머지 값
                else {
                    result = "패배";
                    count -= 1;
                    flagWin = false;}

            System.out.println("결과는 " + result + " 입니다.");
            System.out.println("점수는 " + count + "입니다.");
            // 7점 결과값 출력
            if (count >= 7) {
                System.out.println("승리입니다!");
            } else if (count <= -7) {
                System.out.println("패배입니다.");
            }
            

    }

            
        

    }
}

    