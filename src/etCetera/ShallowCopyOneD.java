package src.etCetera;

public class ShallowCopyOneD {
  // 1차원 배열의 Shallow Copy를 수행하는 메서드
  public static int[] shallowCopy(int[] source) {
    return source; // 배열의 참조(주소)만 복사
  }

  public static void main(String[] args) {
    int[] original = {10, 20, 30}; // 원본 배열

    // Shallow Copy 수행
    int[] copied = shallowCopy(original);

    // 복사된 배열 수정
    copied[0] = 99;

    // 결과 출력
    System.out.println("Original[0]: " + original[0]); // 99 (원본 값 그대로)
    System.out.println("Copied[0]: " + copied[0]);     // 99 (복사본 값)
  }
}
