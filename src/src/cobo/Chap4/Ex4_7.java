package Lab.src.cobo.Chap4;

public class Ex4_7 {
  public static void main(String[] args) {
    int num =0;
    // 괄호 안의 내용을 5번 반복한다
    // 1부터 quiz. 1~10
    for (int i = 1; i <= 20; i++) {
      num = (int)  (Math.random() * 20) + 1;
      System.out.println(num);
    }
  }
}
