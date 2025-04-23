package src.OOP;

abstract class Animal {
    abstract void makeSound();
}

abstract class Dog extends Animal {

}

class Son extends Dog {
    void makeSound() {
        System.out.println("멍!");
    }

    static void helo() {
        System.out.println("멍ㄹ");
    }
}



public class prt240423 {
    public static void main(String[] args) {
        Son s = new Son();
        s.makeSound();

        Son.helo();
    }
}
