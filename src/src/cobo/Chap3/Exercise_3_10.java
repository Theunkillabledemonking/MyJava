package Lab.src.cobo.Chap3;

public class Exercise_3_10 {
  public static void main(String[] args) {
    // 대문자를 소문자로 변경
    // 문자 ch 저장된 문자가 대문자인 경우 소문자로 변경
    // 문자코드는 소문자가 대문자보다 32만큼 더큼

    char ch = 'A';

    char lowerCase = (ch >= 'A' && ch <= 'Z' ) ? (char)(ch + 32) : ch;

    System.out.println("ch:"+ch);
    System.out.println("ch to lowerCase"+lowerCase);
  }
}
