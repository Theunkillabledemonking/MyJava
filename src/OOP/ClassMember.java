package src.OOP;

class Car {
    static int totalCars = 0; // 클래스 변수 (모든 인스턴스가 공유)
    String model; // 인스턴스 변수 (각 객체마다 개별 저장)

    Car(String model) {
        this.model = model;
        Car.totalCars++; // 클래스 변수는 클래스명으로 접근
    }

    void showModel() { // 인스턴스 메서드 (객체가 필요)
        System.out.println("Model: " + model);
    }

    static void showTotalCars() { // 클래스 메서드 (객체 없이 호출 가능)
        System.out.println("Total Cars: " + Car.totalCars);
    }
}
public class ClassMember {
    public static void main(String[] args) {
        Car.showTotalCars(); // 클래스 메서드 호출 (객체 없이 사용 가능)

        Car car1 = new Car("Tesla");
        Car car2 = new Car("Samsung");

        car1.showModel(); // 객체를 통해 인스턴스 메서드 호출
        car2.showModel();

        Car.showTotalCars(); // 모든 객체가 공유하는 클래스 변수 값 출력
    }
}
