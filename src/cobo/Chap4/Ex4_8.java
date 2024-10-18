package Lab.src.cobo.Chap4;

public class Ex4_8 {
  public static void main(String[] args) {
    int i = 1 ; //scope 범위 - 선언위치로부터 선언된 블럭의 끝까지
    //조건식을 생략하면 true로 간주되어서 무한반복문이 된다.
    for (;;){ // 괄호 안의 문장을 5번 반복
      System.out.println(i + " i");
      }

    }
  }

