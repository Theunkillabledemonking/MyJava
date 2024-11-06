package src.etCetera;

public class exBreak {
  public static void main(String[] args){
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
      if (sum > 20) {
        break;
      }
      System.out.println("i = " + i + ", sum = " + sum);
    }

    System.out.println("최종합계: " + sum);
    System.out.println("반복문 종료 후 실행되는 코드");
  }
}
