package src.OOP;
class Users {
    private String userName;
    private String email;

    // 1. 디폴트 생성자 (기본값 설정)
    Users() {
        this.userName = "Guest";
        this.email = "guest@example.com";
        System.out.println("디폴트 생성자로 객체 생성됨 (기본값 설정)");
    }

    // 파라미터 생성자 (사용자가 입력한 값으로 초기화)
    Users(String userName, String email) {
        this.userName = userName;
        this.email = email;
        System.out.println("파라미터 생성자로 객체 생성됨");
    }

    void printUserInfo() {
        System.out.println("사용자명: " + (userName != null ? userName : "Unknown") +
                        ", 이메일: " + (email != null ? email : "No email"));
    }
}
public class ExamUserInfoMain1_1 {
    public static void main(String[] args) {

        // 4. 디폴트 생성자로 객체 생성
        Users user1 = new Users(); // 기본값이 설정
        user1.printUserInfo();

        System.out.println("--------------------------------");

        // 5. 파라미터 생성자로 객체 생성
        Users user2 = new Users("kim", "seng@gmail.com");
        user2.printUserInfo();
    }
}
