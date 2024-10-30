package Java_project.src.specialLecture;
import java.util.*;
public class j_241028_2 {
    public static void main(String[] args) {
        

        // Scanner가 실수인가 정수인가? 확인
        Scanner sc = new Scanner(System.in);
        // 변수의 유효 범위값을 비교
        System.out.println("삼각형 세 변의 길이를 입력하세요.");

        int inputValue1 = sc.nextInt();
        int inputValue2 = sc.nextInt();
        int inputValue3 = sc.nextInt();
        String tryAngle = "";

        // 아니 ! 삼각형을 만들 수가 없어!
        if (inputValue1 + inputValue2 <= inputValue3 || inputValue2 + inputValue3 <= inputValue1 || inputValue1 + inputValue3 <= inputValue2){
            System.out.println("삼각형을 형성할 수 없어요");
            return;
        }
        // 삼각형 가능해?
        // 응!
        if (inputValue1 == inputValue2 && inputValue1 == inputValue3) {
            tryAngle = "정삼각형 ";
        } else if (inputValue1 == inputValue2 || inputValue2 == inputValue3 || inputValue1 == inputValue3){
            tryAngle = "이등변삼각형 ";
        } else {
            tryAngle = "부등변삼각형 ";
        }
        System.out.println(tryAngle + "입니다.");

        

    }
}
