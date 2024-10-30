package Lab;
import java.util.*;

public class flowcontrolLab3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      // 성적 등급 입력
      System.out.print("학생의 성적 등급을 입력하세요 (A, B, C, D, F): ");
      String grade = sc.next().toUpperCase();

      // 성적 등급 예외 처리
      if (grade.length() != 1 || !(grade.charAt(0) >= 'A' && grade.charAt(0) <= 'F')) {
        System.out.print("잘못된 입력입니다. 다시 입력하세요.");
        continue;
      }

      // 출석 등급 입력
      System.out.print("학생의 출석 등급을 입력하세요 (Excellent, Average, Poor): ");
      String attendance = sc.next().toUpperCase();
      if (!(attendance.equals("AVERAGE") || attendance.equals("POOR") || attendance.equals("EXCELLENT"))) {
        System.out.print("잘못된 입력입니다. 다시 입력하세요.");
        continue;
      }

      // switch 구문으로 판별 후 출력
      String result = switch (grade) {
        case "A" -> {
          if (attendance.equals("EXCELLENT")) yield "전액 장학금 및 추가 지원금 지급";
          else if (attendance.equals("AVERAGE")) yield "전액 장학금";
          else yield "장학금 없음";
        }
        case "B" -> {
          if (attendance.equals("EXCELLENT")) yield "반액 장학금";
          else yield "장학금 없음";
        }
        case "C", "D" -> {
          if (attendance.equals("POOR")) yield "장학금 없음, 재수강 권장";
          else yield "장학금 없음";
        }
        default -> "장학금 없음, 재수강 권장";
      };

      System.out.println("결과: " + result);
      break;
    }
    sc.close();
  }
}
