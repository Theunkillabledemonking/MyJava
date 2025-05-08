package src.OOP;

interface Connectable {

    // 반드시 구현해야 하는 필수 기능
    void connect();
    void disconnect();

    // 모든 장비가 사용할 수 있는 기본 상태 점검 기능
    default void diagnostic() {
        System.out.println("기본 진단: 네트워크 연결 상태 정상");
    }
}

class Router implements Connectable {

    @Override
    public void connect() {
        System.out.println("라우터가 네트워크에 연결됩니다");
    }

    @Override
    public void disconnect() {
        System.out.println("라우터가 네트워크 연결을 해제합니다.");
    }

    // 기본 제공되는 disconnect() 사용 (오버라이딩 안 함)
}

class Switch implements Connectable {

    @Override
    public void connect() {
        System.out.println("스위치가 네트워크에 연결됩니다.");
    }

    @Override
    public void disconnect() {
        System.out.println("스위치가 네트워크 연결을 해제합니다.");
    }

    @Override
    public void diagnostic() {
        System.out.println("스위치 맞춤형 진단: 모든 포트 정상 작동");
    }
}

public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        Connectable router = new Router();
        router.connect();
        router.disconnect();
        router.diagnostic();    // 기본진단

        Connectable switchDevice = new Switch();
        switchDevice.connect();
        switchDevice.disconnect();
        switchDevice.diagnostic(); //오버라이딩
    }
}
