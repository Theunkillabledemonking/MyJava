package src.OOP;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {

        int input = new Scanner(System.in).nextInt();

        try {
            if (input == 0)
                System.out.println("정상 실행");
            if (input == 1)
                throw new IOException();
            else if (input == 2)
                throw new ArithmeticException();
            else if (input == 3)
                throw new InputMismatchException();
            else
                throw new Exception();
        } catch (IOException e) {
            System.out.println("IOException 예외 발생 - 복구 알고리즘 삽입");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 예외 발생 - 복구 알고리즘 삽입");
        } catch (Exception e) {
            System.out.println("Exception: - 최상위 예외");
        } finally {
            System.out.println("finally 구문 실행");
        }
    }
}
