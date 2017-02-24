import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 24.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        final String keyboard = "qwertyuiopasdfghjklzxcvbnmq";
        System.out.println(keyboard.charAt(keyboard.indexOf(new Scanner(System.in).next()) + 1));
    }
}