package etCetera;

import java.util.Scanner;

public class simu {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int numOfElements = 5;
    int bar[] = new int[numOfElements];

    // 반복 -> 배열의 원소를 처음부터 마지막까지
    for (int i = 0 ; i < bar.length ; i++){
        bar[i] = sc.nextInt();
    for (int bars : bar) {
      System.out.println(bars);
    }
    }
  }
}
