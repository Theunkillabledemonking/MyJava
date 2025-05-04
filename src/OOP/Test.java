package src.OOP;

// 추상 클래스
abstract class AnimalV1 {
    String name; // 공통 속성: 동물 이름

    // 생성자: 이름 초기화
    AnimalV1(String name) {
        this.name = name;
    }

    // 추상 메서드: 구체적 동작은 자식 클래스가 구현해야 함
    abstract void sound();
}

// DogV1 클래스: AnimalV1을 상속받은 구체 클래스
class DogV1 extends AnimalV1 {
    DogV1(String name) {
        super(name); // 부모 클래스(AnimalV1)의 생성자 호출
    }

    @Override
    void sound() { // 부모의 추상 메서드 구현 (오버라이딩)
        System.out.println(name + "가 멍멍 짓는다!");
    }
}

// CatV1 클래스: AnimalV1을 상속받은 구체 클래스
class CatV1 extends AnimalV1 {
    CatV1(String name) {
        super(name); // 부모 클래스(AnimalV1)의 생성자 호출
    }

    @Override
    void sound() { // 부모의 추상 메서드 구현 (오버라이딩)
        System.out.println(name + "가 야용야옹 거린다.");
    }
}
public class Test {
    public static void main(String[] args) {
        // 다형성: 부모 타입 참조변수에 자식 객체를 대입
        AnimalV1 a = new DogV1("바둑이"); // 다형성 부모 타입 참조
        AnimalV1 b = new CatV1("고양이");

        // 동적 바인딩: 실행 시 실체 객체를 부모 타입 배열에 저장
        a.sound(); // 동적 바인딩 -> Dog sound() 실행
        b.sound(); // 동적 바이닝 -> Cat sound() 실행

        // 다영성 배열 활용: 다양한 자식 객체를 부모 타입 배열에 저장
        AnimalV1[] animals = {
                new DogV1("바둑바둑"),
                new CatV1("나비나비")
        };

        // for-each 문으로 배열 탐색
        for (AnimalV1 animal : animals) {
            animal.sound(); // 각각 DogV1, CatV1의 sound()가 호출됨 동적 바인딩
        }


        // 오류 유도
        // Dog d = new AnimalV1("댕댕이");
        // 이유: AnimalV1은 추상 클래스이기 때문에 인스턴스화(객체 생성) 불가능
        // 또한 타입도 DogV1로 받으려 했는데 AnimalV1은 DogV1이 아님 (타입 불일치)
    }
}
