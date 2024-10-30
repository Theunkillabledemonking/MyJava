import java.util.*;
public class j_241030_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //지역 변수는 선언을 하면 반드시 초기화 해야한다.
        int inputValue = 0; //변수의 생명 주기
        while(true){
            System.out.println("입력해주세요");

            // // 키보드로부터 정수 n개를 입력 받아
            inputValue = sc.nextInt(); 

            // // n개의 int 원소를 가지는 1차원배열을 만드세요
            if (1 <= inputValue && inputValue <= 10){
                System.out.println("마루 데스!");
                break; // 성공시 종료     
            }
            
            System.out.println("다시 입력하세요 1~10 사이의 숫자");
        }

        int [] value = new int [inputValue];
        // 생성된 n개의원소에 정수 값을 입력하고 출력
        for (int i = 0; i<value.length; i++){
            System.out.print((i+1) +" 번째 입력해주세요: ");
            value[i] = sc.nextInt();
        }

        for(int bar : value){
            System.out.println(bar + "원소");
        }

        // 배열 내 원소 중 최대값, 최소값 출력하고,
        // 평균 값을 출력해라
        int maxValue = value[0];
        int minValue = value[0];
        int avg = 0;

        for (int i = 0; i < value.length; i++){
            if(value[i] > maxValue){
                maxValue = value[i];
            }
            if(value[i] < minValue){
                minValue = value[i];
            }
            avg += value[i];
            
        }
        // 평균 계산
        float avgegare = avg / value.length;

        // 출력
        System.out.println("최대값 : " + maxValue);
        System.out.println("최소값 : " + minValue);
        System.out.printf("평균값 %.2f", avgegare);
        // System.out.println(maxValue +"," + minValue + "," +  avgegare);
    }
}