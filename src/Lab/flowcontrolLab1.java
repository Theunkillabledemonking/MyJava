package Lab;
import java.util.*;

public class flowcontrolLab1 {
  public static void main(String[] args){

    // 나이 입력
    Scanner scanner = new Scanner(System.in);
    System.out.print("나이를 입력하세요: ");
    int age = scanner.nextInt();

    // 예외 처리 음수 x
    if (age <= 0) {
      System.out.println("나이는 음수가 될 수 없습니다. 다시 입력하세요.");
      return;
    }
    String letter = "";

    if (age <= 12) {
      letter = "어린이";
      // 청소년
    } else if (age <= 17) {
      letter = "청소년";
      // 성인
    } else if (age <= 64) {
      letter = "성인";
      // 노인
    } else {
      letter = "노인";
    }
    System.out.println(letter);

  }
}
