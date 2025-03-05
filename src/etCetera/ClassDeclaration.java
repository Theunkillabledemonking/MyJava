package src.etCetera;

// 자동차 클래스 (설계도)
class MyCar {
  // 필드(멤버 변수): 객체의 속성
  String brand; // 멤버 변수
  int speed;

  // 생성자: 객체가 만들어질 때 실행되는 초기화 코드
  MyCar(String brand, int speed) {
    this.brand = brand; // 생성자
    this.speed = speed;
  }

  // 메서드(멤버 함수): 객체의 행동
  void accelerate () {
    speed += 10;
    System.out.println(brand + "속도 증가:" + speed + "km/h");
  }

  void brake () {
    speed -= 10;
    System.out.println(brand + "속도 감소:" + speed + "km/h");
  }

  void drive () { // 메서드
    System.out.println(brand + "자동차가 주행중입니다.");
  }
}

// 실행 코드
public class ClassDeclaration {
  public static void main(String[] args) {
    // 객체 생성 (설계도로 자동차를 만드는 과정)
    MyCar car1 = new MyCar("Hyundai", 0);
    MyCar car2 = new MyCar("BMW", 20);

    // 객체의 메서드 호출 (자동차 운전)
    car1.accelerate(); // Hyundai 속도 증가: 10km/h
    car1.drive();
    car2.brake(); // BMW 속도 감소: 10km/h
    car2.drive(); // dot 연산자를 이용하여 멤버 접근 가능
  }
}
