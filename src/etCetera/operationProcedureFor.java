package src.etCetera;

public class operationProcedureFor {
  public static void main(String[] args) {
    for (int i = 1; i <= 3; i++) {
      System.out.println("Outer 반복 i = " + i);

      for (int j = 1; j <= 3; j++) {
        System.out.println(" Middle 반복 j = " + j);

        for (int k = 1; k <= 5; k++) {
          System.out.println("  Inner 반복 k = " + k);
          if (k == 3) {
            System.out.println("    k == 3, inner 반복 종료");
            break;  // 가장 안쪽(inner) 반복문 종료
          }
        }
        
        System.out.println("Inner 반복문 종료 후 Middle 반복문 계속 진행");
      }
      System.out.println("Outer 반복문이 중간 반복문 종료 후 계속 진행\n");
    }
    System.out.println("모든 반복문이 종료된 후, 다음 코드 진행");
  }
}
