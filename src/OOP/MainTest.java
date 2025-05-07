package src.OOP;


interface Scan {
    // public abstract void doScan()
    void doScan();
    // public static final int scanNum = 2;
    int scanNum = 2;

    default void prePaper() {
        powerOn();
        System.out.println("Pre-paper");
    }

    static void prePower() {
        System.out.println("Pre-power");
    }

    private void powerOn() {
        System.out.println("Power on");
    }
}

class Equipment implements Scan {
    public void doScan() {
        System.out.println("Equipment scan");
        Scan.prePower();
    }
}

class Device implements Scan {
    int scanNum = 10;
    @Override
    public void doScan() {
        System.out.println(Scan.scanNum);
    }

    @Override
    public void prePaper() {
        Scan.super.prePaper(); // 부분 재정립 가능

    }
}
public class MainTest {
    public static void main(String[] args) {

    }
}
