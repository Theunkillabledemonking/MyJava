package src.etCetera;

// Shallow Copy:
// - 2차원 배열의 참조(주소)만 복사되므로,
//   Original과 Copied는 같은 배열 참조를 공유,
// - 복사된 배열(Copied)에서 특정 값을 수정하면, 원본 배열의 값도 변경됨.

public class ShallowCopyTwoD {

  // 2차원 배열의 Shallow Copy를 수행하는 메서드
  public static int[][] shallowCopy(int[][] source) {
    return source; // 배열의 참조(주소)만 복사
  }
  public static void main(String[] args) {
    int[][] original = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    }; // 원본 2차원 배열

    // Shallow Copy 수행
    int[][] copied = shallowCopy(original);

    // 복사된 배열의 값을 수정
    copied[0][0] = 99;

    // 결과 출력
    System.out.println("Original[0][0] :" + original[0][0]);
    System.out.println("Copied[0][0] :" + copied[0][0]);
  }
}
