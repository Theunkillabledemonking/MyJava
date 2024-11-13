import java.util.Scanner;

public class j_241112_1 {
	public static void main(String[] args) {
		// 스캐너 객체
		Scanner sc = new Scanner(System.in);
		// 사용자로부터 M , N 정수를 입력 받아, MxN Matrix를 출력하세요
		int m = 0;
		int n = 0;
//		while (true) {
//			// 사용자값 행, 열 입력
//			System.out.println("m값과 n값을 넣어주세요!");
//			m = sc.nextInt();
//			n = sc.nextInt(); 
//			
//			// 예외처리 0이하 일시 다시 입력
//			if (m < 0 || n < 0) {
//				System.out.println("1이상 값 입력해주세요");
//				continue;
//			}
//			
//			
//			// 별 찍기
//			for(int i = 0; i < m; i++) {
//				for (int j = 0; j < n; j++) {
//					System.out.print('*');
//				}
//				System.out.println(' ');
//			
//			}

		while (true) {
			// 사용자값 행, 열 입력
			System.out.println("m값과 n값을 넣어주세요!");
			m = sc.nextInt();
			n = sc.nextInt();

			// 예외처리 0이하 일시 다시 입력
			if(m > 0 && n > 0) {
				break;
			}
			
			System.out.println("1이상 값 입력해주세요");
			
//			if (m <= 0 || n <= 0) {
//				System.out.println("1이상 값 입력해주세요");
//				continue;
//			}
//			
//			break;
		}

		// 별 찍기
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(' ');
				} else {
					System.out.print('*');
				}
			}
			System.out.println(' ');
		}
	}
}

