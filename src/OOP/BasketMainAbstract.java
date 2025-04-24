package src.OOP;

// 추상 클래스
abstract class PlayerAbstract {
    String name;

    PlayerAbstract(String name) {
        this.name = name;
    }

    // 모든 포지션에 공통적으로 필요한 메서드
    void introduce() {
        System.out.println(name + "ちゃん！なにが好き❤️ はい！");
    }

    // 추상 메서드: 각 포지션마다 다르게 동작해야 함
    abstract void play(); // 반드시 자속에게 되물림해야한다.
}

class Pf2 extends PlayerAbstract {
    Pf2(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println(name + "チョコミントよりもな・な・た");
    }
}

class C2 extends PlayerAbstract {
    C2(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println(name + "ストロベリーフレイバーよりもあ・な・た");
    }
}

class PG extends PlayerAbstract {
    PG(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println(name + "クッキー＆クリームよりもあ・な・た");
    }
}

class SG extends PlayerAbstract {
    SG(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println(name + "モチロン大好き　AiScReam!");
    }
}
public class BasketMainAbstract {
    public static void main(String[] args) {
        PlayerAbstract[] team = {
                new Pf2("ルビィ"),
                new C2("アユム"),
                new PG("しき"),
                new SG("みんな！")
        };

        for (PlayerAbstract p : team) {
            p.introduce();
            p.play();
            System.out.println();

        }
    }
}
