package src.OOP;

import org.w3c.dom.ls.LSOutput;

class BAR {
    static class FFF {

    }
}

interface bracket { void prt(); }

class Outer {
    bracket getObject() {
        class Test implements bracket {
            public void prt() {}
        }

        Test test = new Test();

        return test;
    }
}

public class prt250528 {
    public static void main(String[] args) {
        bracket b = new Outer().getObject();
        b.prt();

        BAR.FFF fff = new BAR.FFF();
        //BAR.FFF fff = new BAR().new FFF();

    }
}
