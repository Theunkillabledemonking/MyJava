import java.util.*;
public class j_241101_1 {
    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);

        // 배열의 초기값 
        int inputValue = 0;
        while(true){
            // 배열을 숫자를 입력
            System.out.println("배열이 크기를 설정해주세요.");
            inputValue = sc.nextInt();
            
            // 배열이 1이상 10이하의 숫자일 경우 탈출
            if(1 <= inputValue && inputValue <= 10){
                break;
            }
            // 아닐시 재입력 요구
            System.out.println("1이상 10이하 숫자를 다시 입력해 주세요");
        }
        
        // 입력 받은 배열 생성
        int value[] = new int[inputValue];
        
        for(int i = 0; i < value.length; i++){
        // 생성한 배열을 사용자에게 입력 받아 배열의 크기 만큼 저장
        System.out.println((i + 1)+"번째 각 배열에 저장할 값을 입력하세요");
        value[i] = sc.nextInt();

        // 만약 음의 정수, 0 일 경우 재입력
        if (value[i] <= 0){
            System.out.println("1이상 값을 입력하세요.");
            continue;
        }   
    }   
        // 생성된 배열을 크기만큼 생성해서 역순으로 출력
        for (int j = value.length - 1; j < value.length; j--){
            System.out.print(value[j] + "\t");
        }

    }
}
