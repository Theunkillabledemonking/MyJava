package src.OOP;

class AA {
    int x = 2;
}

class BB extends AA {
    int y = 3;
}

class CC extends AA {
    int z = 4;
}

public class prt240421 {
    public static void main(String[] args) {
        AA bar = new BB();

        if (bar instanceof CC) {
            System.out.println("This is CC");
        } else {
            System.out.println(((BB) bar).y);
        }
    }
}
