package src.specialLecture;

import java.util.Scanner;

public class j_241104_1 {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    // numOfElements 확인!
    int numOfElements = 0;
    while (true) {
      numOfElements = sc.nextInt();

      // 탈출 조건 : if numOfElements > 0 --> break
      if (numOfElements == 0 ){
        break;
      }

      // 예외 출력
      System.out.println("정수에 맞게 입력하세요.");
    }

    // n개의 정수형 원소를 가지는 1차원 배열을 생성하라.
    int bar[] = new int[numOfElements];

    int start = 0;
    int end = 0;

      // 키보드로부터 start, end 정수 값을 입력받아
    while (true) {
      start = sc.nextInt();
      end = sc.nextInt();

      // 이때, start ~ end 범위의 크기가 배열의 원소보다 작을 경우
      // 재입력을 받아라
      if (end - (start + 1) >= numOfElements){
        break;
      }

      // 재입력
      System.out.println("배열보다 큰 값을 입력하세요.");
    }

      // start <= rand value <= end 범위의 난수를 발생하여
      // 배열에 저장
      for(int i = 0; i < bar.length; i++){
        // 만약 end = 10이면
        bar[i] = (int)(Math.random() * (end - start)) + start;
      }

      // 배열 내 원소값 출력
      for(int value : bar){
        System.out.println(value);
      }


  }
}
