package src.etCetera;

public class matrix_labe {
  public static void main(String[] args){
    int img[][][] = {
        { {100, 200}, {1, 78}  },
        { {-1, -2},   {300, 0} },
        { {50, 70},   {7, 90}  }
    };
    // Flag Variable
    boolean isFound = false;

    bar:
    for (int i = 0; i < 3 && !isFound; i++) {       // i 그림의 개수
      for (int j = 0; j < 2; j++) {     // 하나의 table의 행의 개수
        for (int k = 0; k < 2; k++) {   // 한개의 record 안에 필드의 개수
          System.out.print(img[i][j][k] + "\t");
          if(img[i][j][k] == 78) {
            isFound = true;
            break;    // 조건문은 탈출하지만, 반복문은 탈출하지 못한다. (쓸데없는 반복)
            //break bar;  // 반복문과 조건문 동시에 탈출을 한다. -> bar(label)을 선언한 시점으로
                       // 실무에서는 사용하지 않음. 유의할 것
                      // 실무에서는 !isFound를 사용해 비교함. 바로 종료
          }
        }
        System.out.println();
      }
      System.out.println("---------------------");

      // 배열안에 78을 어떻게 찾나
      // 플래그 변수로 순회하면서 찾기
      // 순차적으로 접근 각 테이블의 모든 행, 열, 장을 순회하면서
      // 반복문 구조가 중첩 구조로 이루어진다.
    }
    if(isFound) {
      System.out.println("78을 찾았습니다.");
    } else {
      System.out.println("78을 못 찾았습니다.");
    }
  }
}
