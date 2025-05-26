package src.OOP;
import java.io.IOException;

public class TryCatchFinally2 {
    public static void main(String[] args) {
        try {
            throw new IOException(); // Checked 예외 발생
        } catch (Exception e) {     // 상위 클래스 먼저
            System.out.println("상위 Exception");
        }
        //catch (IOException e) {   // 하위 클래스는 도달 불가능
          //  System.out.println("IOException 처리");
       // }
    }
}
