import java.util.Scanner;

public class j_241111_next {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("M X N 값을 입력해주세요!");
            int column = sc.nextInt(); // 행의 수 (M)
            int filed = sc.nextInt();  // 열의 수 (N)

            if (column <= 0 || filed <= 0) {
                System.out.println("1 이상의 값을 입력해주세요.");
                continue;
            }

            char[][] m = new char[column][filed];

            // 배열 초기화
            for (int i = 0; i < column; i++) {
                for (int j =0; j < filed; j++) {
                    if (i == j) {
                        m[i][j] = ' ';
                    } else {
                        m[i][j] = '*';
                    }
                } // 내부 'j' 반복문의 닫는 중괄호
            } // 외부 'i' 반복문의 닫는 중괄호

            // 배열 출력
            for (int i = 0; i < column; i++) {
                for (int j = 0; j < filed; j++) {
                    System.out.print(m[i][j]);
                }
                System.out.println();
            }
            break;
        }
        sc.close();
    }
}
