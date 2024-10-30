package Lab.src.cobo.Chap4;

import java.util.Scanner;

public class Ex4_3 {
  public static void main(String[] args) {
    System.out.println("숫자를 하나를 입력하세요>");
    Scanner sc = new Scanner(System.in); //화면을 통해 입력받은 숫자 input
    int input = sc.nextInt();

    if(input==0){
      System.out.println("입력하신 숫자는 0입니다.");
    } else { // input != 0인 경우
      System.out.println("입력하신 숫자는 0이 아닙니다.");
    }
  }
}
