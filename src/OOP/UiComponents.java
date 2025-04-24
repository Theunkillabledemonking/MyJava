package src.OOP;


import java.util.List;
import java.util.ArrayList;


abstract class Component {
    abstract void render();
}

class Button extends Component {
    void render() {
        System.out.println("버튼 그리기");
    }
}

class TextBox extends Component {
    void render() {
        System.out.println("텍스트박스 그리기");
    }
}

class Label extends Component {
    void render() {
        System.out.println("라벨 그리기");
    }
}


public class UiComponents {
    public static void main(String[] args) {

        List<Component> uiList = new ArrayList<>();
        uiList.add(new Button());
        uiList.add(new TextBox());
        uiList.add(new Label());

        for (Component c : uiList) {
            c.render(); // Button, TextBox, Lable
        }

    }
}
