package src.etCetera;

import java.util.Random;

public class seedRandom {
  public static void main(String[] args) {
    Random random1 = new Random(12345); // 시드가 12345로 설정된 경우
    Random random2 = new Random(12345); // 같은 시드를 사용
    Random bar = new Random(); // Seed 값이 없기 때문에, 실행 시 현재시간을 시드값으로 활용

    System.out.println("random: " + random1.nextInt());
    System.out.println("random: " + random2.nextInt());

    for(int i = 0; i < 5; i++) {
      System.out.println(bar.nextInt());
    }

    // 두 출력은 같은 시드 떄문에 동일한 값을 출력
  }
}
