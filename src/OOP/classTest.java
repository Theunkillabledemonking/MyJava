package src.OOP;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


// 변수
// 1) 멤버변수
//    A. 인스턴스 멤버 변수
//    B. 클래스 멤버 변수
// 2) 지역변수 -> 메서드 내 선언된 변수

class Student {
    // ID, 이름, 국어, 영어, 수학, 합계점수, 평균
    int id;
    String name;
    private int scoreKorean;
    private int scoreEnglish;
    private int scoreMath;
    private int sum;
    private float avg;

    Student(int argId, String argName) {
        id = argId;
        name = argName;
    }

    boolean setScore(int argKorean, int argEnglish, int argMath) {
        if(argKorean < 0 || argEnglish < 0 || argMath < 0) {
            System.out.println("잘못된 성적 입력값입니다.");
            return false;
        }

        if(argKorean > 100 || argEnglish > 100 || argMath > 100) {
            System.out.println("잘못된 성적 입력값입니다.");
            return false;
        }

        scoreKorean = argKorean;
        scoreEnglish = argEnglish;
        scoreMath = argMath;

        return true;
    }

    int getScoreKorean() {
        return scoreKorean;
    }

    int getScoreEnglish() {
        return scoreEnglish;
    }

    public int getScoreMath() {
        return scoreMath;
    }

    int getSum() {
        sum = scoreKorean + scoreEnglish + scoreMath;
        return sum;
    }

    float getAvg() {
        avg = (float)getSum() / 3;
        return avg;
    }
}

class StdScoreMgr{
    Student[] stdList;    // 고정 크기 배열
    int studentCount = 0; // 현재까지 입력된 학생 수
    final int MAX_SIZE = 100;    // 최대학생수

    StdScoreMgr(){
        stdList = new Student[MAX_SIZE];
    }

    void addStudent() {
        if (studentCount >= MAX_SIZE) {
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("ID 입력 : ");
        int stdId = sc.nextInt();

        for (int i = 0; i < studentCount; i++) {
            if (stdList[i].id == stdId) {
                System.out.println("이미 존재하는 아이디입니다.");
                return;
            }
        }

        System.out.println("이름 입력 : ");
        String stdName = sc.next();

        Student student = new Student(stdId, stdName);

        System.out.println("국어 성적 입력 : ");
        int scoreKorean = sc.nextInt();
        System.out.println("영어 성적 입력 : ");
        int scoreEnglish = sc.nextInt();
        System.out.println("수학 성적 입력 : ");
        int scoreMath = sc.nextInt();

        if (student.setScore(scoreKorean, scoreEnglish, scoreMath)) {
            stdList[studentCount] = student;
            studentCount++;
            System.out.println("학생 성적이 등록되었습니다.");
        } else {
            System.out.println("유효하지 않은 값입니다.");
        }

    }

    void printStudent() {
        if (studentCount == 0) {
            System.out.println("등록된 학생이 존재하지 않습니다.");
            return;
        }

        for (int i = 0; i < studentCount; i++) {
            Student s = stdList[i];
            System.out.printf("ID:%d 이름:%s | 국어:%d 영어:%d 수학:%d | 합계:%d 평균:%.2f\n",
                    s.id, s.name, s.getScoreKorean(), s.getScoreEnglish(), s.getScoreMath(),
                    s.getSum(), s.getAvg());
        }
    }

    void printStudentById(int id) {
        for (int i = 0; i < studentCount; i++) {
            Student s = stdList[i];
            if (s.id == id) {
                System.out.printf("ID:%d 이름:%s | 국어:%d 영어:%d 수학:%d | 합계:%d 평균:%.2f\n",
                        s.id, s.name, s.getScoreKorean(), s.getScoreEnglish(), s.getScoreMath(),
                        s.getSum(), s.getAvg());
                return;
            }
        }
        System.out.println("해당 ID의 학생을 찾을 수 없습니다.");
    }
}


public class classTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        StdScoreMgr stdMgr = new StdScoreMgr();

        while (true) {
            System.out.println("\n ==== 성적 관리 프로그램 ==== ");
            System.out.println("1. 학생 성적 입력");
            System.out.println("2. 전체 학생 성적 출력");
            System.out.println("3. 특정 학생 성적 출력");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // 학생 성적 입력
                    stdMgr.addStudent();
                    break;
                case 2:
                    // 학생 전체 성적 출력
                    stdMgr.printStudent();
                    break;
                case 3:
                    // 특정 학생 성적 출력
                    System.out.println("검색 id ");
                    int id = sc.nextInt();
                    stdMgr.printStudentById(id);
                    break;
                case 4:
                    // 시스템 종료
                    System.out.println("프로그램 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력값입니다.");
                    break;
            }
        }
    }

}
