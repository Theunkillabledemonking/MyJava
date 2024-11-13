package javac;

import java.util.Scanner;

public class j_241113 {
	public static void printDiagonalMatrix(int argRow, int argCol, boolean isBidirectional) {

		for (int i = 0, reverseIndex = argRow - 1; i < argRow; i++, reverseIndex--) {
			for (int j = 0; j < argCol; j++) {
				if (i == j || (j == reverseIndex && isBidirectional)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
			
	}
		
	public static void printCountingStar(int argRow, int argCol) {
		for (int i = 0; i < argRow; i++) {
			for (int j = 0; j < argCol; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {

		// 스캐너 객체
		Scanner sc = new Scanner(System.in);
		// 초기값 설정
		int m = 0;
		int n = 0;
		int options = 0;
		int count = 1;
		int result = 0;
		boolean check = true;
		
		while (true) {
			if (check) {
				System.out.println(count + "번째 실행");
				System.out.println("메뉴를 입력해주세요 1 ~ 4");
				System.out.println("1. M X N Matrix를 출력");
				System.out.println("2. 좌상단->우하단 대각선 삭제 후 M X N Matrix 출력");
				System.out.println("3. 좌상단->우하단 + 우상단->좌하단 대각선 삭제 후 M X N Matrix 출력");
				System.out.println("4. 종료");
			}
			options = sc.nextInt();

			// switch 문 생성
			result = switch (options) {
			case 1 -> 1;
			case 2 -> 2;
			case 3 -> 3;
			case 4 -> 4;
			default -> -1;
			};

			// 종료
			if (result == 4) {
				System.out.println("종료합니다.");
				break;
			}

			if (1 <= result || result >= 4) {
				break;
			}
			check = false;
			System.out.println("에러! 재입력");
		}

		while (true) {
			// m, n 값 입력 받기
			System.out.println("M과 N값을 입력해주세요");
			m = sc.nextInt();
			n = sc.nextInt();

			// m과 n이 0 이하 인 경우 재입력
			if (m <= 0 || n <= 0) {
				System.out.println("1이상 값 입력해주세요");
				continue;
			}

			// 별 출력
			switch(result) {
				case 1:
					printCountingStar(m, n);
					break;
				case 2:
					printDiagonalMatrix(m, n, false);
					break;
				case 3:
					printDiagonalMatrix(m, n, true);
					break;
				
			}

			// 횟수 증가
			System.out.println(count + "번째 실행");
			count++;

	}
	
	

	}
}

