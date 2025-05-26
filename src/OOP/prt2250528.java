package src.OOP;
import java.io.IOException;
import java.io.*;
import java.util.logging.FileHandler;

public class prt2250528 {
    public static void main(String[] args) {
        String filePath = "example.txt"; // 읽을 파일 경로

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {             ;

        } catch (IOException e) {
            // 파일이 없거나 읽는 중 문제가 생겼을 때 예외 처리
            System.out.println("파일을 읽는 도중 오류가 발생했습니다." + e.getMessage());
        }
    }
}
