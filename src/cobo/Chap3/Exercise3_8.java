package Lab.src.cobo.Chap3;

public class Exercise3_8 {
  public static void main(String[] args) {
    byte a = (byte)10;
    byte b = (byte)20;
    byte c = (byte)(a + b); // a + b는 int로 변환되므로, 다시 byte로 변환 필요

    char ch = 'A';
    ch = (char)(ch + 2); // ch + 2 int로 변환되므로, char형으로 변환 필요

    float f = 3 / 2f;
    long l = 3000L * 3000 * 3000; //정수형 리터럴은 기본적으로 int타입으로 처리 L을 넣으면 그럴 필요 x

    float f2 = 0.1f;
    double d = 0.1f; // f로 선언후 double로 저장하면 정밀도가 유지된다.

    boolean result = d == f2;

    System.out.println("c="+c);
    System.out.println("ch="+ch);
    System.out.println("f="+f);
    System.out.println("l="+l);
    System.out.println("result="+result);

  }
}
