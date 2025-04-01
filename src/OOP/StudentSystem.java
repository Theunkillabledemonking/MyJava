package src.OOP;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class StudentV2 {
    // 학번, 이름, 국어, 수학, 영어, 평균
    int id;
    String name;
    private int ScoreKorea;
    private int ScoreMath;
    private int ScoreEnglish;
    private int sum;
    private float avg;

    StudentV2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    boolean setScore(int ScoreKorea, int ScoreMath, int ScoreEnglish) {
        if (ScoreKorea < 0 || ScoreMath < 0 || ScoreEnglish < 0) {
            System.out.println("잘못된 입력 값");
            return false;
        }

        if (ScoreKorea > 100 || ScoreMath > 100 || ScoreEnglish > 100) {
            System.out.println("잘못된 입력 값");
            return false;
        }
        this.ScoreKorea = ScoreKorea;
        this.ScoreMath = ScoreMath;
        this.ScoreEnglish = ScoreEnglish;

        return true;
    }

    int getScoreKorea() {
        return ScoreKorea;
    }

    int getScoreMath() {
        return ScoreMath;
    }

    int getScoreEnglish() {
        return ScoreEnglish;
    }

    int getSum () {
        sum = ScoreKorea + ScoreMath + ScoreEnglish;
        return sum;
    }

    float getAvg () {
        avg = (float) sum / ScoreKorea;
        return avg;
    }
}

class StudentManageV2 {
    StudentV2[] stdList;
    final int MAX_SIZE = 100;
    int StudentCount = 0;

    // 생성자
    StudentManageV2() {
        stdList = new StudentV2[MAX_SIZE];
    }

    void addStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.println("학번을 입력하세요");
        int stdId = sc.nextInt();
        for (int i = 0; i < stdList.length; i++) {
            if (stdList[i].id == stdId) {
                System.out.println("존재하는 학번입니다");
                return;
            }
        };
        System.out.println("이름을 입력하세요");
        String stdName = sc.next();

        StudentV2 s = new StudentV2(stdId, stdName);

        System.out.println("국어성적");
        int stdKorea = sc.nextInt();
        System.out.println("수학성적");
        int stdMath = sc.nextInt();
        System.out.println("영어성적");
        int stdEnglish = sc.nextInt();

        if (s.setScore(stdKorea, stdMath, stdEnglish)) {
            stdList[StudentCount] = s;
            StudentCount++;
            System.out.println("등록이 완료되었습니다");
        } else {
            System.out.println("잘못된 입력값입니다.");
        }
    }

    void StudentPrint() {
        if (stdList.length == 0) {
            System.out.println("학생이 존재하지 않습니다.");
            return;
        }
        for (int i = 0; i < StudentCount; i++ ) {
            StudentV2 s = stdList[i];
            System.out.printf("학번:%d 이름:%s | 국어:%d, 수학:%d, 영어:%d, | 합계:%d 평균:%.2f\n" +
                    s.id, s.name, s.getScoreKorea(), s.getScoreMath(), s.getScoreEnglish(),
                    s.getSum(), s.getAvg());

        }
    }

    void ChoiceStdPrint(int argId) {
        for (int i = 0; i < StudentCount; i++) {
            if (stdList[i].id == argId) {
                StudentV2 s = stdList[i];
                System.out.printf("학번:%d 이름:%s | 국어:%d, 수학:%d, 영어:%d, | 합계:%d 평균:%.2f\n" +
                                s.id, s.name, s.getScoreKorea(), s.getScoreMath(), s.getScoreEnglish(),
                        s.getSum(), s.getAvg());
            } else {
                System.out.println("해당학생은 존재하지 않습니다.");
            }
        }
    }
}

public class StudentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        StudentManageV2 stdMng = new StudentManageV2();

        while (true) {
            System.out.println("=== 학생 성적 관리 프로그램 ===");
            System.out.println("1. 학생 성적 입력");
            System.out.println("2. 전체 학생 성적 출력");
            System.out.println("3. 해당 학생 성적 출력");
            System.out.println("4. 프로그램 종료");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    stdMng.addStudent();
                    break;
                case 2:
                    stdMng.StudentPrint();
                    break;
                case 3:
                    System.out.println("출력하실 학번을 입력하세요");
                    int id = sc.nextInt();
                    break;
                case 4:
                    System.out.println("시스템 종료.");
                    return;
            }
        }
    }
}
