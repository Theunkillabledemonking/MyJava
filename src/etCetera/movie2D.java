package src.etCetera;

public class movie2D {
  public static void main(String[] args) {

    // 영화관 좌석 상태 (0: 빈 좌석, 1: 예약된 좌석)
    int[][] seats = {
        {0, 1, 0},
        {1, 0, 1},
        {0, 0, 0}
    };
    // 좌석 출력
    System.out.println("영화관 좌석 상태: ");
    for(int i = 0; i < seats.length; i++) {
      for (int j = 0; j < seats[i].length; j++) {
        System.out.print(seats[i][j] + " ");
      }
      System.out.println();
    }

    // 특정 좌석 예약
    seats[2][1] = 1; // 3번째 행 2번째 열 좌석 예약
    System.out.println("\n 좌석 상태 업데이트 후:");
    for (int[] row : seats) {
      for (int seat : row) {
        System.out.print(seat + " ");
      }
      System.out.println();
    }

  }



}
