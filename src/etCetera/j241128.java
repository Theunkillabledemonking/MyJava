package src.etCetera;

public class j241128 {
  public static void main(String[] args) {
    final int FRAME_NUM = 100000;
    final int ITEM_NUM = 20;
    float[][] noiseMatrix;

    //noiseMatrix = new float[FRAME_NUM][ITEM_NUM];

    // 2차원 배열에 십만개를 저장할 메모리 공간만 만들어 놨다.

    noiseMatrix = new float[FRAME_NUM][]; // 필요할 때마다 넣을 수 잇도록!

    noiseMatrix[0] = new float[ITEM_NUM];
    // 각 프레임을 입력할 때마다 1차원 배열을 생서하면 효율적으로 메모리 관리가 가능하다.

    int[] bar = new int[]{10, 20, 30, 40, 50};
    int[] foo = bar;

    foo[0] = 900;

    System.out.println(bar[0]);
    }
  }

