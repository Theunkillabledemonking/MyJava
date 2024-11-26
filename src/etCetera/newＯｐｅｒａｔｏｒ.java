package src.etCetera;

public class newＯｐｅｒａｔｏｒ {
  public static void main(String[] args) {
    // 1. 배열 크기를 음수로 설정할 때의 예외
    try {
      int[] invalidArray = new int[-5];
    } catch (NegativeArraySizeException e) {
      System.out.println("예외 발생 : 음수 크기의 배열은 생성할 수 없습니다 - " + e);
    }

    // 2. 매우 큰 배열을 생성하려고 할 때의 메모리 오류
    try {
      int[] largeArray = new int[Integer.MAX_VALUE]; // 매우 큰 배열 크기 설정
    } catch (OutOfMemoryError e) {
      System.out.println("예외 발생: 배열 크기가 너무 커 메모리를 할당할 수 없습니다 - " + e);
    }

  }
}
