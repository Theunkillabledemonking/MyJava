package src.cobo.Chap4;

public class Exercise4_9 {
  public static void main(String[] args) {
    int num = 12345;
    int sum = 0;

    // 1 + 2 + 3 + 4 + 5 를 하는 구문을 작성

    //각 자리수를 더하고, 더한 자리수를 "날려버리는" 구문
    while (num > 0) {
      sum += num % 10; // 맨 마지막 자리수를 더함
      num /= 10;        // 마지막 자리수를 날려버림
    }


    System.out.println("sum = " + sum);
  }
}
