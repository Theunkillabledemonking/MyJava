package src.etCetera;

public class newOperatorA {
  public static void main(String[] args) {
    // 1. int 타입 배열 생성 - new 연산자를 사용해 크기 5인 배열 생성
    int[] numbers = new int[5]; // numbers는 배열의 첫 번째 요소 주소를 참조
    System.out.println("numbers 배열의 참조 변수 값: " + numbers); // 메모리 주소 출력 (참조 변수 값)

    // 2. 배열 요소의 기본값 확인
    // 배열의 각 요소는 int형 기본값이 0으로 초기화됨
    System.out.println("numbers[0] 기본값 : " + numbers[0]); // 출력: 0
    System.out.println("numbers[3] 기본값 : " + numbers[3]); // 출력: 0

    // 3. 배열 요소의 값 설정 (SET)
    // 인덱스를 사용해 배열의 특정 요소에 값을 할당
    numbers[3] = 10; // 네 번째 요소에 10 할당
    System.out.println("numbers[3] 설정 후 값: " + numbers[0]); // 출력: 10

    // 4. String 타입 배열 생성 - new 연산자로 크기 3인 배열 생성
    String[] names = new String[3]; // names String 배열의 첫 번째 주소를 참조
    System.out.println("names 배열의 참조 변수 값: " + names); // 메모리 주소 출력 (참조 변수 값)

    // 5. String 배열의 기본값 확인
    // 참조형 배열의 기본값은 null
    System.out.println("names[0] 기본값: " + names[0]); // 출력 null
    System.out.println("names[0] 기본값: " + names[1]); // 출력 null

    // 6. String 배열 요소에 값 설정 (SET)
    names[1] = "Alice"; // 두 번째 요소에 "Alice" 할당
    System.out.println("names[1] 설정 후 값: " + names[0]); //출력 alice

    // 7. 배열 크기 출력
    // 배열의 길이는 .length를 사용해 확인할 수 ㅇ있다
    System.out.println("numbers 배열의 길이: " + numbers.length); //출력 : 5
    System.out.println("names 배열의 길이: " + numbers.length); // 출력 : 3

  }
}
