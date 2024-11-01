public class j_241101_2 {
    public static void main(String[] args){

        // Math.random() -> 0.0 <= rand value < 1.0
        // 1 ~ 10 사이의 정수 중 난수 값 5개를 출력해라
        // 1.0 <= rand value <= 10.0

        for (int i = 0; i < 5 ; i++){
            int randValue = (int)(Math.random() * 10) + 1; 
            // 11 * 0.0 <= rand value < 1.0 * 11
            // 0.0 <= rand value < 11.0 // 10.99999이기 때문에 11은 나올 수 없다.

            // 0.0 <= rand value < 11.0
            // 0.0 <= rand value < 10.0
            // 1 + 0.0 <= rand value <= 10.0 +1


            System.out.println(randValue);
        }
    }
}
