package src.OOP;
class Add<T, R> {
    static <T> void op(T a, T b) { return ; }
}

public class prt250616V2 {
    public static void main(String[] args) {
        // Wrapper Classes (감싸는 클래스) : Integer, Float, Double ...
        Integer myValue = 10; // Auto-boxing

        Integer x = 10;
        Integer y = 20;
        //System.out.println(Add.op(x, y));
        // Integer myValue = new Integer(10);

        int myAge = myValue; // Unboxing
    }
}
