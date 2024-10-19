public class Exercise4_4 {
    public static void main(String[] args) {
        // 1 + (-2) + 3 + (-4)와 같은 식으로 더했을 때,
        // 몇까지 더해야 총합이 100이상이 되는지 구해라
        int i = 1;
        int sum = 0;

        while (sum <= 100){
            if (i % 2 == 0){
                sum -= i;
            } else {
                sum += i;
            }
            System.out.println("혅 합:" + sum);
            i++;
        }

        // i 와 sum 값 합께 출력
        System.out.println("최종 i 값: +" + i);
        System.out.println("최종 합: " +sum);

    }
}
