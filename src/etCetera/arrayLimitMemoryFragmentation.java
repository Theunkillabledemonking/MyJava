package src.etCetera;

public class arrayLimitMemoryFragmentation {
  public static void main(String[] args) {

    try {
      // 최대 크기의 int 형 배열을 선언: 약 8G
      int largeArray[] = new int[Integer.MAX_VALUE];
    } catch (OutOfMemoryError e) {
      System.out.println("OutOfMemoryError: 배열의 크기가 너무 커서 연속된 메모리 공간을 할당할 수 없음");
    }

  }
}
