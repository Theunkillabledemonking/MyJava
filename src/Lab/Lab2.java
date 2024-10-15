public class Lab2 {
  public static void main(String[] args) {
    byte maxValue = 127; // byte type의 최대 값
    byte minValue = -128; // byte type의 최소 값
    // byte는 값의 최대값인 127에서 1을 더하면 오버플로우 발생 : -128로 순환된다.
    maxValue++;
    //byte 값의 최소값인 -128에서 1을 빼면 언더플로우 발생 : 127로 순환된다.
    minValue--;


    System.out.println("오버플로우된 값: " + maxValue );
    System.out.println("언더플로우된 값: " + minValue );
  }
}
