package src.OOP;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ClassFileLoader {
    private String filePath;
    private String fileContent = "";

    // 생성자를 통해 파일 경로 받아서 초기화
    ClassFileLoader(String filePath) {
        this.filePath = filePath;
        loadFile(); // 파일 로드 메서드 실행
    }

    // 파일을 읽어서 저장
    private void loadFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                fileContent += line + "\n";
            }
            System.out.println("파일 로드 성공");
        } catch (IOException e) {
            System.out.println("파일 로드 실패: " + e.getMessage());
        }
    }

    // 파일 내용 출력
    void printFileContent() {
        System.out.println("파일 내용 \n" + fileContent);
    }
}

public class FileLoader {
    public static void main(String[] args) {
        ClassFileLoader loader = new ClassFileLoader("sample.txt"); // 파일 로드
        loader.printFileContent(); //파일 내용 출력
    }
}
