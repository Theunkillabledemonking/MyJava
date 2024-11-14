package src.etCetera;

public class normal { // 클래스명을 파일명과 맞추어 수정했습니다
  public static void main(String[] args) {
    System.out.println("hello");

    int[] baseball = new int[3];
    int count = 0;

    while (count < baseball.length) {
      boolean check = false;
      int random = (int)(Math.random() * 9) + 1;

      // 현재까지 채운 부분(count)만 중복 체크
      for (int i = 0; i < count; i++) {
        if (random == baseball[i]) {
          check = true;
          break;
        }
      }

      // 중복이 아니면 배열에 추가
      if (!check) {
        baseball[count] = random;
        count++;
        System.out.println("성공!");
      }

    }

    // 결과 출력
    for (int number : baseball) {
      System.out.println(number);
    }
  }
}

 