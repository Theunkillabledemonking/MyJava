package src.OOP;

interface Printer {
    void print();
}

class SmartPrinter implements Printer {
    @Override
    public void print() {
        System.out.println("문서 출력");
    }

    public void scan() {
        System.out.println("문서 스캔");
    }
}

public class InterfacePolymorphism {
    public static void main(String[] args) {
        Printer printer = new SmartPrinter();

        printer.print(); // OK (인터페이스에 정의된 메서드)

        // printer.scan(); // 오류 발생: Printer 타입에는 scan() 메서드가 없음
    }
}
