package specialLecture;

import java.util.Scanner;

public class middle {
    public static void printStar(int argRow, int argCol, boolean argCheck) {
        for (int i = 0, reverseIndex = argRow - 1; i < argRow; i++, reverseIndex --) {
            for (int j = 0; j < argCol; j++) {
                if (i == j || (j == reverseIndex && argCheck)) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }

    public static void printEtc(int argRow, int argCol) {
        for (int i = 0; i < argRow; i++) {
            for (int j = 0; j < argCol; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n = 0;
        int count = 1;
        int userInput = 0;
        int result = 0;
        boolean check = true;

        while(true) {
            if (check) {
                System.out.println("반호 입력");
                userInput = sc.nextInt();
                result = switch(userInput) {
                    case 1 -> 1;
                    case 2 -> 2;
                    case 3 -> 3;
                    case 4 -> 4;
                    default -> -1;
                };
            }
                if (result == 4) {
                    System.out.println("종료");
                    return;
                }

                if (1 <= result && result <= 3) {
                    break;
                }
                check =false;
            
        }

        while(check) {
            m = sc.nextInt();
            n = sc.nextInt();

            if (m <= 0 || n <= 0) {
                continue;
            }

            switch (result) {
                case 1:
                    printEtc(m, n);
                    break;
                case 2:
                    printStar(m, n, false);
                    break;
                case 3:
                    printStar(m, n, true);
                    break;
                default:
                    break;
            }
            
            System.out.println("count" + count);
            count++;
        }
    }
}
