package src.OOP;

import java.io.BufferedReader; // 한 줄씩 텍스트를 파일을 읽을 수 있게 해주는 클래스
import java.io.FileReader;     // 파일로부터 문자를 읽는 데 사용하는 기본 Reader
import java.io.IOException;    // 입출력 도중 예외 발생 시 처리하기 위한 예외 클래스

// 파일을 로드하고, 내용을 저장하며 출력할 수 있는 클래스
class FileLoaderV2 {
    private String filePath;            // 읽을 파일의 경로를 저장하는 멤버 변수
    private String fileContent = "";    // 파일에서 읽은 내용을 저장할 변수 (초기값 빈 문자열)

    // 생성자: 객체 생성 시 파일 경로를 전달받고 즉시 파일을 로드함.
    FileLoaderV2(String filePath) {
        this.filePath = filePath;      // 전달받은 파일 경로를 멤버 변수에 저장
        loadFile();                    // 파일을 즉시 읽어오는 메서드 호출
    }

    // 실제 파일을 읽는 기능을 수행하는 내부 전용 메서드 (외부에 노출하지 않음)
    private void loadFile() {
        // try-with-resource 문: BufferReader를 자동으로 닫아줌
        try (BufferedReader br = new BufferedReader (new FileReader(filePath))) {
            String line; // 한 줄씩 읽이 위한 임시 변수

            // 파일의 끝까지 한 줄씩 읽어 fileContent에 누적
            while ((line = br.readLine()) != null) {
                fileContent += line + "\n"; // 줄바꿈 문자 포함하여 원형 유지
            }
            System.out.println("파일 로드 성공!");
        } catch (IOException e) {
            // 오류 메시지 출력
            System.out.println("파일 로드 실패: " + e.getMessage() );
        }
    }

    // 외부에서 파일 내용을 출력하고자 할 때 사용하는 메서드
    void printFileContent() {
        System.out.println("파일 내용:\n" + fileContent);
    }
}

// main() 메서드가 포함된 클래스 - 프로그램의 시작점
public class ExamFileLoaderMain {

    public static void main(String[] args) {
        // FileLoaderV2 객체 생성 시, 파일 경로를 인자로 전달
        // -> 생성자 내부에서 자동으로 파일 로드 수행
        //FileLoaderV2 loader = new FileLoader("./sample.txt");

        // 파일 내용을 화면에 출력
        //loader.printFileContent();
    }
}
