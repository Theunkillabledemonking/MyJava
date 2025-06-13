package src.OOP;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

interface Test3 {
    void print();
}


public class prt250609V2 extends JFrame {
    public static void main(String[] args) {
        Test3 test = new Test3() { // 익명으로 정의
            @Override
            public void print() {
                System.out.println("hello world");
            }

        };
    }
}
// 기획x 팀 구성 빨리 부분 나누고
// 팀 -> 자율적(죽도 밥도 안됨, 개발 능력x) 2. 랜덤(개발능력)