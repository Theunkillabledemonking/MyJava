package src.etCetera;

public class Temperature4D {
  public static void main(String[] args) {
    // 날짜별 건물의 온데 데이터 (날짜 X 층 X 방 X 센서)
    int[][][][] buildingTempsByDay = {
        { // Day 1
            { {20, 21}, {22, 23} }, // 1층: 2개의 방, 각 방에 2개의 센서
            { {19, 20}, {21, 22} },  // 2층:
            { {18, 19}, {20, 21} }  // 3층
        },
        { // Day 2
            { {21, 22}, {23, 24} }, // 1층
            { {20, 21}, {22, 23} }, // 2층
            { {19, 20}, {21, 22} }  // 3층
        }
    };

    // 출력: Day 2, 3층, 두 번째 방, 첫 번째 센서 온도
    System.out.println("Day 2, 3층 두 번째 방 첫 번째 센서 온도: "
            + buildingTempsByDay[1][2][1][0]);

    // 온도 데이터 업데이트: Day 1, 3층, 두번째 방, 두 번째 센서 온도를 25도로 설정
    buildingTempsByDay[0][2][1][1] = 25;

    // 모든 데이터 출력
    System.out.println("\n날짜별 건물 온도 상태: ");
    for (int day = 0; day < buildingTempsByDay.length; day++) {
      System.out.println("Day " + (day + 1) + ": ");
      for (int floor = 0; floor < buildingTempsByDay[day].length; floor++) {
        System.out.println("  Floor" + (floor + 1) + ": ");
        for (int room = 0; room < buildingTempsByDay[day][floor].length; room++) {
          System.out.print("    Room" + (room + 1) + ": ");
          for (int sensor = 0; sensor < buildingTempsByDay[day][floor][room].length; sensor++) {
            System.out.print(buildingTempsByDay[day][floor][room][sensor] + " ");
          }
          System.out.println();
        }
      }
    }
  }
}
