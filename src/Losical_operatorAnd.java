public class Losical_operatorAnd {
  public static void main(String[] args) {
    // 예제 : 영화관 입장 조건
    //      - 조건 : 18세 이상이고, 티켓이 있어야 입장 가능
    //      - 두 조건 모두 만족해야 입장할 수 있음.

    int age = 20;
    boolean hasTicket = true;

    // 나이가 18세 이상이고, 티켓을 가지고 있어야 입장 가능
    boolean canEnter = (age >= 22) && hasTicket;

    System.out.println("Can enter the movie theater: " + canEnter);
    // 출력: Can enter the movie theater: true

    // 여기서 나이가 18세 이상이고 티켓을 가지고 있다는 두 조건이 모두 참이어야만 결과가 참(입장 가능)이 됨.
    // 하나라도 만족하지 않으면 결과는 거짓

    // !inputValse -> Logical operator
    // ~inputValue -> Bitwise operator

    boolean isOpened = false;

    // 방문이 열려있다.
    isOpened = true;

    // 방문이 닫혀있다.
    isOpened = false;

    // 방문이 닫혀 있으면 .... 실행
    if (!isOpened) {
      System.out.println("Do something");
    }
  }
}
