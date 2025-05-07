package src.OOP;

interface CarV1 {
    void drive();
}

interface AirplaneV1 {
    void drive();
}

interface Pos extends CarV1, AirplaneV1 {

}

class Kin implements Pos {
    @Override
    public void drive() {
        System.out.println("Kin drive");
    }
}

public class prt240507 {
    public static void main(String[] args) {
        Kin k = new Kin();
        k.drive();
    }
}
