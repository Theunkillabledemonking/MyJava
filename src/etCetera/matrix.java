package src.etCetera;

public class matrix {
  public static void main(String[] args) {
    int [][] bar = new int[3][3];
    int value = 10;
    for (int row = 0; row < bar.length; row++) {
      for (int col = 0; col < bar[row].length; col++) {
        bar[row][col] = value;
        value += 10;
        System.out.print(bar[row][col] + " ");
      }
      System.out.println();
    }

  }
}
