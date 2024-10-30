package Lab.src.specialLecture;
import java.util.Scanner;

public class specialFirst {

    // OOP -> Method (메서드)
    public static void main(String[] args){
      System.out.println("hello");
      Scanner scanner = new Scanner(System.in);

      //short
      short barShort = scanner.nextShort();
      //in
      int barInt = scanner.nextInt();
      //long
      long barLong = scanner.nextLong();

      //float
      float barFloat = scanner.nextFloat();
      //double
      double barDouble = scanner.nextDouble();

      //char
      char barChar = scanner.next().charAt(0); //지정한 글자열의 0번째 index를 반환한다.
      //string
      String barString = scanner.nextLine();
      //boolean
      boolean barBoolean = scanner.nextBoolean();
      // STD IO Standard Input Output
      // Input(keyboard, mouse) -> S/W -> Output(화면 출력, 모터)

      String bar = scanner.next();
      System.out.println(bar);

      String foo = scanner.nextLine();
      System.out.println(foo);
      // 문자두 개를 각각 키보드로부터 입력 받아
      // 문자열 값이 같으면 "참" 아니면 "거짓" 을 출력
      // 예시 : "hello", "hello" -> "참"
      // 예시 : "hello" , "world" -> "거짓"

      String input_First = scanner.nextLine();
      String input_Second = scanner.nextLine();

      if (input_First.equals(input_Second)){
        System.out.println("참"); // 둘다 객체인 경우에는 값이 비교가 된다.
      } else {
        System.out.println("거짓");
      }

      // 문자열 나로 키보드로부터 입력 받아
      // 문자열 값이 hello 참 아니면 거짓
      String hellow = scanner.next();
      if (hellow == "hello"){ //리터럴 상수인경우에는 같다고 비교가 된다.
        System.out.println("hello");
      } else {
        System.out.println("거짓");
      }

      char inputChar = scanner.next().charAt(0);
      if ('a' <= inputChar && inputChar <= 'z'){
        inputChar += 32;
      } else if ('A' <= inputChar && inputChar <= 'Z'){
        inputChar -= 32;
      }

    }
  }


