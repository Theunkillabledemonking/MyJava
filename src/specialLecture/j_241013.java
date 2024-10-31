package specialLecture;
import java.util.Scanner;
public class j_241013 {
    // OOP -> Method (메서드)
    public static void main(String[] args){
        // System.out.println("hello");
        Scanner scanner = new Scanner(System.in);

        // //short 
        // short barShort = scanner.nextShort();
        // //in
        // int barInt = scanner.nextInt();
        // //long
        // long barLong = scanner.nextLong();

        // //float
        // float barFloat = scanner.nextFloat();
        // //double
        // double barDouble = scanner.nextDouble();

        // //char
        // char barChar = scanner.next().charAt(0); //지정한 글자열의 0번째 index를 반환한다.
        // //string
        // String barString = scanner.nextLine();
        // //boolean
        // boolean barBoolean = scanner.nextBoolean();
        // // STD IO Standard Input Output
        // // Input(keyboard, mouse) -> S/W -> Output(화면 출력, 모터)

        // String bar = scanner.next();
        // System.out.println(bar);

        // scanner.nextLine();
        // String foo = scanner.nextLine();
        // System.out.println(foo);

        // 문자두 개를 각각 키보드로부터 입력 받아
        // 문자열 값이 같으면 "참" 아니면 "거짓" 을 출력
        // 예시 : "hello", "hello" -> "참"
        // 예시 : "hello" , "world" -> "거짓"

        String input_Frist = scanner.nextLine();
        String input_Second = scanner.nextLine();

        if (input_Frist.equals(input_Second)){
            System.out.println("참");
        } else {
            System.out.println("거짓");
        }

        //문자열 a~z 를 입력 받아
        // 대문자는 소문자로, 소문자는 대문자로 출력하는 프로그램 작성
        // 예시1 : 'a' -> 'A'
        // 예시2 : 'D' -> 'd'
        char inputChar = scanner.nextLine().charAt(0);
        char artChart =  ('A' >= inputChar && inputChar <= 'Z') ? (char)(inputChar + 32) : inputChar;
        System.out.println(artChart);

    }
}