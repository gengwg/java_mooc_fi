
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        double firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        double secondNumber = Integer.parseInt(reader.nextLine());
 
        System.out.println(""); // an empty line
        System.out.println("Division: " + firstNumber + " / " + secondNumber 
                + " = " + (firstNumber / secondNumber));
        // System.out.println("Division: " + firstNumber + " / " + secondNumber +
                // " = " + (1.0 * firstNumber / secondNumber));   
    }
}
    