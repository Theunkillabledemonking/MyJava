package src.etCetera;

public class newArrayB {
  public static void main(String[] args) {
    // 1. int 타입 배열 생성 - new 연산자로 크기 5인 배열 생성
    int[] numbers = new int[5]; // numbers는 배열의 첫 번째 요소 주소를 참조
    System.out.println("numbers 배열의 참조 변수 값: " + numbers); //메모리 주소 출력 (참조 변수 값)

    // 2. 반복문을 활용한 빼열 요소 값 설정 (set)
    // 반복문을 사용하여 각 배열 요소에 값을 할당
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (i + 1) * 10; // 10, 20, 30, 40, 50 할당
    }

    // 3. 반복문을 활용한 배열 요소 값 가져오기(get)
    // 반복문을 사용항여 배열의 모든 요소 값을 출력
    System.out.println("numbers 배열의 요소 값: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("numbers[" + i + "] = " + numbers[i]);
    }

    // 4. String 타입 배열 생성 - new 연산자로 크기 3인 배열 생성
    String[] names = new String[3]; // names는 String 배열의 첫 번째 요소 주소를 참조
    System.out.println("names 배열의 참조 변수 값: " + names); // 메모리 주소 출력 (참조 변수 값)

    // 5. 반복문을 활용한 String 배열 요소 값 설정 (SET)
    String[] sampleNames = {"Alice", "Bob", "Charlie"};
    for (int i = 0; i < names.length; i++) {
      names[i] = sampleNames[i]; // names 배열에 값 할당
    }

    // 6. 반복문을 활용한 String 배열 요소 값 가져오기 (get)
    System.out.println("names 배열의 요소 값");
    for (int i = 0; i <names.length; i++) {
      System.out.println("names[" + i + "] = " + names[i]);
    }
  }
}
