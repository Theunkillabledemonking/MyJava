package src.OOP;

// [부모 클래스] 모든 농구 선수들이 공통으로 가지는 속성과 행동 정의
class PlayerV3 {
    protected String name;         // 선수 이름 (자식 클래스에서 직접 가능하도록 protected)
    protected String position;     // 선수 포지션 (슈팅가드, 센터 등)

    // 생성자: 자식 클래스에서 이름과 포지션을 전달하면 그걸로 초기화
    public PlayerV3(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // 기본 슛 동작 (자식 클래스에서 오버라이딩 가능)
    public void shoot() {
        System.out.println(position + " " + name + ": 기본 슛!");
    }
}

// 자식 클래스 슈팅가드 포지션 클래스
class SgV3 extends PlayerV3 {
    public SgV3(String name) {
        super(name, "슈팅 가드"); // 부모 생성자 호출 -> name과 포지션 초기화
    }

    @Override
    public void shoot() {
        // 부모 필드(position, name)를 사용해 슈팅가드만의 슛 방식 출력
        System.out.println(position + " " + name + ": 3점 슛!");
    }
}

// 포인트가드: 게임을 리드하고 돌파에 특화된 포지션
class PgV3 extends PlayerV3 {
    public PgV3(String name) {
        super(name, "포지션 가드");
    }

    @Override
    public void shoot() {
        System.out.println(position + " " + name + ": 돌파 후 점퍼!");
    }

}

// 🏀 센터: 골밑 근처에서 수비와 득점을 담당
class Center extends PlayerV3 {
    public Center(String name) {
        super(name, "센터");
    }

    @Override
    public void shoot() {
        System.out.println(position + " " + name + ": 골밑슛!");
    }
}

// 🏀 파워포워드: 리바운드와 미들슛에 강한 포지션
class PfV3 extends PlayerV3 {
    public PfV3(String name) {
        super(name, "파워 포워드");
    }

    @Override
    public void shoot() {
        System.out.println(position + " " + name + ": 미들슛!");
    }
}

// 🏀 스몰포워드: 민첩하게 돌파와 외곽 공격을 수행
class SfV3 extends PlayerV3 {
    public SfV3(String name) {
        super(name, "스몰 포워드");
    }

    @Override
    public void shoot() {
        System.out.println(position + " " + name + ": 슬래시 앤 드라이브!");
    }
}


public class BasketMain {
    public static void main(String[] args) {

        // 다형성 적용: PlayerV3 타입 배열로 서로 다른 포지션 객체들을 저장
        // 실제 객체는 자식 클래스(SgV3, PgV3, Center 등)지만,
        // 부모 타입(PlayerV3)으로 저장함 -> 다형성(polymorphism)
        PlayerV3[] team = {
                new SgV3("성관"),
                new PgV3("성식"),
                new Center("아야메"),
                new PfV3("혁일"),
                new SfV3("민석")
        };

        System.out.println("GSC_Portal 팀 슛 연습 시작! \n");

        /**
         * 반목문을 돌며 각 객체의 shoot() 메서드 실행
         * 이 떄 PlayerV3 타입으로 호출되지만,
         * 실체 객체의 타입에 따라 오버라이딩된 자식 클래스의 shoot()가 실행됨
         * 이게 바로 '동적 바인딩(Dynamic Binding)'이자 '다형성(Polymorphism)'의 핵심
         */
        for (PlayerV3 p : team) {
            p.shoot(); // 오버라이딩 shoot() 실행 동적 바인딩
        }
    }
}
