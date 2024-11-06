package src.etCetera;

// 학생 클래스를 만들어 성적 데이터를 처리하는 코드
class Student {
  String name;
  int[] scores;

  Student(String name, int[] scores) {
    this.name = name;
    this.scores = scores;
  }

  // 학생의 총합을 계산하는 매서드
  int getTotalScore() {
    int total = 0;
    for (int score : scores) {
      total += score;
    }
    return total;
  }

  // 학생의 평균을 계산하는 메서드
  int getAverageScore() {
    return getTotalScore() / scores.length;
  }
}
public class optimizingDataStructure {
  public static void main(String[] args){

    // 학생 객체 배열 생성
    Student[] students = {
            new Student("학생 1", new int[]{85, 90, 78}),
            new Student("학생 2", new int[]{92, 88, 95}),
            new Student("학생 3", new int[]{70, 60, 75})
    };

    int totalSum = 0;

    // 1차원 반복문으로 성적 합계 계산
    for (Student student : students) {
      totalSum += student.getTotalScore();
    }

    int totalStudents = students.length;
    int totalSubjects = students[0].scores.length;
    int average = totalSum / (totalStudents * totalSubjects);

    System.out.println("총합: " + totalSum);
    System.out.println("평균: "  + average);
  }
}
