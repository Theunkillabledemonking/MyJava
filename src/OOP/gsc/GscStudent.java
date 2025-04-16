package src.OOP.gsc;

class MainTest {
    protected int x = 3;

    protected int getX(int x) {
        return x;
    }
}

public class GscStudent extends MainTest {
    protected GscStudent() {

    }
    void print() {
        System.out.println(getX(x));
    }
}