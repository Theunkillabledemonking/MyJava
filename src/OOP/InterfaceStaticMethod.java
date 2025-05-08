package src.OOP;
interface NetworkDeviceInfo {
    // 객체 없이 호출 가능한 장비 설명 기능
    static void showDeviceInfo() {
        System.out.println("네트워크 장비 표준 규격 설명: 모든 장비는 IEEE 802.3 규격을 준수합니다.");
    }
}

interface MaintenanceSupport {

    private void log(String msg) {
        System.out.println("LOG" + msg);
    }

    default void runMaintenance() {
        log("정기 점검 수행 중");
        System.out.println("정기 점검 완료");
    }
}
public class InterfaceStaticMethod {
    public static void main(String[] args) {
        // 이전 Connectable 사용코드

        // static 메서드 호출 (객체 생성 없이 인터페이스명으로)
        NetworkDeviceInfo.showDeviceInfo();
    }
}
