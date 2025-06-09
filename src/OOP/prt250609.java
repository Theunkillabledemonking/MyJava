package src.OOP;

interface Test2 {
    void run() throws Exception; // 예외를 메서드를 호출한 쪽으로 위임이 가능케끔, 없으면 자손 클래스는 예외를 발생 x
}

class MyClass implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("* ");
                Thread.sleep(500);
            }
        } catch (Exception e) {}
    }
}

//class MyClass1 implements Runnable {
//
//}

public class prt250609 {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        //MyClass1 myClass1 = new MyClass1();
        Thread myThread = new Thread(myClass);

        Thread myThread2 = new Thread(new Runnable() { // 익명 클래스 (1회용)
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("- ");
                        Thread.sleep(500); // 0.5 간격으로 출력
                    }
                } catch (Exception e) {}
            }
        });

        myThread.start();
        myThread2.start();
    }
}
