import java.lang.classfile.ClassFile.Option;
import java.util.Scanner;


public class j_241111 {
    // 불변하지 않는 값 리터럴 상수 생성
    public static final String[] OPTIONS = {"SCISSORS", "ROCK", "PAPER"};
    // 승/패 리터럴 상수
    public static final int WIN_SCORE = 7;
    public static final int LOSE_SCORE = -7;
    
    public static void main(String[] args) {
        
        //  스캐너 
        Scanner sc = new Scanner(System.in);
        // 점수
        int score = 0;
        // 연속승리 변수
        int winCheck = 0;
        
        // 가위, 바위 보 게임을 구현
        while(true){
            
        // 사용자로부터 "Scissors, Rock, Paper"를 입력
        System.out.println("Scissors, Rock, Paper 값 중 하나를 선택해주세요, 종료하려면 Exit입력");
        String userInput = sc.nextLine().toUpperCase();
        // Index 메서드 소환
        int userIndex = index(userInput, OPTIONS);
        
        // Eixt 를 입력하기 전까지 계속해서 게임 실행
        if (userInput.equals("EXIT")) {
            System.out.println("게임 종료");
            break;
        }

        // - "Scissors, Rock, Paper" 이외의 값 재입력처리
        if (userIndex == -1) {
            System.out.println("올바른 값을 입력해주세요.");
            continue;
        }

        // 컴퓨터는 "Scissors, Rock, Paper" 중 하나를 선택
        int comIndex = (int)(Math.random() * 3);
        System.out.println("컴퓨터의 선택은 " + OPTIONS[comIndex]);

        // 결과 값 출력: 메서드
        // 예 1) 승리 - 사용자 가위 : 컴퓨터 보
        // 예 1) 패배 - 사용자 가위 컴퓨터 바위
        // 예 1) 무승부 - 사용자 가위 : 컴퓨터 가위
        String result = argReuslt(userIndex, comIndex);
        System.out.println("결과는 " + result  + "입니다.");

        // 승리시 1 점, 연속 승리시 3점, 패배시 -1 점 메서드
        score = argScore(score, winCheck, result);
        winCheck = result.equals("승리") ? 1 : 0; // 승리시 체크 1
        System.out.println("현재 점수는 " + score + "입니다");
        
        // 7점 승패 구문 출력
        if (score >= WIN_SCORE) {
            System.out.println("유저가 승리");
            break;
        } else if (score <= LOSE_SCORE) {
            System.out.println("인간은 컴퓨터에게 졌습니다.");
            break;
        }
        
        
    }
    }

    // 무승패 갈림 메서드
    public static int index(String userInput, String[] OPTIONS) {
        for (int i = 0; i <OPTIONS.length; i++) {
            if (OPTIONS[i].equals(userInput)) {
                return i;
            }
        }
        return -1;
    }
    
    // 승패 메서드
    public static String argReuslt(int userIndex, int comIndex) {
        // 무승부
        if (userIndex == comIndex) {
            return "무승부";
            // 승리
        } else if((userIndex == 0 && comIndex == 2) ||
                  (userIndex == 1 && comIndex == 0) ||
                  (userIndex == 2 && comIndex == 1)) {
                    return "승리";
                    // 패배
                  } else {
                    return "패배";
                  }
    }

    // 승리 점수 패배 메서드 승리시 1점, 연속시 3점 패배시 -1점
    public static int argScore(int score, int winCheck, String result) {
        if (result.equals("승리")) {
            return score += winCheck >= 1 ? 3 : 1;
        } else if (result.equals("패배")) {
            return score -1;
        } else {
            return score;
        }
    }
}
