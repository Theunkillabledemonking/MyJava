package specialLecture;

import java.util.Scanner;

public class j_241108_clean {
    // quit 상수 정의
    private static final String QUIT_COMMAND = "QUIT";
    public static void main(String[] args) {
        
        //스캐너 객체 생성
        Scanner sc = new Scanner(System.in);

        // 가위, 바위, 보 옵션 배열
        String[] options = {"SCISSORS", "ROCK", "PAPER"};
        String userInput;
        int score = 0;
        int consecutiveWins = 0;

        while (true) {
            // 사용자 입력 요청
            System.out.print("가위, 바위, 보를 입력하세요 (종료하려면 QUIT): ");
            userInput = sc.nextLine().toUpperCase();

            // "QUIT" 입력 시 게임 종료
            if (userInput.equalsIgnoreCase(QUIT_COMMAND)) {
                System.out.println("게임종료");
                break;
            }

            // 사용자 입력 값을 인덱스로 변환
            int userIndex = getUserChoiceIndex(userInput, options);
            if (userIndex == -1) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                continue;
            }

            // 컴퓨터 선택 난수 생성
            int computerIndex = (int)(Math.random() * 3);
            System.out.println("컴퓨터는" + options[computerIndex]);

            // 게임 결과 판별
            String result = getResult(userIndex, computerIndex);
            System.out.println("결과: " + result);

            // 점수 계산 및 연속 승리 처리
            if (result.equals("승리")) {
                consecutiveWins++;
                score += (consecutiveWins > 1) ? 3 : 1;
            } else if (result.equals("패배")) {
                consecutiveWins = 0;
                score --;
            } else {
                consecutiveWins = 0;
            }

            // 현재 점수 출력
            System.out.println("현재 점수: " + score + "점");

            // 게임 종료 조건 확인
            if (score >= 7) {
                System.out.println("축하합니다. 승리하셨습니다!");
                break;
            } else if (score <= -7) {
                System.out.println("다음 기회에~~~~");
                break;
            }
        }







    }

    // 사용자 입력 값을 인덱스로 변환하는 메서드
    private static int getUserChoiceIndex(String userInput, String[] options) {
        for (int i = 0; i < options.length; i++) {
            if (userInput.equals(options[i])) {
                return i;
            }
        }
        return -1;
    }

    // 게임 결과를 판별하는 메서드
    private static String getResult(int userIndex, int computerIndex) {
        if (userIndex == computerIndex) {
            return "무승부";
        } else if ((userIndex == 0 && computerIndex == 2) ||
            (userIndex == 1 && computerIndex == 0) ||
            (userIndex == 2 && computerIndex == 1)) {
            return "승리";
        } else {
            return "패배";
        }
    }

}

