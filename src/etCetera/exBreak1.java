package src.etCetera;

public class exBreak1 {
  public static void main(String[] args){
    int score = 85;
    switch (score / 10) {
      case 10:
      case 9:
        System.out.println("A 학점");
        break; // A 학점 이후 switch 문 종료
      case 8:
        System.out.println("B 학점");
        break; // B 학점 이후 switch 문 종료
      case 7:
        System.out.println("C 학점");
        break;
      default:
        System.out.println("F 학점");
    }
    System.out.println("switch 문 종료 후 실행되는 코드");
  }
}
