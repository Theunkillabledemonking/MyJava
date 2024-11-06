package src.etCetera;

public class operationProcedureSwitch {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      System.out.println("Current i = " + i);

      switch (i) {
        case 1:
          System.out.println(" Case 1: continue loop");
          break;  // case1 종료 후 반복문 계속 진행
        case 3:
          System.out.println(" Case 3: continue loop");
          break;  // case3 종료 후 계속 반복 진행
        case 5:
          System.out.println(" Case 5: breaking out of loop completely");
          break;  // case5 종료 후, 반복문 계속 진행
      }

      System.out.println("Loop continues after switch\n");
    }

    System.out.println("Loop finished, executing post-loop code");
  }
}
