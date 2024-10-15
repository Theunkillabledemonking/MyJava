public class LogicalOperator {
  public static void main(String[] args) {
//    // 예제 : 주차 가능 여부
//    // 조건 : 주차장은 비어 있거나, 내가 가지고 있는 차량이 전기차여야 주차 가능
//    // 주차장이 꽉 차 있더라도, 전기차는 주차 가능.
//
//    boolean isParkingFull = false; // 주차장이 비어 있음
//    boolean hasElectricCar = false; // 내 차는 전기차 아님
//
//    // 주차장이 비어있거나, 전기차 일 경우 주차 가능
//    boolean canPark = !isParkingFull || !hasElectricCar;
//
//    System.out.println("Can park: " + canPark);
//    // 출력 : Can park: true
//
//    // 여기서는 주차장이 비어 있으면 주차 가능하고, 주차장이 꽉 차 있더라도 전기차라면
//    // 주차 가능하게 OR 연산자를 사용하여 두 조건 중 하나만 만족해도 주차 가능함.

    // 예제 : 놀이공원 탑승 제한 검사
    // 조건 : 나이가 8세 이상 15세 이하인 경우 놀이기구 탑승 가능.
    // 연령 제한이 있으므로 특정 범위에 속하는지 확인함.

    int age = 12;

    // 나이가 8세 이상이고, 15세 이하일 경우 탑승 가능
    boolean canRide = (age >= 8) && (age <= 15);

    System.out.println("Can ride the amusement park ride: " + canRide);
    // 출력 : Can ride the amusement park ride: true

    // 여기서는 && (and) 연산자를 사용하여 나이가 8세 이상이고 15세 이하일 때만 놀이기구에 탑승 가능하게 설정함.
    // 두 조건이 모두 만족해야 하므로 and 연산자가 적합

    // 예제 : 성인 인증 검사
    // 조건 : 나이가 13세 미만이거나 65세 이상이면 성인 인증 불필요.
    // 나이가 이 범위를 벗어나면 성인 인증이 필요함.

    int age1 = 30;

    // 나이가 13세 미만이거나 65세 이상이면 성인 인증 불필요
    boolean noAdultVerification = (age1 < 13 ) || (age1 >= 65);

    System.out.println("No adult verification required: " + noAdultVerification);
    // 출력 : No adult verification required: false

    // 여기서는 || (or) 연산자를 사용하여 나이가 13세 미만이거나 65세 이상일 경우
    // 성인 인증이 필요하지 않게 설정함. 두 조건 중 하나라도 만족하면 true가 됨.

    int a = 10;
    int b = 5;

    // a > 0 은 true, 하지만 b++ > 5 는 false, 단축평가로 인해 b++ 실행 안 됨
    boolean result = (a < 0) && (b++ > 5);
    System.out.println(b); // 출력 : 5 (증가하지 않는다)

    // a < 0 false, 하지만 b++ > 5 false  -> 단축 평가로 인해 b++ 실행된다.
    result = (a < 0) || (b++ > 5);
    System.out.println(b);

    byte bar = 0;
    bar =(byte) (bar + 1);
  }
}
