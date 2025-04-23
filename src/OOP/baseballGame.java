package src.OOP;

class PlayerV1 {
    protected String name;
    protected String position;
    PlayerV1() { position = "not position"; };
    PlayerV1(String name, String position) {
        this.name = name;
        this.position = position;
    }

    void shoot() {
        System.out.println(position + " " + name + ": 기본 숫!");
    }
}

class SgV1 extends PlayerV1 {
    SgV1() { position = "Shooting guard"; }
    SgV1(String name) {
        super(name, "슈팅 가드!");
    }

    @Override
    void shoot() {
        System.out.println(position + " " + name + ": 3점 슛!");
    }
}

class PgV1 extends PlayerV1 {
    PgV1(String name) {
        super(name, "포인트 가드!");
    }

    @Override
    void shoot() {
        System.out.println(position + " " + name + ": 돌파 후 점퍼!");
    }
 }

 class CenterV1 extends PlayerV1 {
     CenterV1() { position = "Center"; }
    CenterV1(String name) {
        super(name, "센터!");
    }

    @Override
     void shoot() {
        System.out.println(position + " " + name + ": 골밑슛!");
    }
 }

 class PfV1 extends PlayerV1 {
     PfV1(String name) {
         super(name, "파워 포워드!");
     }

     @Override
     void shoot() {
         System.out.println(position + " " + name + ": 미들슛!");
     }
}

class SfV1 extends PlayerV1 {
    SfV1(String name) {
        super(name, "스몰 포워드!");
    }


    @Override
    void shoot() {
        System.out.println(position + " " + name + ": 슬래시 앤 드라이브!");
    }
}

class Coach {
    // 매개변수 타입: Player -> 자식 클래스 모두 전달 가능
    void train(PlayerV1 player) {
        System.out.println("훈련 중 +");
        player.shoot(); // 동적 바인딩: 실제 객체의 shoot() 실행
    }
}

class PlayerFactory {
    PlayerV1 createPlayer(String name) {
        switch (name) {
            case "SG":
                return new SgV1();
            default:
                return new PgV1(name);
        }
    }
}
public class baseballGame {
    public static void main(String[] args) {
            PlayerV1[] team = {
                    new SgV1("영철"),
                    new PgV1("원준"),
                    new CenterV1("민정"),
                    new PfV1("신우"),
                    new SfV1("민규"),

            };

            System.out.println("[ 야리마스팀 슛 연습 시작! ]\n");

            for (PlayerV1 p : team) {
                p.shoot(); // 오버라이딩 된 shoot() 실행 (동적 바인딩)
            }

            PlayerFactory factory = new PlayerFactory();
            PlayerV1 p = factory.createPlayer("SG");
            p.shoot();


            Coach coach = new Coach();
            coach.train(new SgV1());
            coach.train(new CenterV1());


    }
}
