package specialLecture;
import java.util.*;
public class j_241104_switch {
    public static void main(String[] args) {
        // 가위, 바위, 보 게임 만들기
        // 사용자로부터 Scissors, Rock, Paper 중 하나 입력
        //  - 예시 : Scissors, Rock, Paper 중 하나를 입력 하세요:
        // 컴퓨터가 난수를 이용해, 가위-바위-보 중 하나 선택
        // 결과 출력
        //  - 예 1) 승리 : 사용자 - 가위, 컴퓨터-보
        //  - 예 2) 패배 : 사용자 - 가위, 컴퓨터-바위
        //  - 예 3) 무승부 : 사용자 - 가위, 컴퓨터 가위
        // 그리고 게임 재실행

        // 사용자로부터 Scissors, Rock, Paper 입력 예외 처리
        //  - Scissors, Rock, Paper 이외의 값이 입력 될 경우
        //    "잘못된 입력 값 입니다, Scissors, Rock, Paper 중 하나를 입력 하세요"
        //    출력 후 재입력
        // "quit"를 입력하면 프로그램 종료

        Scanner sc = new Scanner(System.in);

        // 가위바위보 배열 생성
        String sciRockPaper[] = {"SCISSORS", "ROCK", "PAPER"};
        String userInput = "";
        int index = -1;

        // 무한루프
        while (true) {

            System.out.println("Scissors, Rock, Paper 중 하나를 입력 하세요");
            userInput = sc.nextLine().toUpperCase();

            // 예외 처리
            // 1: quit 이면 -> 프로그램 종료 -> break
            if (userInput.equals("QUIT")) {
                break;
            }

            index = -1;
            // index 값으로 배열의 값 찾기
            for (int i = 0; i < sciRockPaper.length; i++){
                if (userInput.equals(sciRockPaper[i])){
                    index = i;
                    break;
                }
            }

            // 2: 잘못된 입력 -> 재입력 -> continue
            if (index == -1) {
                System.out.println("잘못된값");
                continue;
            }

            // 컴퓨터 선택 : 가위, 바위, 보 중 하나 선택
            // 난수 이용 : 0 ~ 2 사이 난수 발생 후 "가위, 바위, 보"에 매칭
            int computerIndex = (int) (Math.random() * 3);

            // 결과 출력
            System.out.println("사용자 -" + sciRockPaper[index] + ", 컴퓨터 -" + sciRockPaper[computerIndex]);

            // 테이블 생성
            int[][] resultTable = {
                    {0, 2 ,1}, //SCISSORS : 비김(0), 패배(2), 승리(1)
                    {1, 0, 2}, //ROCK : 승리(1), 비김(0), 패배(2)
                    {2, 1, 0}   //PAPER : 패배(2), 승리(1), 비김(0)
            };

            // 승패 계산
            int result = resultTable[index][computerIndex];
            switch (result) {
                case 0 -> System.out.println("무승부입니다.");
                case 1 -> System.out.println("승리했습니다.");
                case 2 -> System.out.println("패배했습니다.");
            }
            // 결과 출력

        }
    }
}
