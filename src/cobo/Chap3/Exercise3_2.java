package Lab.src.cobo.Chap3;

public class Exercise3_2 {
  public static void main(String[] args) {
    int numOfApples = 123; // 사과의 개수
    int sizeofBucket = 10; // 바구니의 크기 (바구니에 담을 수 잇는 사과의 개수)
    int numOfBucket = (numOfApples + sizeofBucket - 1) / sizeofBucket; // 모든 사과를 담는데 필요한 바구니 수

    System.out.println("필요한 바구니의 수: " + numOfBucket);
  }
}
