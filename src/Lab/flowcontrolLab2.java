package Lab;
import java.util.*;

public class flowcontrolLab2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while(true){
      // 1부터 ~ 7까지의 정수 입력 받기
      System.out.print("1~7 사이의 숫자를 입력하세요: ");
      int weekends = scanner.nextInt();

      // 잘못된 숫자일 경우 예외 처리, 올바른 값 입력할 떄까지 재입력
      if (!(weekends >= 1 && weekends <= 7)){
        System.out.println("유효하지 않은 숫자입니다. 1~7 사이의 숫자를 입력하세요");
        continue;
      }

      //switch 문을 사용하요 구분
      String typeOfDay = switch (weekends) {
        case 1, 2, 3, 4, 5 -> {
          if (weekends == 1) yield "월요일, 주중";
          else if (weekends == 2)  yield "화요일, 주중";
          else if (weekends == 3) yield  "수요일, 주중";
          else if (weekends == 4) yield  "목요일, 주중";
          else yield "금요일, 주중";
        }

        case 6, 7 -> {
          if (weekends == 6) yield "토요일, 주말";
          else yield "일요일, 주말";
        }

        default -> "Unknown";
      };

    System.out.println(typeOfDay);
    break;


    }



  }
}
