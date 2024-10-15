public class LogicalOperatorNot {
  public static void main(String[] args) {
    // 예제 : 가게 영업 여부 확인

    // 조건 : 가게가 닫혀 있지 않으면(열려 있으면) 방문함
    // 가게가 닫혀 있지 않다는 것은 열려 있다는 의미임

    boolean isClosed = false; // 가게가 열려 있음

    // 가게가 닫혀 있지 않으면(true) 방문
    boolean visitStore = !isClosed;

    System.out.println("Visit the store: " + visitStore);
    // 출력 : Visit the store: true

    // 여기서 Not 연산자는 **isClosed**가 false(가게가 닫혀 있찌 않음)일 떄
    // 이를 반대로 바꿔 **true**로 만들어 결과가 가게를 방문하는 것으로 바뀜.

  }
}
