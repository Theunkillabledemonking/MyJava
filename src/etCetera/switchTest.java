package etCetera;

import java.util.Scanner;

public class switchTest {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 키보드로부터 정수를 입력
    System.out.println("정수를 입력하세요");
    int inputValue = sc.nextInt();

    boolean myType = false;


    String bar = switch(inputValue) {
      case 1, 5 -> "Python";
      case 2 -> "Java";
      case 3 -> "C++";
      case 4 -> "JavaScript";
      default -> "Unknown";
    };

  System.out.println(bar);


  }
}
