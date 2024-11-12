package javac;

import java.util.*;

public class j_241112_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 초기값 설정
		int m = 0;
		int n = 0;

		while (true) {
			System.out.println("M, N값을 입력해주세요");
			// m , n 값 입력 받기
			m = sc.nextInt();
			n = sc.nextInt();
			if (m > 0 && n > 0) {
				break;
			}
			System.out.println("1이상 값을 입력해주세요");

		}

		// matrix 출력 양 대각선 공백으로 * 찍기
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (j == (m - 1) - i || i == j) {
//				if (i + j == m - 1 || i == j) {
					System.out.print(' ');
				}
//				 else if (i == j) {
//					System.out.print(' ');
				else {
					System.out.print('*');
				}
			}
			System.out.println(' ');
		}

		// matrix 출력 양 대각선 공백으로 * 찍기
		for (int i = 0, reverseIndex = m - 1 ; i < m; i++, reverseIndex--) {
			for (int j = 0; j < n; j++) {
				if (j == reverseIndex || i == j) {
					System.out.print(' ');
				} else {
					System.out.print('*');
				}
			}
			System.out.println(' ');
		}

	}
}

