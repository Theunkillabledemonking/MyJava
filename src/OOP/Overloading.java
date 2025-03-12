package src.OOP;

class Bar {
    // Overloading (구조적 언어에서 나왔음)

    void prtMsg (String argMsg1, char argMsg2) {
        System.out.println(1);
    }

    void prtMsg (String argMsg1, int argMsg2) {
        System.out.println(2);
    }

    void prtMsg (float argMsg1, double argMsg2) {
        System.out.println(3);
    }
}

public class Overloading {
    public static void main(String[] args) {
        Bar bar1 = new Bar();
        bar1.prtMsg("World", 7979);
        bar1.prtMsg(1.5f, 2);
        bar1.prtMsg("hello", 'W');

    }
}
