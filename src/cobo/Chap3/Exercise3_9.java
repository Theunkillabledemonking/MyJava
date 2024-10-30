package Lab.src.cobo.Chap3;

public class Exercise3_9 {
  public static void main(String[] args) {
    // 값이 영문자 대문자 이거나 숫자일 때만 true
    char ch = 'z';
    boolean b = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');

    System.out.println(b);
  }
}
