package src.OOP;
interface PowerControllable {
    void powerOn(); // 반드시 구현
    void powerOff();
}

class SmartphoneV1 implements PowerControllable {

    @Override
    public void powerOn() {
        System.out.println("스마트폰이 켜집니다.");
    }

    @Override
    public void powerOff() {
        System.out.println("스마트폰이 꺼집니다.");
    }
}

class LaptopV1 implements PowerControllable {

    @Override
    public void powerOn() {
        System.out.println("노트북이 부팅됩니다.");
    }

    @Override
    public void powerOff() {
        System.out.println("노트북이 종료됩니다.");
    }
}
public class InterfaceAbstract {
    public static void main(String[] args) {

        // 스마트폰 제어
        PowerControllable smartphone = new SmartphoneV1();
        smartphone.powerOn();
        smartphone.powerOff();

        // 노트북 제어
        PowerControllable laptop = new LaptopV1();
        laptop.powerOn();
        laptop.powerOff();

    }
}
