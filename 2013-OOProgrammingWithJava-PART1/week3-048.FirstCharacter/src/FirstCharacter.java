
import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();

        System.out.println(firstCharacter(name));
    }

    // do here the method
    public static char firstCharacter(String text) {
        return text.charAt(0);
    }

}
