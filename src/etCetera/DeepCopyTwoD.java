package src.etCetera;

public class DeepCopyTwoD {
  // 2차원 배열의 Deep Copy를 수행하는 메서드
  public static int[][] deepCopy(int[][] source) {
    // 새 배열 생성 (행 크기 동일)
    int[][] target = new int[source.length][];
    for (int i = 0; i < source.length; i++) {
      // 각 행에 대해 새 배열 생성 및 값 복사
      target[i] = new int[source[i].length];
      for (int j = 0; j < source[i].length; j++) {
        target[i][j] = source[i][j];
      }
    }
    return target; // 복사된 2차원 배열 반환
  }

  public static void main(String[] args) {
    int[][] original = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    }; // 원본 2차원 배열

    // Deep Copy 수행
    int[][] copied = deepCopy(original);

    // 복사된 배열 수정
    copied[0][0] = 99;

    // 결과 출력
    System.out.println("Original[0][0]: " + original[0][0]); // 1 (원본 값 유지)
    System.out.println("Copied[0][0]: " + copied[0][0]);     // 99 (복사본 수정)

  }
}
