package src.etCetera;

public class arrayLimit2 {
  public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40};

    // 인덱스 2에 25를 삽입하고자 하는 경우
    int[] newNumbers = new int[5];

    // 기존 데이터를 복사하여 2번 인덱스
    // 이후 요소를 한 칸씩 뒤로 이동
    for (int i = 0; i < 2; i++) {
      newNumbers[i] = numbers[i];
    }

    newNumbers[2] = 25; // 새로운 값 삽입
    for (int i = 2; i < numbers.length; i++) {
      newNumbers[i + 1] = numbers[i];
    }

    int[] bar = {10, 20, 30, 40};

    // 인덱스 1에 있는 20을 삭제하고자 하는 경우
    for (int i = 1; i < bar.length - 1; i++) {
      bar[i] = bar[i + 1];
    }

    // 마지막 원소는 의미 없는 데이터가 되므로 초기화
    // 40을 삭제된 상태로 보기 위해 0으로 설정
    numbers[numbers.length - 1] = 0;
  }
}
