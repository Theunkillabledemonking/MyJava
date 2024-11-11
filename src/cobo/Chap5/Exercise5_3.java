package src.cobo.Chap5;

public class Exercise5_3 {
  public static void main(String[] args) {
    // 배열에 모든 값을 더하는 프로그램 작성
    int [] arr = { 10, 20, 30, 40, 50 };
    int sum = 0;

    for (int value : arr) {
      sum += value;
    }
    System.out.println("sum=" + sum);

  }
}
