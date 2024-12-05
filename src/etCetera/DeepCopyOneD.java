package src.etCetera;

public class DeepCopyOneD {
  // 1차원 배열의 Deep Copy를 수행하는 메서드
  public static int[] deepCopy(int[] source) {
    // 새 배열 생성
    int[] target = new int[source.length];
    for (int i = 0; i < source.length; i++) {
      target[i] = source[i]; // 각 요소 값을 복사
    }
    return target; // 복사된 배열 반환
  }
  public static void main(String[] args) {
    int [] original = {10, 20, 30}; // 원본 배열

    // Deep Copy 수행
    int[] copied = deepCopy(original);

    // 복사된 배열 수정
    copied[0] = 99;

    // 결과 출력
    System.out.println("Original[0]: " + original[0]); // 10 (원본 값 유지)
    System.out.println("Copied[0]: " + copied[0]);     // 99 (복사본 수정)
  }
}
