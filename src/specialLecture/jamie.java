//import java.util.Scanner;
//
//public class jamie {
//
//    static void printMenu() {
//        System.out.println("==== 빙고 게임 메뉴 ====");
//        System.out.println("1. 빙고판 생성");
//        System.out.println("2. 숫자별 발생 빈도 분석");
//        System.out.println("3. 빙고판 출력");
//        System.out.println("4. 종료");
//        System.out.print("메뉴 선택");
//    }
//
//    static int matrixSizeN(Scanner sc) {
//        int size = 0;
//
//        while(true) {
//            System.out.println("3 이상 9이하의 홀수를 입력해주세요");
//            size = sc.nextInt();
//            if (3 <= size && size <= 9 && size % 2 != 0) {
//                return size;
//            }
//            System.out.println("N 값은 3이상 9이하 홀수만 입력가능합니다.");
//        }
//    }
//
//    static int[] totalArray(Scanner sc,int argN) {
//        int startN = 0;
//        int endN = 0;
//        int[] tupleArrays = new int[2];
//        while(true) {
//            System.out.println("시작값을 입력하세요");
//            startN = sc.nextInt();
//            System.out.println("종료값을 입력하세요");
//            endN = sc.nextInt();
//
//            if (endN - startN + 1 >= argN * argN) {
//                // 참이면 튜플로 리턴
//                tupleArrays[0] = startN;
//                tupleArrays[1] = endN;
//
//                return tupleArrays;
//            }
//            System.out.println("종료 값 - 시작 값이 N X N 보다 크거나 같아야 한다.");
//        }
//    }
//
//    // tensor 사이즈
//    static int matrixSizeM(Scanner sc) {
//        int sizeM = 0;
//        while(true) {
//            sizeM = sc.nextInt();
//            if (1 <= sizeM && sizeM <= 7) {
//                return sizeM;
//            }
//            System.out.println("M 값은 1이상 7이하 양수만 입력하세요");
//        }
//    }
//
//    // 1차원 배열
//    static int[] arrayValue(int[] argTupleArray) {
//        // 시작점과 끝점의 연속된 배열 생성
//        int result = argTupleArray[1] - argTupleArray[0] + 1;
//        int[] valArray = new int[result];
//
//        for (int i = 0; i < valArray.length; i++) {
//            valArray[i] = argTupleArray[0] + i;
//        }
//        return valArray;
//    }
//
//    // 랜덤 메서드
//    static void randomArray(int[][][] argTensor, int[] argTupleArray, int[] argValue, int sizeN) {
//
//        int count = argTupleArray[1] - argTupleArray[0] + 1;
//
//        for (int t = 0; t < argTensor.length; t++) {
//
//            int[] poolCopy = arrayValue(argTupleArray);
//            // 생성해놓은 배열 셔플로 섞기
//            for (int i = poolCopy.length - 1; i > 0; i--) {
//                int randValue = (int) (Math.random() * (i + 1));
//                int tmp = poolCopy[i];
//                poolCopy[i] = poolCopy[randValue];
//                poolCopy[randValue] = tmp;
//
//            }
//
//            // 섞은 값 순서대로 넣기
//            int index = 0;
//            for (int i = 0; i < sizeN; i++) {
//                for (int j = 0; j < sizeN; j++) {
//                    argTensor[t][i][j] = poolCopy[index++];
//                }
//            }
//
//        }
//    }
//
//    // 배열 출력 메서드
//    static void printTensor(int[][][] argTensor) {
//        for (int tensor = 0; tensor < argTensor.length; tensor++) {
//            System.out.println("=== " + (tensor + 1) + " 번째 배열 ===");
//            for (int row = 0; row < argTensor[tensor].length; row++) {
//                for (int col = 0; col < argTensor[tensor][row].length; col++) {
//                    System.out.print(argTensor[tensor][row][col] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//    }
//
//    static int[] frequensAry(int[][][] argTensor, int[] argTuple) {
//        int frequenceSize = argTuple[1] - argTuple[0] + 1;
//        int[] frequenceArray = new int[frequenceSize];
//
//        for (int[][] table : argTensor) {
//            for (int[] row : table) {
//                for (int col : row) {
//                    // col - start 인덱스 빈도 횟수 계산
//                    frequenceArray[col - argTuple[0]]++;
//                }
//            }
//        }
//        return  frequenceArray;
//    }
//    static void countNum (int[] argA, int[] argTotal, int argTotall) {
//        System.out.println("빈도");
//        for (int i = 0; i < argA.length; i++) {
//            int num = argTotal[0] + i;
//            int count = argA[i];
//            double percentage = (count / (double) argTotall) * 100;
//            System.out.printf("%2회 %2 (%.2f%%", num, count, percentage);
//
//            for (int j = 0; j < (int) (percentage / 10); j++);
//            System.out.print("*");
//        }
//        System.out.println();
//    }
//
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int userNum = sc.nextInt();
//        int[][][] tensorMatrix = null;
//
//        while(true) {
//            // 메뉴 출력
//            printMenu();
//            userNum = sc.nextInt();
//
//            switch (userNum) {
//                case 1:
//                    // n 사이즈
//                    int mtxSizeN = matrixSizeN(sc);
//
//                    // 시작점 끝점 배열
//                    int[] tupleArray = totalArray(sc, mtxSizeN);
//
//                    // 빙고 메트릭스 수
//                    int mtxSizeM = matrixSizeM(sc);
//
//                    // 빙고판 생성
//                    tensorMatrix = new int[mtxSizeM][mtxSizeN][mtxSizeN];
//
//                    // 시작값 ~ 종료값이 포함된 배열 생성
//                    int[] valArray = arrayValue(tupleArray);
//
//                    // 각 Tensor마다 난수값
//                    randomArray(tensorMatrix, tupleArray, valArray, mtxSizeN);
//                    break;
//
//                case 2:
//                    if (tensorMatrix != null) {
//                        // To Do
//                        // 숫자별 발생 빈도 계산
//                        int[] frequencyArray = frequensAry(tensorMatrix, tupleArray);
//                        int totalNum = mtxSizeM * mtxSizeN * mtxSizeN;
//                    } else {
//                        System.out.println("배열이 생성되지 않았습니다.");
//                    }
//                    break;
//
//
//                case 3:
//                    // 빙고판 출력
//                    if (tensorMatrix != null) {
//                        printTensor(tensorMatrix);
//                    } else {
//                        System.out.println("배열이 생성되지 않았습니다.");
//                    }
//                    break;
//
//                case 4:
//                    System.out.println("종료합니다");
//                    return;
//                    // 종료
//                default:
//                    System.out.println("잘못된 입력값");
//            }
//        }
//    }
//}
