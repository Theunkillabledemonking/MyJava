
import java.util.Scanner;

public class j_241112_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 초기값 설정
		int m = 0;

		// row 값만 받고, 홀수만 입력 가능
		while (true) {
			System.out.println("M, N값을 입력해주세요");
			// 홀수 받았을시 탈출
			m = sc.nextInt();
			if (m % 2 != 0) {
				break;
			}
			System.out.println("홀수만 입력해주세요.");

		}
		
		for (int i = 0; i <= m; i++) {
			System.out.println('*' * i);
		}
		for (int j = m+2; j == 0; j-- ) {
			System.out.println('*');
		}
	}
}
