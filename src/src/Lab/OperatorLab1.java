package Lab;
class Bitset {
  int state = 0;

  // 비트 설정 메서드
  void setBit(int position, boolean value) {
    // position 위치에 비트 값 설정
    // value가 true면 | 연산과 쉬프트 연산(1 << position)을 사용해 1로 설정
    // value가 false면 & 연산과 비트 반전(~)을 사용해 0으로 설정
    // 1인 마스크를 생성
//    int mask = 1 << position; //

    if (value) {
      // 해당 위치의 비트를 1로 설정
      state |= (1 << position); // 기존 state에 mask를 OR 연산하여 비트를 설정한다.
    } else {
      // value가 false인 경우, NOT 연산을 사용해 마스크를 반전시킴
      // 해당 위치의 비트를 0으로 설정
      state &= ~(1 << position);
    }
  }
  // 비트 조회 메서드
  boolean getBit(int position){

    // 해당 위치의 비트 값 반환
    return (state & (1 << position)) != 0;
  }
}
public class OperatorLab1 {
  public static void main(String[] args) {
    // 메소드 작성 후 실행 예시:
    Bitset bitset = new Bitset();
    bitset.setBit(5, true); // 5번째 비트를 1로 설정
    System.out.println(bitset.getBit(5)); // 출력 : true
    System.out.println(bitset.getBit(3)); // 출력 : false

  }
}
