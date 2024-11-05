package src.etCetera;

public class lable {
  public static void main(String[] args) {
    int count = 0;
    bar:
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        for (int k = 0; k < 2; k++) {
          System.out.println("i: " + i + ", j:" + j + ", k:" + k);
        }
      }
    }
  }
}