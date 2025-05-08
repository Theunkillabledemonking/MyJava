package src.OOP;

interface Vehicle {
    // 상수 필드 ( 자동으로 public static final)
    int MAX_SPEED = 100;

    // 추상 메서드 ( 자동으로 public abstract)
    void start();
    void stop();

    // default 메서드 (Java 8~)
    default void checkStatus() {
        log("상태 점검 실행 중");
        System.out.println("차량 상태: 정상");
    }
    // static 메서드 (Java 8~)
    static void displayInfo() {
        System.out.println("이 인터페이스는 모든 차량의 기본 기능 규칙을 정의합니다.");
    }
    // private 메서드 (Java 9~)
    private void log(String message) {
        System.out.println("LOG: " + message);
    }
}

public class JavaInterfaceC {
    public static void main(String[] args) {

    }
}
