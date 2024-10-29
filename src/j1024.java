package Lab.src.specialLecture;

public class j1024 {
  public static void main(String[] args) {
    // 1차원 배열(Array) 내 원소값을 출력하는 코드 작성
    // int bar[] = new int[3];

    int bar[]; // Reference Variable 1차원 Array를 pointing하는 참조변수
    bar = new int[5]; //Primitive Variable

//    for (int i = 0, j = 10 ; i < bar.length ; i++, j += 10 ) {
//        bar[i] = j;
//      System.out.print(bar[i] + "\t");
//    }
    // bar 1차원 배열(Array) 내 원소값을 출력하는 코드를 작성하시오
    // 10, 20, 30

    for (int index = 0, value = 5; index < bar.length; index++, value--) {
      bar[index] = value;
    }

    for (int value : bar) {
      // 괄호안에 조건식은 보고 구분을 한다.
      System.out.println(value);
    }
    // 두개는 결과는 같지만 배열이나 컬렉션을 한번에 순회하고 싶을 때에는 for-each문을 자주 사용
    // 값이 변경하는 것이 안된다. 단점
  }
  }