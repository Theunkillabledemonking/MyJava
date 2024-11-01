import java.util.*;
public class j_241101_sensei {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        // 키보드로부터 정수 n을 입력
        int inputValue = 3;

        // 만약 값이 0이하 또는 초과일 경우 재입력
        // 무한반복 : 조건을 만족하는 입력 값이 언제들어올지 몰라..
        while(true){
            // 키보드로부터 정수를 입력
            inputValue = scanner.nextInt();
            // 만약 n 값이 0이상 10 이하일 경우 반복문 탈출
            // 흐름제어문의 선택과 반복은 조건식을 가진다.
            if(1 <= inputValue && inputValue <= 10){
                break;
            }
            System.out.println("다시 입력");
        }

        // n 개의 int형 원소를 가지는 1차원 배열을 생성
        int bar[] = new int[inputValue];

        // 생성된 1차원 배열에 사용자로 부터 값을 입력 받아 배열에 순차적으로 저장
        for(int i = 0; i < bar.length; i++){
            int inputElements = 0;
            // 무한반복
            while(true){
            // 키보드로부터 정수값 입력
            inputElements = scanner.nextInt();
            // 입력받은 정수값이 양의 정수이면 탈출
            if (inputElements > 0){
                break;
            }
        }
            // 입력 받은 정수값을 현 인덱스의 원소에 저장
            bar[i] = inputElements;
        
        }
            // 입력 받은 정수가 0, 음의 정수 일시에 재입력 받기
            for(int i = bar.length; i >= 0; i--){
                System.out.println(bar[i]);
            }
    }
}
