
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        
        System.out.print("Type a number: "); // 6
        int num1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: "); // 2
        int num2 = Integer.parseInt(reader.nextLine());
        
        int result = num1 + num2;
        System.out.print("Sum of the numbers: " + result); // 8

        // System.out.println(""); // an empty line
        // System.out.println("Sum of the numbers: " + (firstNumber + secondNumber));

    }
}
