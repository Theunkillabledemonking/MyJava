package src.etCetera;

public class referenceVariable {
  public static void main(String[] args) {
    short[] foo = new short[5];
    long[] bar = {10, 20, 100};

    for (int i = 0, j = 100; i < bar.length; i++, j -= 20) {
      foo[i] = (short)j;
    }
  }
}
