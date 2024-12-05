package src.etCetera;

public class DeepShallowCopying {
  // Shallow Copy Example
  public static void shallowCopy(int[] source, int[] target) {
      target = source; // 참조만 복사
  }

  // Deep Copy Example
  public static int[] deepCopy(int[] source) {
    int[] target = new int[source.length]; // 새롱운 배열 생성
    for (int i = 0; i < source.length; i++) {
      target[i] = source[i]; // 데이터 복사
    }
    return target;  // 복사된 배열 반환
  }
  public static void main(String[] args) {
    int[] original = {1, 2, 3};
    int[] shallowTarget = original; // Shallow Copy

    // Shallow Copy Example
    shallowTarget[0] = 99; // shallowTarget 변경
    System.out.println("Original after shallow copy: " + original[0]); // 99

    // Deep Copy Example
    int[] deepTarget = deepCopy(original); // Deep Copy 호출
    deepTarget[0] = 42;
    System.out.println("Original after deep copy: " + original[0]); // 99

  }
}
