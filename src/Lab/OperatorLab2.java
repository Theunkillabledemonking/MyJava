package mypackage;
class PermissionManager {
  // 권한 비트 위치 상수 정의
  public static final int READ = 0;   // 읽기 권한 비트 위치
  public static final int WRITE = 1;  // 쓰기 권한 비트 위치
  public static final int EDIT = 2;   // 수정 권한 비트 위치
  public static final int DELETE = 3; // 삭제 권한 비트 위치

  private byte permissions = 0;  // 현재 권한 상태를 저장하는 변수

  // 권한 설정 메서드
  void setPermission(int permission, boolean enable) {

    if (enable) {
      // 해당 권한 비트를 1로 설정 (OR 연산)
      permissions |= (1 << permission);
    } else {
      // 해당 권한 비트를 0으로 설정 (AND와 NOT 연산)
      permissions &= ~(1 << permission);
    }
  }

  // 권한 확인 메서드
  boolean checkPermission(int permission) {
    // 해당 권한 비트가 1인지 확인 (AND 연산)
    return (permissions & (1 << permission)) != 0;
  }

  // 모든 권한 제거 메서드
  void removeAllPermissions() {
    permissions = 0; // 모든 비트를 0으로 설정하여 권한 제거
  }
}

public class OperatorLab2 {
  public static void main(String[] args) {
    PermissionManager pm = new PermissionManager();

    // 권한 설정
    pm.setPermission(PermissionManager.READ, true);
    pm.setPermission(PermissionManager.WRITE, true);
    pm.setPermission(PermissionManager.DELETE, true);


    // 권한 확인
    System.out.println("읽기 권한: " + pm.checkPermission(PermissionManager.READ));   // 출력: true
    System.out.println("쓰기 권한: " + pm.checkPermission(PermissionManager.WRITE));  // 출력: true
    System.out.println("수정 권한: " + pm.checkPermission(PermissionManager.EDIT));   // 출력: false
    System.out.println("삭제 권한: " + pm.checkPermission(PermissionManager.DELETE)); // 출력: true

    // 모든 권한 제거
    pm.removeAllPermissions();
    System.out.println("읽기 권한: " + pm.checkPermission(PermissionManager.READ));   // 출력: false
    System.out.println("삭제 권한: " + pm.checkPermission(PermissionManager.DELETE)); // 출력: false
  }
}
