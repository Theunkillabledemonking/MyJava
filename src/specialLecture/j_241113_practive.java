import  java.util.Scanner;
public class j_241113_practive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // row 하나만 입력 받아서
        int row = 0;
        while(true) {
            row = sc.nextInt();
            // 홀수 이상인 수일때 탈출
            if (row % 2 != 0){
                break;
            }
            // 그 이외면 계속 반복
            System.out.println("홀수만 입력해주세요");
        }
        // 삼각형 별 뽑기

        // i가 0부터 row까지 증가하면서 각 행에 j를 i번 반복하여 '*' 출력
        for (int i = 0; i < row + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // i가 row+1부터 1까지 감소하면서 각 행에 j를 i번 반복하여 '*' 출력
        for (int i = row + 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}