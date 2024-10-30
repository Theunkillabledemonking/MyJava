package Lab.src.cobo.Chap3;

public class Exercise3_7 {
  public static void main(String[] args) {
    // 화씨를 섭씨로 변환 코드
    // C = 5/9 (F - 32) 일 때 알맞은 콛 ㅡ넣기
    // Math.round는 사용금지
    int fahrenheit = 100;
    float celsius = (float)5/9 *(fahrenheit - 32);

    System.out.println("Fahrenheit: " + fahrenheit);
    // 서식 문자열 String.format
    System.out.println("Celsius: " + String.format("%.2f", celsius));


  }
}
