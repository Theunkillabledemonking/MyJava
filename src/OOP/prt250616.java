package src.OOP;
import java.util.ArrayList;
import java.util.function.Consumer;

class Person {
    String name;
    int age;
    Person(String name, int age) { this.name=name; this.age=age; }
}
public class prt250616 {

    public static void main(String[] args) {


        // Collection FrameWork : package for Data Structures

        // 리스트 = 파이썬의 리스트랑 동일함.
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("Yon", 21));
        list.add(new Person("Jane", 31));
        list.add(new Person("Tack", 41));
        list.add(new Person("Quil", 51));

        Consumer<Person> prt  = (obj) -> System.out.println(obj.name + ":" + obj.age);
        list.stream()
                .filter((obj) -> obj.age > 30)
                .forEach(prt);


        Integer maxValue = 10;
        Float myFloat = 5.0f;
        Double myDouble = 5.0;
        Byte myByte = Byte.valueOf((byte)1);
        Short myShort = Short.valueOf((short)1);

    }
}
