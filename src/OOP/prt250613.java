package src.OOP;

// 함수형 인터페이스
interface MathOperation {
    int operate(int a, int b);
}

interface PrintMath {
    void operate(String s);
}


public class prt250613 {
    public static void main(String[] args) {

        MathOperation opAdd = ( a, b ) -> a + b;
        PrintMath opMul = System.out::print;
        opMul.operate("sub");

    }
}
