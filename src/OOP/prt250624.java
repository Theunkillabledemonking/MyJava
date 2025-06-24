package src.OOP;

abstract class Product {
    abstract void use();
}

class Book extends Product {
    void use() {
        System.out.println("책 읽어!");
    }
}

class ProductFactory {
    static Product create(String type) {
        if (type.equals("book")) return new Book();
        return null;
    }
}

public class prt250624 {
    public static void main(String[] args) {

    }
}
