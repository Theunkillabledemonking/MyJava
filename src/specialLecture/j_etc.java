public class j_etc {
    
    // 이 파일은 테스트용 파일입니다.
    public static void main(String[] args) {
        char[] selectedIems = {'+', '+', '-'};
        char selectedIems1 = 0;    
            // 포인트 점수 계산
            // 연속된 점수 계산
            int conChartCount = 0;
            // A. 연속된 문자가 2개
            for (int i = 1; i < selectedIems.length; i++) {
                if (selectedIems[i] == selectedIems[i+1]) {
                    conChartCount++;
                    // 연속된 문자 종료 지점

                }
            }

            if (conChartCount == 1) {
                switch (selectedIems1) {
                    case '+':
                        break;
                    case '-':
                        break;
                    case '*':
                        break;
                        default:
                        System.out.println("Nonthing anymore");
                }

            } else if (conChartCount == 2){
                switch (selectedIems1) {
                    case '+':
                        break;
                    case '-':
                        break;
                    case '*':
                        break;
                        default:
                        System.out.println("Nonthing anymore");
                }
                
            }

            // B. 연속된 문자가 3개
    }
}
