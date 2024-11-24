package src.etCetera;

public class arrayRandomAccess {
  public static void main (String[] args) {
    short[] numbers = {10, 20, 30, 40}; // short형 배열 선언 (각 요소는 2byte)

    // 반복문을 통해 배열의 각 요소에 접근
    for (int i = 0; i < numbers.length; i++) {
      // 인덱스 i를 통해 배열의 특정 위치에 접근
      // numbers[0] 주소가 0x0000일 떄:
      // numbers[1] 주소 = 0x0000 + ( 1 * 2 ) = 0x002
      // numbers[2] 주소 = 0x0000 + ( 2 * 2 ) = 0x004
      // numbers[3] 주소 = 0x0000 + ( 3 * 2 ) = 0x006
      // 각 인덱스를 통해 일정 간격(2바이트)만큼 이동하여 원하는 요소에 직접 접근 가능
      System.out.println("Index" + i + ": " + numbers[i]);
     }
  }
}
