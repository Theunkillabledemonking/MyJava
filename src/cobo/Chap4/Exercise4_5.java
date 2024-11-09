import java.util.Scanner;

public class Exercise4_5 {
  public static void main(String[] args) {

    int i = 0;
    while (i <= 10) {
      int j = 0; // 내부 루프 돌기전에 j를 초기화
      while (j <= i) {
          System.out.print("*");
          
          j++;
      }
      System.out.println();
      i++;  
    }


  }
}
