package src.etCetera;

// 지금부터 클래스를 정의 할 겁니다.
class Car {
  // 클래스 이름을 정의할 때에는 대문자로 정의합니다.
  // Data + Function
  // Data -> Member Variable (멤버 변수)
  String name;

  // Function -> Member method (멤버 메서드)
  void prtName() {
    System.out.println(name);
  }
}

// 실행 코드
public class helloWorld {
  public static void main(String[] args) {
    // heap 프로그램이 종료될 때 없어지거나 호출이 되지 않으면 가비지 콜렉터에 의해 소거됨.
    // 실행이 되면서(Runtime) 할당이 됨.
    int bar[] = new int[5]; // 참조변수

    Car car1 = new Car(); // Car 클래스의 인스턴스를 생성 후 변수를 선언
    Car car2 = new Car();

    car2.name = "Tesla";
    car1.name = "HYUNDAI";
    car2.prtName();
    System.out.println(car2);
  }
}
