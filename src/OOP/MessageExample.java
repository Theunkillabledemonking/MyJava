package src.OOP;
import java.util.*;
public class MessageExample {
    public static void main(String[] args) {
        Locale locale = Locale.KOREA;
        ResourceBundle bundle = ResourceBundle.getBundle("Messages", locale);

        System.out.println(bundle.getString("greeting")); // hello
        System.out.println(bundle.getString("login.failure"));
    }
}
