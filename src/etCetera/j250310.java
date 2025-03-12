package src.etCetera;

class YStudent {
  // 데이터 + 함수
  int korean;
  int math;
  int english;
  int sum;
  final int NUM_OF_SUBJECT = 3;

  int id;
  String name;

  void setGrade(int argKorean, int argMath, int argEnglish) {
    korean = argKorean;
    math = argMath;
    english = argEnglish;
    sum = korean + math + english;
  }

  double getSum() {
    return sum;
  }

  int getId() {
    return id;
  }

  String getName() {
    return name;
  }

  double getAvg() {
    return sum / NUM_OF_SUBJECT;
  }
}

class Bar {  Bar () {}
  // 멤버 메서드 -> 함수처럼 ....생겼으니까!!
  // 생성자 : 이름이 클래스명과 동일, 반환형이 없다.
  Bar(String argName, int argAge) {
    name = argName;
    age = argAge;
  }
  // 멤버변수 -> 클래스 내 선언 된 변수
  //             객체 생성 시 객체마다 독립된 값을 유지
  String name;
  int age;

  // 멤버메서드 -> 클래스 내 선언 된 함수
  //               해당 클래스에 필요한 함수를 구현
  void printInfo() {
    System.out.println(name + age);
  }
}

// 실행 코드
public class j250310 {
  public static void main(String[] args) {
    YStudent stdList[] = new YStudent[10];

    stdList[0] = new YStudent();
    stdList[1] = new YStudent();
    stdList[2] = new YStudent();
    stdList[3] = new YStudent();

    Bar b1 = new Bar("Richard", 24);
    Bar b2 = new Bar();
    
    System.out.println(b1.name+ " " + b1.age);
    b1.printInfo();
  }

}