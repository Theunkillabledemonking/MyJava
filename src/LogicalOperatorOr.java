public class LogicalOperatorOr {
  public static void main(String[] args) {
    // 예제 : 우산을 가져가야 하는 조건
    // - 조건 : 오늘 비가 오거나 , 날씨가 흐리면 우산을 가져감
    // - 둘 중 하나만 만족해도 우산을 가져감.

    boolean isRaining = false;
    boolean isCloudy = true;

    // 비가 오거나, 날씨가 흐리면 우산을 가져가야 함
    boolean takeUmbrella = isRaining || isCloudy;

    System.out.println("Take an umbrella? " + takeUmbrella);
    // 출력 : take an umbrella : true

    // 여기서 비가 오지 않더라도 날씨가 흐리면 우산을 가져가야 하므로,
    // 하나의 조건만 참이어도 결과가 참
  }
}
