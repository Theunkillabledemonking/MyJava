import java.util.Scanner;

public class Exercise4_5 {
  public static void main(String[] args) {

  // for (int i = 0; i <= 10; i ++) {
    //  for (int j = 0; j <= i; j++) {
    //   System.out.print("*");
    //   System.out.println();
    //   }
    //  } 
    //--> 이를 while문으로 작성하세요
    
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
