package src.etCetera;

public class default_Method {
  static float[] getSumAvg(int a, int b, int c) {
    float result[] = new float[2];

    result[0] = a + b + c;
    result[1] = result[0] / 3;

    return result;
    // 반환하는 값이 하나밖에 없기 떄문에 배열을 만들어서 이렇게 하는 방법도 존재
  }

  public static void main(String[] args) {
    float[] values = getSumAvg(1, 2, 3);
    System.out.println("sum : " + values[0]);
    System.out.println("avg : " + values[1]);
  }
}
