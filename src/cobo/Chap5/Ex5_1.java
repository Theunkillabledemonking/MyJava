package src.cobo.Chap5;

import java.util.Arrays; // ctrl+shift+o 자동으로 improt 문 추가

public class Ex5_1 {
  public static void main(String[] args){
    int[] iArr = {100, 95, 80, 70, 60}; // 길이가 5인 int 배열
    for(int i=0; i<iArr.length; i++){
      System.out.println(iArr[i]);
    }
    System.out.println(iArr); //객체 주소만 출력
    System.out.println(Arrays.toString(iArr));
  }
}
