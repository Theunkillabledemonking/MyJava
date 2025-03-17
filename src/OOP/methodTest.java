package src.OOP;

class Users1 {
    String id;
    String department;
    String university;

    Users1() {
        this.university = "영진전문대학교";
    }

    Users1(String argDepartment) {
        this(); // default 생성자를 호출한다.
        department = argDepartment;
    }

    Users1(String argDepartment, String argId) {
        this(argDepartment);
        id = argId;
    }
 }

 class Foo {
    String id;

    void prt() {
        System.out.println(this.id); // 현재 생성된 이 객체의 id 필드 출력
    }
 }

 class Enemy {
    static int id = 100;
    Enemy() {
        System.out.println(++id);
    }
 }

public class methodTest {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        Foo f2 = new Foo();
        f1.prt();
        f2.prt();

        System.out.println(Enemy.id);
    }
}
