//package src.OOP;
//
//class Car {
//    // 인스턴스 멤버 변수 ( 객체별 속성 )
//    String brand;
//
//    // 클래스 멤버 변수 ( 모든 객체 공유 )
//    static int totalCars = 0;
//}
//
//public class TestMain {
//    public static void main(String[] args) {
//        Car car = new Car("Hyundai");
//        Car car2 = new Car("Mercedes");
//
//        // 클래스 멤버 접근 방법 1: 클래스명 사용 (권장)
//        System.out.println("총 자동차 개수 (클래스명 사용): " + Car.totalCars);
//
//        // 클래스 멤버 접근 방법 2: 참조 변수를 통해 접근 (비권장)
//        System.out.println("총 자동차 개수 (참조 변수 사용): " + car.totalCars);
//        System.out.println("총 자동차 개수 (참조 변수 사용): " + car2.totalCars);
//    }
//}
