public class Exercise4_3 {
    public static void main(String[] args) {
        // 1 + (1+2) + (1+2+3) + (1+2+3+4) + (1+2+3+..+10)
        int num = 0; // 전체 합을 저장하는 변수
        int tempSum = 0; // 각 단계별 합을 저장하는 변수
        for (int i=1; i <=10; i ++){
            tempSum += i; // 1 + 2+...i 까지의 값을 누적
            num += tempSum; // 그 값을 전체 핪에 더함
        }
        System.out.println(num); // 최종 합
    } 
    
}
