package Lab.src.cobo.Chap4;

import java.util.Scanner;

public class Exercise4_5 {
  public static void main(String[] args) {

    int num = 0, sum = 0;
    System.out.print("숫자를 입력하세요, 예 12345");

    Scanner sc = new Scanner(System.in);
    String tmp = sc.nextLine();
    num = Integer.parseInt(tmp);

    while(num!=0){
      // num을 10으로 나눈 나머지를 sumdp 더함
      sum += num%10;
      System.out.printf("sum=%3d num=%d%n", sum, num);
    }
    System.out.println("각자리수의 합" + sum);
  }
}
