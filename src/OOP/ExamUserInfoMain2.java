package src.OOP;

class UserInfo {
    private String username;
    private String email;

    // 생성자에서 사용자 정보 검증
    UserInfo(String username, String email) {
        if (username.isEmpty() || email.isEmpty()) {
            throw new IllegalArgumentException("사용자명과 이메일을 필수 입력값 입니다.");
        }
        this.username = username;
        this.email = email;
    }

    void printUserInfo() {
        System.out.println("사용자명: " + username + ", 이메일: " + email);
    }
}


public class ExamUserInfoMain2 {
    public static void main(String[] args) {
        try {
            UserInfo user1 = new UserInfo("Hong", "eax@gmail.com");
            user1.printUserInfo();

            // 잘못된 사용자 생성 (예외)
            UserInfo user2 = new UserInfo("", "abc@gmail.com");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
