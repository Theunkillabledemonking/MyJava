package src.etCetera;

public class questionYield {
  public static void main(String[] args) {

    int score = 77;
    String grade = switch (score / 10) {
      case 10, 9 -> "A";
      case 8 -> "B";
      case 7 -> {
          if (score >= 75) yield "C+";
          else yield "C";
      }
      default -> "F";
    };
    System.out.println("Grade: " + grade);
  }
}
