package src.etCetera;

public class operationProcedureContinue {
  public static void main(String[] args) {

    for (int i = 1; i <= 3; i++) {
      System.out.println("Outer loop i = " + i);
      for (int j = 1; j <= 5; j++) {
        if (j == 3) {
          System.out.println("   Inner loop j = " + j +
              "(continue executed, skipping to next iteration)");
          continue; // j가 3일 때 아래 코드를 건너뛰고 다음 반복 진행
        }
        System.out.println("   Inner loop j = " + j);
      }

      System.out.println("Outer loop continues\n");
    }
    System.out.println("All loops finished, executing post-loop code");
  }
}
