import java.util.*;
public class j_241028_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        int age = sc.nextInt();

        System.out.println("이벤트 코드를 입력하세요!");
        String eventCode = sc.next();

        System.out.println("날짜를 입력하세요!");
        int reservDate = sc.nextInt();
        
        String outPut = "예약이 완료 되었습니다.";

        if  (!(reservDate <= 1 || 30 >= reservDate)){
            System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
            return;
        } 

        switch (eventCode) {
            case "E1":
                if (!(age >= 18)){
                    System.out.println("나이 이슈.");
                }
                break;

            case "E2":
                if (!(reservDate % 2 != 0)){
                    System.out.println("선택하신 날짜에는 예약할 수 없습니다..");
                }
                break;

            case "E3":
                if (!(age <= 16)){
                    System.out.println("나이 제한로 인해 예약할 수 없습니다.");
                } else if (!(reservDate % 7 != 0)) {
                    System.out.println("선택하신 날짜에는 예약할 수 없습니다.");
                }
                break;

            default:
                System.out.println("잘못된 입력값 입니다.");
                break;
        }
        System.out.println("예약이 완료되었습니다.");
    
    }
}
