package Lab.src.specialLecture;
public class yakyu {
    public static void main(String[] args) {
        // 야구 게임
        
        // 배열 3개
        int[] result = new int[3];
        int count = 0;

        // 1. 1~10 랜덤 정수 3개 생성
        while (count < 3) {
            int randValue = (int)(Math.random() * 10) + 1;
            boolean isFlag = false;

            for (int i = 0; i <= count; i++) {
                if (result[i] == randValue) {
                    isFlag = true;
                    break;
                }
            }
            if (!isFlag) {
                result[count] = randValue;
                count++;
            }

        System.out.println(result);
        }
        // 중복 값 걸려주고 다시 생성

        // 중복이 되지 않을 경우 다시 생성

        // 스트라이크, 트라이횟수, 아웃횟수 체크

        // 2. 사용자 정수 3개 값 입력

        // 3. 스트라이크 아웃

        // 종료 조건 
        // 시도 5번 이상
        // 스트라이크 2번 이상

        // win 스트라이크 3개
    }
}
