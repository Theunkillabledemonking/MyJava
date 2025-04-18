package cobo.Chap5;

import java.util.Scanner;

public class Ex5_10 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"},        //words[0][0], words[0][1]
                {"computer", "컴퓨터"},   //words[1][0], words[1][1]
                {"integer", "정수"}      //words[2][0], words[2][1]
        };

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?", i+1, "chair");
            //                  숫자, 문자열 지시자
            String tmp = sc.nextLine() ;

            if(tmp.equals(words[i][0])) {
                System.out.printf("정답입니다.%n%n");//줄바꿈문자
            } else {
                System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);

            }
        }
    }
}
