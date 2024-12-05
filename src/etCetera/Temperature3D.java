package src.etCetera;

public class Temperature3D {
  public static void main(String[] args) {
    // 건물의 3개 층, 각 층에 2개의 방, 각 방에 2개의 온도 센서 데이터
    int[][][] buildingTemps =  {
        { {20, 21}, {22, 23} }, // 1층: 2개의 방, 각 방에 2개의 센서
        { {19, 20}, {21, 22} }, // 2층: 2개의 방, 각 방에 2개의 센서
        { {18, 19}, {20, 21} }  // 3층: 2개의 방, 각 방에 2개의 센서
    };

    // 출력: 2층, 첫 번째 방의 첫 번째 센서 온도
    System.out.println("2층 첫 번째 방 첫 번째 센서 온도: " + buildingTemps[1][0][0]);

    // 온도 업데이트: 3층, 두 번째 방, 두 번째 센서 온도를 25도로 설정
    buildingTemps[2][1][1] = 25;

    // 모든 층의 방별 온도 출력
    System.out.println("\n 건물 전체 온도 상태:");
    for (int floor = 0; floor < buildingTemps.length; floor++) {
      System.out.println("층 " + (floor + 1) + ": ");
      for (int room = 0; room < buildingTemps[floor].length; room++) {
        System.out.print("  룸" + (room + 1) + ": ");
        for (int sensor = 0; sensor < buildingTemps[floor][room].length; sensor++) {
          System.out.print(buildingTemps[floor][room][sensor] + " ");
        }
        System.out.println();
      }
    }
  }
}
