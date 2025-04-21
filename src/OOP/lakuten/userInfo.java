package src.OOP.lakuten;

import src.OOP.gsc.GscStudent;

class YjuStudent extends GscStudent { // 다른패키지로 상속
    void toSomething() {
        int temp = x * 2;
        System.out.println(getX(temp));
    }
}
public class userInfo {
    public static void main(String[] args) {
        //src.OOP.gsc.MainTest t = new src.OOP.gsc.MainTest();

        //GscStudent mainTest = new GscStudent(); // protected로 선언이 안되어있기 떄문에 사용 불가
        YjuStudent yju = new YjuStudent(); //  GscStudent에서 상속받은 클래스라서 사용 가능

    }
}
