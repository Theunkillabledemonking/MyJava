package src.etCetera;

public class arrayLimit {
  public static void main(String[] args) {
    int[] numbers = new int[3];
    numbers[0] = 10;
    numbers[1] = 20;
    numbers[2] = 30;

    // 더 많은 데이터를 저장하기 위해 배열 크기를 늘려야 하는 상황
    int[] newNumbers = new int[5];

    // 기본 배열 내용을 새로운 배열에 복사
    for (int i = 0; i < numbers.length; i++) {
      newNumbers[i] = numbers[i];
    }

    // 새로운 데이터 추가
    newNumbers[3] = 40;
    newNumbers[4] = 50;

  }
}
