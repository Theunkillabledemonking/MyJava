package specialLecture;
import java.util.*;

public class j_241110_practice1 {
    private static final String[] OPTIONS = {"가위", "바위", "보"};
    private static final int WINING_SCORE = 7;
    private static final int LOSING_SCORE = -7;
    //public final String
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 가위바위보 게임
        // 가위바위보 배열 생성


        int score = 0;
        int winStreak = 0;

        while(true) {
            // 1. 사용자 입력 받기
            System.out.println("가위, 바위, 보 중 하나를 입력하세요 (종료: QUIT): ");
            String userInput = sc.nextLine();


            // 배열에 있는 인덱스 순으로 인덱스값 처리
            int userIndex = index(OPTIONS, userInput);

            // 2. 사용자가 "quit" 입력 시 종료 처리
            if (userInput.equalsIgnoreCase("QUIT")) {
                System.out.println("프로그램 종료");
                break;
            }

            // 3. 예외처리 구문
            if (userIndex == -1) {
                System.out.println("가위, 바위, 보 중 올바른 값 입력해주세요");
                continue;
            }

            // 4. 난수를 발생하여 컴퓨터의 값을 선택
            int computerIndex = (int)(Math.random() * OPTIONS.length);
            System.out.println("컴퓨터의 선택" + OPTIONS[computerIndex]);

            // 4. 비교구문
            String rockResult = result(userIndex, computerIndex);
            System.out.println("결과: " + rockResult);

            // 5. 승리 패배 구문
            score = calculateScore(rockResult, score, winStreak);
            winStreak = rockResult.equals("승리") ? 1 : 0;


            System.out.println("현재 점수: " + score);

            // 6. 7점 이상이면 승리, 7점이하면 패배 후 종료
            if (score >= WINING_SCORE) {
                System.out.println("승리");
                break;
            } else if (score <= LOSING_SCORE) {
                System.out.println("패배");
                break;
            }
        }
        sc.close();
    }
    public static int index(String[] value, String userInput) {
        for (int i = 0; i < OPTIONS.length; i++) {
            if(value[i].equals(userInput)) {
                return i;
            }
        }
        return -1;
    }

    public static String result(int userIndex, int computerIndex) {
        if (userIndex == computerIndex) {
            return "무승부";
        } else if ((userIndex == 0 && computerIndex == 2 ||
                    userIndex == 1 && computerIndex == 0) ||
                    userIndex == 2 && computerIndex == 1) {
            return "승리";
        } else {
            return "패배";
        }
    }

    public static int calculateScore(String rockResult, int score, int winStreak) {
        if (rockResult.equals("승리")) {
            //  승리 +1, 연속적으로 승리시 +3, 패배시 -1
            return score += (winStreak >= 1) ? 3 : 1;
        } else if (rockResult.equals("패배")) {
            return score -1;
        } else {
            return score;
        }
    }


}
