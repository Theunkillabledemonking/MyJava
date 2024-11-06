package src.etCetera;

public class separationFunction {
  public  static int calculateDiscount(int amount) {
    if (amount >= 30000) {
      return (int)(amount * 0.2);     // 30,000원 이상 구매 시 20% 할인
    } else if (amount >= 20000) {
      return (int)(amount * 0.1);     // 20,000원 이상 구매 시 10% 할인
    } else {
      return (int)(amount * 0.05);    // 그 외 5% 할인
    }
  }
  public static void main(String[] args) {

    // 함수 분리
    int totalDiscount = 0;
    int[] purchases = {10000, 20000, 30000};

    for (int i = 0; i < purchases.length; i++) {
        totalDiscount += calculateDiscount(purchases[i]); // 함수 호출로 분리
    }
    System.out.println("총 할인 금액: " + totalDiscount + "원");
  }
}
