package src.etCetera;

import java.util.Scanner;

public class exDoWhile {
  public static void main(String[] args){
    String correctPassword = "secure123"; // 올바른 비밀번호
    String inputPassword;

    Scanner scanner = new Scanner(System.in);

    do {
      // 반복할 코드
      System.out.print("비밀번호를 입력하세요 :");
      inputPassword = scanner.nextLine();

      if (!inputPassword.equals(correctPassword)) {
        System.out.println("비밀번호가 틀렸습니다. 다시 시도하세요.");
      }

    } while (!inputPassword.equals(correctPassword));
    // 비밀번호가 맞을 때까지 반복

    System.out.println("비밀번호가 올바릅니다.");
    scanner.close();
  }


}
