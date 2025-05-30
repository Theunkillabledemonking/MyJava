package src.OOP;

// 외부 클래스 Bar
class Bar4 {
    private int memberPrivate = 1;
    int memberDefault = 2;
    protected int memberProtected = 3;
    public int memberPublic = 4;

    // Bar의 인스턴스 내부 클래스 (Member Inner Class)
    class Nested1    {
        void prt() {
            // 내부 클래스는 외부 클래스의 모든 멤버에 접근 가능 (접근제어자 무시)
            System.out.println(memberPrivate);  // private 접근 가능
            System.out.println(memberDefault);  // default 접근 가능
            System.out.println(memberProtected); // protected 접근 가능
            System.out.println(memberPublic);   // public 접근 가능
        }
    }
}

// 외부 클래스 Foo
class Foo2 {

    void prt() {
        // Foo 내부 클래스 Nested 사용 (아래 정의된 Nested 클래스)
        Nested nested = new Nested();
        // 같은 클래스 안에 정의된 내부 클래스이므로 모든 멤버 접근 가능
        System.out.println(nested.memberPrivate);
        System.out.println(nested.memberDefault);
        System.out.println(nested.memberProtected);
        System.out.println(nested.memberPublic);
    }

    class Nested {
        private int memberPrivate = 1;
        int memberDefault = 2;
        protected int memberProtected = 3;
        public int memberPublic = 4;
    }

}


public class OuterClassAccessModifier {
    public static void main(String[] args) {

    }
}
