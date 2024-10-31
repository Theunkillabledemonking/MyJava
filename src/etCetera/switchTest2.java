package etCetera;

import java.util.Scanner;

public class switchTest2 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 성적 [A, B, C], 출석 [PASS, FAIL]

    // 문자열 입력 받기
    String grade = sc.next().toUpperCase();
    // 출석률 입력 받기
    String attendance = sc.next().toUpperCase();

    String result = switch (grade){

      case "A" -> {
        // 성적 A이고, 출석 PASS -> 전액 + 추가 장학금 출력
        if (attendance.equals("PASS")) yield "전액 + 추가 장학금";
        // 성적 A이고, 출석이 FAIL -> 전액
        else yield "전액 장학금";
      }
      case "B" -> {
        // 성적 B이고, 출석이 PASS -> 반액
        if (attendance.equals("PASS")) yield "반액";
        else yield  "장학금 없음!";
      }
      // 나머지는 장학금 없음
      case "C" -> "장학금 없음!";
      default -> "unknown";
    };
    //switch yield 문을 사용하여 장학금 비교
    System.out.println(result + "입니다.");
  }
}
