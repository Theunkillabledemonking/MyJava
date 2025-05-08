package src.OOP;

// 운전 가능한 규약
interface Driveable {
    void drive();
}

// 비행 가능한 규약
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

interface Amphibious extends Flyable, Swimmable {
    void transform();
}

class AmphibiousCar implements Amphibious {
    public void fly() {
        System.out.println("f");
    }

    public void transform() {
        System.out.println("t");
    }

    public void swim() {
        System.out.println("s");
    }
}

// 둘 다 가능한 드론카 규약 (인터페이스 다중 상속)
interface DroneCar extends Driveable, Flyable {
    void switchMode(); // 비행모드 주행모드 전환
}

public class AbstractInheritance {
    public static void main(String[] args) {
        Flyable f = new AmphibiousCar();
        Swimmable s = new AmphibiousCar();
        Amphibious a = new AmphibiousCar();
    }
}
