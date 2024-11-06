package src.etCetera;

public class nested {
  public static void main(String[] args) {
    // 학생들의 성적 평균을 기준으로 학점을 부여
    // 학생들의 성적 2차원 배열로 관리

    int[][] scores = {
        {85, 90, 78},  // 학생 1의 정수
        {92, 88, 95},  // 학생 2의 정수
        {70, 60, 75}   // 학생 3의 정수
    };

    // 전체 학생에 대한 순회
    for (int i = 0; i < scores.length; i++) {
      int total = 0;

      // 각 학생의 점수 합계 계산
      for (int j = 0; j <scores[i].length; j++) {
        total += scores[i][j];
      }

      int avg = total / scores[i].length; // 평균 점수 계산
      System.out.println("학생 " + (i + 1) + "의 평균 점수: " + avg);

      // 평균 점수에 따른 학점 부여
      if (avg >= 90) {
        System.out.println(" 학점: A");
      } else if (avg >= 80) {
        System.out.println(" 학점: B");
      } else if (avg >= 70) {
        System.out.println(" 학점: C");
      } else {
        System.out.println(" 학점: F");
      }
    }


  }
}
