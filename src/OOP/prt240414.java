package src.OOP;

// 반환형, 이름, 매개변수가 부모에서 정의된 메소드와 일치
// 예외, 접근제어자

class Bar1 {
    private int score;

    // Getter, Setter Method
    int getScore() { return score; }
    boolean setScore(int newScore) {
        if (newScore >= 0 && newScore <= 100) {
            score = newScore;
            return true;
        }
        return false;
    }
}

public class prt240414 {
    public static void main(String[] args) {
        Bar1 b = new Bar1();
        b.setScore(100);
        b.setScore(-100);
    }
}
