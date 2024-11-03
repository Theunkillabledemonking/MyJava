package src.specialLecture;

import java.util.Random;
import java.util.Scanner;

public class j_241101_report {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    // 입력값 초기화
    int inputValue = 0;
    // 반복
    while(true){
      System.out.println("배열의 크기를 설정하세요");
      // 사용자로부터 배열 크기 inputValue을 입력받아,
      inputValue = sc.nextInt();
      if(inputValue >= 1){
        break;
      }
      // 만약 1이상이면 반복문 탈출
      // 단, inputValue가 0 또는 음수이면 재입력을 요구한다.
      System.out.println("다시 1이상 숫자를 입력하세요");
    }
    // N개의 정수를 저장할 수 있는 1차원 배열을 생성하라.
    int bar[] = new int[inputValue];

    // start end 변수 초기화
    int start, end = 0;
    // 사용자로부터 난수 범위를 지정할 start, end 값을 입력받아,
    while(true) {
      System.out.println("시작할 범위와 끝 나는 범위의 숫자를 입력하세요");
      // 시작값과 끝 지점이 inputValue보다 작을시 다시 입력
      start = sc.nextInt();
      end = sc.nextInt();
      // 단, (end - start + 1) 값이 배열의 크기 N보다 작을 경우
      // 다시 입력을 요구한다.
      if (!(end - (start + 1) >= inputValue)){
        break;
      }
      System.out.println("다시 입력해보세요");
      // start <= 난수 값 <= end 범위의 난수를 생성하여 배열에 저장하라.
    }
      // 예) N = 5 -> 5개의 원소를 가지는 1차원 배열 생성
      for(int i = 0; i < bar.length; i++) {
        //     start = 10, end = 12 -> 배열 원소는 10, 11, 12 중 하나의 값이어야 함
        int randValue = (int) (Math.random() * (end - start + 1)) + start;
        bar[i] = randValue;
      }
      // 생성된 배열의 모든 원소 값을 출력
      for(int bars : bar){
        System.out.print(bars + " ");
      }
  }
}
